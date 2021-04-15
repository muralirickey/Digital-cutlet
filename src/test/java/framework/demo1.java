package framework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class demo1 {
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
  @Test
  public void test2() {
	  System.out.println(" i am from test2");
}
}