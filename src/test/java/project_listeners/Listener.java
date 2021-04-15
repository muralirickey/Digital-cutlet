package project_listeners;

import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import testcases.Logtest;

public class Listener implements ITestListener {
	
	
	public Logger log = LogManager.getLogger(Logtest.class.getName());
	
	public void onTestStart(ITestResult result) { //called
		// TODO Auto-generated method stub
		
		
		
		
		log.info("Test is Started");
	}

	public void onTestSuccess(ITestResult result) { //called
		// TODO Auto-generated method stub
		log.info("Test is Success");
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		log.error("Test is Failed");
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		log.info("Test is Skipped");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		log.info("onTestFailedButWithinSuccessPercentage");
	}

	public void onStart(ITestContext context) { //called
		// TODO Auto-generated method stub
		log.info("On Start");
	}

	public void onFinish(ITestContext context) { //called
		// TODO Auto-generated method stub
		log.info("On Finish");
	}
		
}

