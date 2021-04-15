package testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Welcomehomepage {
 
	WebDriver driver= null;
	
public Welcomehomepage(WebDriver driver) {
	
	this.driver=driver;
	
	PageFactory.initElements(driver, this);
	
}
	@FindBy(xpath="//h1[contains(text(),'My account')]")
	
	private WebElement myaccounttext;
	
	public WebElement getmyaccounttext() {
		return myaccounttext;
	}
	
	
	
	
	
	
	
	
}
