package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getdata {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\automation\\automation\\chromedriver\\chromedriver_win32\\chromedriver.exe");
WebDriver driver;
driver= new ChromeDriver();
driver.get("http://www.automationpractice.com");
driver.findElement(By.partialLinkText("Sign in")).click();
   
   
driver.navigate().back();

driver.navigate().forward();

 driver.navigate().refresh();
 





	}

}
