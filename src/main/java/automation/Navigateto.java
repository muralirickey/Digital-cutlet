package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigateto {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\automation\\automation\\chromedriver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver;
	driver =new ChromeDriver();
	driver.navigate().to("http://www.automationpractice.com.");
	
	driver.findElement(By.partialLinkText("Sign in")).click();

	 driver.findElement(By.xpath("//input[@name='email_create']")).sendKeys("muralirickey143@gmail.com");
	 
	 driver.findElement(By.xpath("//button[@id='SubmitCreate']")).click();
	 
	
	
	Thread.sleep(4000);
	
	driver.navigate().back();
	 Thread.sleep(2000);
	
	 driver.navigate().forward();
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//input[@id='email']")).sendKeys("muralirickey143@gmail.com");

	 driver.navigate().refresh();
	}
	

}
