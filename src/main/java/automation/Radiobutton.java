package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Radiobutton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\automation\\automation\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("http://www.automationpractice.com");
		
 
driver.findElement(By.partialLinkText("Sign in")).click();

 driver.findElement(By.xpath("//input[@name='email_create']")).sendKeys("muralirickey143@gmail.com");
 Thread.sleep(5000);
 driver.findElement(By.xpath("//button[@id='SubmitCreate']")).click();
 
 Thread.sleep(5000);
	
driver.findElement(By.xpath("//input[@id='id_gender1']")).click();
 
 driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys("Santosh");
	driver.findElement(By.xpath("//input[@id='customer_lastname']")).sendKeys("Kumar");
	driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("123456");
	
	driver.findElement(By.xpath("//select[@id='days']")).sendKeys("1  ");
	
	Select month = new Select(driver.findElement(By.xpath("//select[@id='months']")));
	month.selectByVisibleText("February ");
		Thread.sleep(5000);
	month.selectByValue("4");
		Thread.sleep(5000);
	month.selectByIndex(5);
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//select[@id='years']")).sendKeys("2021");
		
		driver.findElement(By.xpath("//select[@id='id_state']")).sendKeys("14");
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//button[@id='submitAccount']")).click();
		  driver.navigate().refresh();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
