package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\automation\\automation\\chromedriver\\chromedriver_win32\\chromedriver.exe");
WebDriver driver;
driver = new ChromeDriver();
driver.get("http://www.google.com");
driver.findElement(By.xpath("//input[@name='q']")).sendKeys("murali rickey");

	}

}
