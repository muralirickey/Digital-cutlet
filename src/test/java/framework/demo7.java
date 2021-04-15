package framework;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class demo7 {
	WebDriver driver;
	
  @Test(priority=2)
  public void b() {
		String phonenumber= driver.findElement(By.xpath("//strong[text()='0123-456-789']")).getText();
		System.out.println("phonenumber" + phonenumber);
		
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.setProperty("webdriver.chrome.driver" , "C:\\automation\\automation\\chromedriver\\chromedriver_win32\\chromedriver.exe"); 
	  
	  driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.navigate().to("http://www.automationpractice.com");
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
	  
  }
  @Test(priority=1)
  public void a() {
	  driver.get("http://www.google.com");
	  driver.findElement(By.xpath("//input[@name='q']")).sendKeys("murali rickey");

	  
	  
  }
  @Test(priority=3)
  public void c() throws InterruptedException {
	  Thread.sleep(3000);
	  String homepagetitle = "My Store"; 
  
	  String tittle=driver.getTitle();
		 System.out.println("current web page tittle" + tittle);
		 
		 if(homepagetitle.equals(tittle)) {
			 System.out.println("tittle is pass");
		 }
		 else {
			 System.out.println("tittle is fail");
		 }
}
}












