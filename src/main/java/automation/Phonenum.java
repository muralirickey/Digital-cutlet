package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Phonenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//strong[text()='0123-456-789']
		System.setProperty("webdriver.chrome.driver", "C:\\automation\\automation\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver;
		driver =new ChromeDriver();
		driver.navigate().to("http://www.automationpractice.com.");
		String phonenumber= driver.findElement(By.xpath("//strong[text()='0123-456-789']")).getText();
		System.out.println("phonenumber" + phonenumber);
		
		String gettext =driver.findElement(By.xpath("//div[@id='editorial_block_center']/h1")).getText();
		
		System.out.println(gettext);
		
		driver.findElement(By.linkText("Contact us")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.navigate().back();
		driver.findElement(By.partialLinkText("Sign in")).click();
		driver.navigate().refresh();
		
	}

}
