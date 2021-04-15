package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Linktext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver" , "C:\\automation\\automation\\chromedriver\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		 driver.navigate().to("http://www.automationpractice.com");
			
		 String pageName = "CASUAL DRESSES ";
		    
		  	Actions act = new Actions(driver);
			
			WebElement link = driver.findElement(By.xpath("//a[text()='Women']"));
			
			act.moveToElement(link).build().perform();
			
			driver.findElement(By.xpath("(//a[text()='Casual Dresses'])[1]")).click();
			
			String nameOfCasualDressPage = driver.findElement(By.xpath("(//span[contains(text(),'Casual Dresses')])[2]")).getText();
			
	if(pageName.equals(nameOfCasualDressPage)) {
		System.out.println("hi");
	}
	else {
		System.out.println("hello");
	}
	}

}
