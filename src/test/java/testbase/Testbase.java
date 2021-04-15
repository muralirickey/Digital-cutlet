package testbase;



	import java.io.File;
import java.io.FileInputStream; 
	//import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.util.Properties;
	import java.util.concurrent.TimeUnit;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.support.events.EventFiringWebDriver;
	import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import excel.ExcelReader;
import testing.Contactuspage;
	import testing.Createaccount;
	import testing.Homepage;
import testing.Welcomehomepage;
import testing.signup;
	import project_listeners.WebEvents;
	
	public class Testbase {
		
	  static WebDriver driver;
	  
	    protected Contactuspage contactusobj;
	    
	    protected Homepage homepageobj;
	    protected Createaccount createaccountobj;
	    protected signup signupobj;
	    protected Welcomehomepage welcomehomepageobj;
	    public Properties prop;
	    public FileInputStream fis;
	    
	 public   ExcelReader datatable = null;

	 public static ExtentReports extent;
	 public static ExtentTest logger;


	@BeforeMethod(groups= { "smoketesting ","regressiontesting"})

	public void beforeMethod() throws IOException {
		
		datatable = new ExcelReader(System.getProperty("user.dir")+"\\src\\main\\resources\\Book1.xlsx");
		
		prop = new Properties();
		fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\resources\\config.properties");
				
		prop.load(fis);
		
		if(prop.getProperty("browser").equals("chrome")) {
			  System.setProperty("webdriver.chrome.driver" , "C:\\automation\\automation\\chromedriver\\chromedriver_win32\\chromedriver.exe"); 
		  	  driver = new ChromeDriver();
		} 
		else if(prop.getProperty("browser").equals("edge")) {
			System.setProperty("webdriver.edge.driver",  "C:\\automation\\automation\\chromedriver\\edgedriver_win64\\msedgedriver.exe");
					driver = new EdgeDriver();
		}
		else if (prop.getProperty("browser").equals("firefox")) {
			System.setProperty("webdriver.gecko.driver" , "C:\\automation\\automation\\chromedriver\\edgedriver_win64\\geckodriver-v0.29.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		}
		
		else {
			System.out.println("browser is not found");
			System.exit(0);
		}
		
		WebEvents ecapture = new WebEvents();
		
		EventFiringWebDriver eventDriver = new EventFiringWebDriver(driver);
		
		eventDriver.register(ecapture);
		
			
			eventDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			eventDriver.navigate().to("http://www.automationpractice.com");
			
			contactusobj =new Contactuspage(eventDriver);
			
			homepageobj =new Homepage(eventDriver);
			
			createaccountobj=new Createaccount(eventDriver);
			
			signupobj =new signup(eventDriver);
			
			welcomehomepageobj = new Welcomehomepage(eventDriver);
	}

	@AfterMethod(groups= { "smoketesting ","regressiontesting"})
	public void closeBrowser() {
		driver.quit();
		extent.endTest(logger);
		extent.flush();
	}

	@BeforeTest(groups= { "smoketesting ","regressiontesting"})
	public void testbefore() {
		extent = new ExtentReports(System.getProperty("user.dir")+"\\report.html", true);
		extent.loadConfig(new File(System.getProperty("user.dir")+"\\target\\Config\\extent-config.xml"));
	}

	@AfterTest(groups= { "smoketesting ","regressiontesting"})
	public void testafter() {
		extent.close();
	}
	}
		  