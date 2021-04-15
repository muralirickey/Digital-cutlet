package framework;

//import static org.testng.Assert.assertEquals;

//import  org.testng.Assert.assertEquals;

//import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
//import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class validateweb {
	WebDriver driver;
  @Test
  public  void valid() throws InterruptedException {
	  
	  
	  String gettitle="My Store";
	  
	   String tittle = driver.getTitle();
	   
		 Assert.assertEquals(gettitle,  tittle);
		 
 System.out.println("tittle of homepage"+ tittle);
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
}
