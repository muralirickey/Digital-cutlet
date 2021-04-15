package framework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class demo3 {
  @Test
  public void test1() {

		  System.out.println(" i am from test1");
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
  @Test
  public void test2() {

		  System.out.println(" i am from test2");
}
  @Test
  public void test3() {

		  System.out.println(" i am from test3");
		  
  }
}
		  
		  
		  
		  
		  