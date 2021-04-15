package mozilla;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.GeckoDriverInfo;

public class Firefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver" , "C:\\automation\\automation\\chromedriver\\edgedriver_win64\\geckodriver-v0.29.0-win64\\geckodriver.exe");
	WebDriver driver;
	
	driver = new FirefoxDriver();
	
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	 driver.navigate().to("http://www.automationpractice.com");
	 
	 String tittle=driver.getTitle();
	 System.out.println("current web page tittle" + tittle);
	 
	}
	

}
