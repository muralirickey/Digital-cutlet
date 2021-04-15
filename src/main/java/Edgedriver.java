import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edgedriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver",  "C:\\automation\\automation\\chromedriver\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver;
		driver = new EdgeDriver();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.navigate().to("http://www.automationpractice.com");
		 
		 String tittle=driver.getTitle();
		 System.out.println("current web page tittle" + tittle);
		 
	}

}
