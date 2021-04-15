package framework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class demo5 {
  @Test
  public void test1() {
	  System.out.println(" i am from test1");
  }
  @Test
  public void test2() {
	  System.out.println(" i am from test2");
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println(" i am from beforemethod");
	  
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println(" i am from aftermethod");
	  
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println(" i am from beforeclass");
	  
  }

  @AfterClass
  public void afterClass() {
	  System.out.println(" i am from afterclass");
	  
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println(" i am from beforetest");
	  
  }

  @AfterTest
  public void afterTest() {
	  System.out.println(" i am from aftertest");
	  
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println(" i am from beforesuite");
	  
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println(" i am from aftersuite");
	  
  }

}
