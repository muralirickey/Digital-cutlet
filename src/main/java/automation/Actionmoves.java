package automation;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionmoves {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver" , "C:\\automation\\automation\\chromedriver\\chromedriver_win32\\chromedriver.exe" );
WebDriver driver;
driver = new ChromeDriver();
 driver.navigate().to("http://www.automationpractice.com");
	
	Actions act =new Actions(driver);
	WebElement link= driver.findElement(By.linkText("WOMEN"));
	
	act.moveToElement(link).build().perform();
	driver.findElement(By.xpath("(//a[text()='Casual Dresses'])[1]")).click();
	
	 Thread.sleep(2000);
	 
		driver.close(); 
		
	
	
	

  	
}
}
