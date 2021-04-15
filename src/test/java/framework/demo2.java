package framework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class demo2 {
  @Test
  public void test1() {
	  System.out.println(" i am from test1");
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

}}
