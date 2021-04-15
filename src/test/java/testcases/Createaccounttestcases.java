package testcases;

//import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;


import com.relevantcodes.extentreports.LogStatus;

//import automation.Navigateto;
import testbase.Testbase;

public class Createaccounttestcases extends Testbase {
	
@Test(groups= {"createaccount" , "smoketesting ","regressiontesting" })
 
public void account_012() throws InterruptedException {
	 
	  String TestcaseId = new Object() {}.getClass().getEnclosingMethod().getName();
	  
	  logger = extent.startTest(TestcaseId, "test1 i am running");
	  
	  logger.log(LogStatus.INFO, "execution started");
	  
	
	
	homepageobj.getsigin().click();
	
	signupobj.setemail("muralirickey013@gmail.com");
	
	
	signupobj.getsubmitbutton1().click();
	
	Thread.sleep(5000);
	
	createaccountobj.setcustomer_firstname("murali");
	
	createaccountobj.setcustomer_lastname("rickey");
	
	createaccountobj.setpassword("123456");
	
	createaccountobj.getoption().click();
	createaccountobj.setPostcode("502001");
	
	createaccountobj.setCity("sangareddy");
	
	createaccountobj.setAddress1("i wont give my address");
createaccountobj.setAddress2("address2 also i wont share pls dont ask my address again");
createaccountobj.setPhone("9100143916");

createaccountobj.setPhone_mobile("7702607573");

createaccountobj.setCompanyname("rickey imports and exports");

createaccountobj.setdays("1  ");
Thread.sleep(3000);
createaccountobj.setyears("2017  ");
Thread.sleep(3000);
createaccountobj.setmonths("April ");


}

@Test(groups= {"createaccount" ,"regressiontesting"})

public void account_013() throws InterruptedException {
	 
	  String TestcaseId = new Object() {}.getClass().getEnclosingMethod().getName();
	  
	  logger = extent.startTest(TestcaseId, "test1 i am running");
	  
	  logger.log(LogStatus.INFO, "execution started");
	  
	homepageobj.getsigin().click();
	
	signupobj.setemail("abhinaya@gmail.com");
	
	
	signupobj.getsubmitbutton1().click();
	
	Thread.sleep(5000);
	
	createaccountobj.setcustomer_firstname("murali");
	
	createaccountobj.setcustomer_lastname("rickey");
	
	createaccountobj.setpassword("123456");
	
	createaccountobj.getoption().click();
	createaccountobj.setPostcode("502001");
	
	createaccountobj.setCity("sangareddy");
	
	createaccountobj.setAddress1("i wont give my address");
createaccountobj.setAddress2("address2 also i wont share pls dont ask my address again");
createaccountobj.setPhone("9100143916");

createaccountobj.setPhone_mobile("7702607573");

createaccountobj.setCompanyname("rickey imports and exports");

createaccountobj.setdays("1  ");
Thread.sleep(3000);
createaccountobj.setyears("2017  ");
Thread.sleep(3000);
createaccountobj.setmonths("April ");


}
@Test(groups= {"createaccount" , "smoketesting ","regressiontesting"})

public void account_0123() throws InterruptedException {
	 
	  String TestcaseId = new Object() {}.getClass().getEnclosingMethod().getName();
	  
	  logger = extent.startTest(TestcaseId, "test1 i am running");
	  
	  logger.log(LogStatus.INFO, "execution started");
	  
	homepageobj.getsigin().click();
	
	signupobj.setemail("muralirickey3214@gmail.com");
	
	
	signupobj.getsubmitbutton1().click();
	
	Thread.sleep(5000);
	
	createaccountobj.setcustomer_firstname("muralii");
	
	createaccountobj.setcustomer_lastname("rickkey");
	
	createaccountobj.setpassword("16");
	
	createaccountobj.getoption().click();
	createaccountobj.setPostcode("502001");
	
	createaccountobj.setCity("reddy");
	
	createaccountobj.setAddress1("wont give my address");
createaccountobj.setAddress2(" also i wont share pls dont ask my address again");
createaccountobj.setPhone("90143916");

createaccountobj.setPhone_mobile("7702607573");

createaccountobj.setCompanyname("rickey imports and exports");

createaccountobj.setdays("1  ");
Thread.sleep(3000);
createaccountobj.setyears("2017  ");
}
}
