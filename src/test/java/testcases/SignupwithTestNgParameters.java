package testcases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import testbase.Testbase;

public class SignupwithTestNgParameters extends Testbase {
  @Test
  @Parameters({"username","password"})
  public void testngparameters(String uname , String passd) {
	  
	  homepageobj.getsigin().click();
	  
	  signupobj.setEmailID(uname);
	  
	  signupobj.setPassword(passd);
	  
	  signupobj.getSubmitButton().click();
	  
	  
	  
  }
}
