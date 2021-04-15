package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Actionmouse2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver" , "C:\\automation\\automation\\chromedriver\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver;
		driver = new ChromeDriver();
		 driver.navigate().to("http://www.automationpractice.com");
		 
		
			   driver.findElement(By.partialLinkText("Faded Short Sleeve T-shirts")).click();
			   Thread.sleep(3000);
			   driver.findElement(By.xpath("//a[@class='btn btn-default button-plus product_quantity_up']")).click();
			   Thread.sleep(3000);
driver.findElement(By.xpath("//button[@class='exclusive']")).click();
	}

}
