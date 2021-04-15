package testing;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Createaccount {
	WebDriver driver=null;
public	Createaccount(WebDriver driver){
		
		this.driver= driver;
		PageFactory.initElements(driver, this);
			}

@FindBy(xpath="//input[@id='customer_firstname']")
     private WebElement customer_firstname;
public void setcustomer_firstname(String  val) {
	customer_firstname.sendKeys(val);
}

public WebElement getcustomer_firstname() {
	return customer_firstname;
}

@FindBy(xpath="//input[@id='customer_lastname']")
private WebElement customer_lastname;
 
public void setcustomer_lastname(String val) {
	customer_lastname.sendKeys(val);
}
public WebElement getcustomer_lastname() {
	return customer_lastname;
	
}
@FindBy(xpath="//input[@id='email']")
private WebElement email;
 
public void setemail(String val) {
	email.sendKeys(val);
}
 public WebElement getemail() {
	 return email;
 }
@FindBy(xpath="//input[@id='passwd']")
private WebElement password;

public void setpassword(String val) {
	password.sendKeys(val);
}
public WebElement getpassword() {
	return password;
	
}
@FindBy(xpath="//input[@id='newsletter']")
private WebElement option;
  
public WebElement getoption() {
	return option;
	
}
@FindBy(xpath="//input[@id='optin']")
private WebElement optin;
public WebElement getoptin() {
	return optin;
	
}
@FindBy(xpath="//input[@id='firstname']")
private WebElement firstname;

public void setfirstname(String val) {
	firstname.sendKeys(val);	
}
public WebElement getfirstname() {
	return firstname;
}
@FindBy(xpath="//input[@id='lastname']")
private WebElement lastname;

public void setlastname(String val) {
	lastname.sendKeys(val);
}
public WebElement getlastname() {
	return lastname;
}
@FindBy(xpath = "//input[@id='company']")
private WebElement company;

public void setCompanyname(String Val) {
	company.sendKeys(Val);
}

public WebElement getCompanyname() {
	return company;
}

@FindBy(xpath = "//input[@id='address1']")
private WebElement address1;

public void setAddress1(String Val) {
	address1.sendKeys(Val);
}

public WebElement getAddress1() {
	return address1;
}

@FindBy(xpath = "//input[@id='address2']")
private WebElement address2;

public void setAddress2(String Val) {
	address2.sendKeys(Val);
}

public WebElement getAddress2() {
	return address2;
}

@FindBy(xpath = "//input[@id='city']")

private WebElement city;

public void setCity(String Val) {
	city.sendKeys(Val);
}

public WebElement getCity() {
	return city;
}

@FindBy(xpath = "//input[@id='postcode']")

private WebElement postcode;

public void setPostcode(String Val) {
	postcode.sendKeys(Val);
}

public WebElement getPostcode() {
	return postcode;
}

@FindBy(xpath = "//textarea[@id='other']")

private WebElement other;

public void setOther(String Val) {
	other.sendKeys(Val);
}

public WebElement getOther() {
	return other;
}

@FindBy(xpath = "//input[@id='phone']")

private WebElement phone;

public void setPhone(String Val) {
	phone.sendKeys(Val);
}

public WebElement getPhone() {
	return phone;
}

@FindBy(xpath = "//input[@id='phone_mobile']")

private WebElement phone_mobile;

public void setPhone_mobile(String Val) {
	phone_mobile.sendKeys(Val);

}

public WebElement getPhone_mobile() {
	return phone_mobile;
}

@FindBy(xpath = "//input[@id='alias']")

private WebElement alias;

public void setAlias(String Val) {
	alias.sendKeys(Val);
}

public WebElement getAlias() {
	return alias;
}
	@FindBy(xpath="//select[@id='days']")
	
	private WebElement days;
	
	public void setdays(String val) {
	 days.sendKeys(val);
	}
	public WebElement getdays() {
		return days;
	}
	 @FindBy(xpath="//select[@id='months']")
	 
	 private WebElement months;
	 
	 public void setmonths(String val) {
		 months.sendKeys(val);
	 }
	 
		public WebElement getmonths() {
			return months;
			
		}
	
	@FindBy(xpath="//select[@id='years']")
	private WebElement years;
	
	public void setyears(String val) {
years.sendKeys(val);		
	}
	public WebElement getyears() {
		return years;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}


