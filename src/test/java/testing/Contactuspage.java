package testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contactuspage {
	
	WebDriver driver=null;
	
	public Contactuspage(WebDriver driver){
		 
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//h1[contains(text(),'Customer service - Contact us')]")
	private WebElement text;
	 
	public WebElement gettext() {
		return text;
		
		
		
	}
	
}

