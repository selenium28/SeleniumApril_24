package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class BeforeMethodConcept {
	
  @Test (priority = 1)
  public void TestCaseOne() {
	  System.out.println("TestCaseOne");
  }
  
  @Test (priority = -2)
  public void TestCaseTwo() {
	  System.out.println("TestCaseTwo");
  }
  
  @Test (priority = 0)
  public void TestCaseThree() {
	  System.out.println("TestCaseThree");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Method");
  }

}
