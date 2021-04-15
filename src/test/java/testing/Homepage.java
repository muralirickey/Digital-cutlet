package testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	WebDriver driver=null;
	
	public Homepage(WebDriver driver){
		 this.driver = driver;
		 PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//input[@id='search_query_top']")
	
	private WebElement search;
	 
	public void setsearch( String val) {
		search.sendKeys(val);
	}
public WebElement getsearch() {
	return search;
}
	@FindBy(xpath="(//a[contains(text(),'Contact us')])[1]")
	
	private WebElement contactus;
	 
	public WebElement getcontactus() {
		return contactus;
	}
	
	@FindBy(xpath="//a[contains(text(),'Sign in')][1]")
	private WebElement signin;
	
	public WebElement getsigin() {
		return signin;
	}
	
	@FindBy(xpath="//button[@name='submit_search']")
	private WebElement searchbutton;
	
	 public WebElement getsearchbutton() {
		 return searchbutton;
	 }
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

