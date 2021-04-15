package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datafromstore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\automation\\automation\\chromedriver\\chromedriver_win32\\chromedriver.exe");
	String homepagetitle = "My Store";
	WebDriver driver;
	 driver=new ChromeDriver();
	 
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 driver.navigate().to("http://www.automationpractice.com");
	 
	 String tittle=driver.getTitle();
	 System.out.println("current web page tittle" + tittle);
	 
	 if(homepagetitle.equals(tittle)) {
		 System.out.println("tittle is pass");
	 }
	 else {
		 System.out.println("tittle is fail");
	 }
	 String webpageurl=driver.getCurrentUrl();
	 System.out.println("url is " + webpageurl);
	 
	 String pagesourcecode= driver.getPageSource();
	 System.out.println("pagesource code"+ pagesourcecode);
	 
	}
	

}
