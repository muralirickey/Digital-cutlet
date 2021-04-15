package framework;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeClass;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;

public class demo6 {
	WebDriver driver;
  @Test
  public void test1() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\automation\\automation\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver;
		driver =new ChromeDriver();
		driver.navigate().to("http://www.automationpractice.com.");
		
  }
	
	  
	 
  @BeforeClass
  public void beforeClass() throws InterruptedException {
	  
	System.setProperty("webdriver.chrome.driver", "C:\\automation\\automation\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver;
		driver =new ChromeDriver();
		driver.navigate().to("http://www.automationpractice.com.");
		
		
		
  }

  @AfterClass
  public void afterClass()  {
	  WebDriver driver = new ChromeDriver();
	  driver.navigate().to("http://www.automationpractice.com.");
	  driver.close();
	
  } 
  

  @Test
  public void test2() {
	  System.setProperty("webdriver.chrome.driver", "C:\\automation\\automation\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver;
		driver =new ChromeDriver();
		driver.navigate().to("http://www.automationpractice.com.");
		
		
  }
	  
  }

