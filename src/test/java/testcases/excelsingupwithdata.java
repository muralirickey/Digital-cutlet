package testcases;

//import static org.testng.Assert.assertTrue;

//import org.apache.commons.logging.Log;

import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import testbase.Testbase;

public class excelsingupwithdata extends Testbase {
	
	
	public Logger log = LogManager.getLogger(Logtest.class.getName());
	
  @Test(groups= {"login" , "smoketesting ","regressiontesting"})
  public void exceldata () throws InterruptedException {
	  
	  String TestcaseId = new Object() {}.getClass().getEnclosingMethod().getName();
	  
	  logger = extent.startTest(TestcaseId, "test1 i am running");
	  
	  logger.log(LogStatus.INFO, "execution started");
	  
	  
	 int num = datatable.getRowCount("logincred");
	  
	 String username= datatable.getCellData("logincred", "username", 2);
	  
	String password=  datatable.getCellData("logincred", "password", 2);
	 log.info("row num is " + num);
	 log.info("row celldata is " + username);
	 log.info("row celldata2 is " + password);
	  
	  
	  homepageobj.getsigin().click();
	  
	  Thread.sleep(3000);
	  
	  
	  signupobj.setEmailID(username);
	  
	  signupobj.setPassword(password);
	  
	  signupobj.getSubmitButton().click();
	  
	 try {
		 
	 
	  if(welcomehomepageobj.getmyaccounttext().getText().equals("MY ACCOUNT")) {
		  log.info("login sucessfull");
		  
		  Assert.assertTrue(true);
		  logger.log(LogStatus.PASS, "text");
	  }
	 }
		 catch (Exception e) {
			
		 
			log.info("login unsucessfull");  
			logger.log(LogStatus.FAIL, "fail due to xpath");
			
		  }
		  
		  
		  
	  }
  
  
  @Test(groups= {"login" ,"regressiontesting"})
  
  public void exceldata01 () throws InterruptedException {
	  
	  String TestcaseId = new Object() {}.getClass().getEnclosingMethod().getName();
	  
	  logger = extent.startTest(TestcaseId, "test1 i am running");
	  
	  logger.log(LogStatus.INFO, "execution started");
	  
		 int num = datatable.getRowCount("logincred");
		  
		 String username= datatable.getCellData("logincred", "username", 3);
		  
		String password=  datatable.getCellData("logincred", "password", 3);
		 log.info("row num is " + num);
		 log.info("row celldata is " + username);
		 log.info("row celldata2 is " + password);
		  	  
		 homepageobj.getsigin().click();
		  
		  Thread.sleep(3000);
		  
		  
		  signupobj.setEmailID(username);
		  
		  signupobj.setPassword(password);
		  
		  signupobj.getSubmitButton().click();
		  
		 try {
			  if(welcomehomepageobj.getmyaccounttext().getText().equals("MY ACCOUNT")) {
				  log.info("login sucessfull");
				  
				  Assert.assertTrue(true);
				  logger.log(LogStatus.PASS, "text");
			  }
		 }
		 
			  catch(Exception e) {
				log.info("login unsucessfull"); 
				Assert.assertFalse(false);
				logger.log(LogStatus.FAIL, "fail due to xpath");
			  }
			  
			  
			  
		  }
	  
  }
  
  
  
  
  
  
  
  

