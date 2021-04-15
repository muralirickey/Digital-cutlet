package testcases;

//import static org.testng.Assert.assertEquals;

import org.testng.Assert;

import org.testng.annotations.Test;


import testbase.Testbase;;

public class Homepagetestcase extends Testbase {
@Test(groups= {"homepagetes","regressiontesting"})
void contactus_01() throws InterruptedException {
	String contactuspagetext="CUSTOMER SERVICE - CONTACT US";
	
	homepageobj.getcontactus().click();
	Thread.sleep(5000);
	String textweb = contactusobj.gettext().getText();
	
	Assert.assertTrue(contactuspagetext.equals(textweb));
	
	
}
@Test(groups= {"homepagetes" , "smoketesting ","regressiontesting"})
void validsignup() throws InterruptedException {
	
	String hi="AUTHENTICATION";
	
	homepageobj.getsigin().click();
	Thread.sleep(5000);
	String hello= signupobj.getSignInPageText().getText();
	
	Assert.assertTrue(hi.equals(hello));
	System.out.println("textfromweb"+ hello);
	
}
}
