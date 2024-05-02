package test;

import org.testng.annotations.Test;

public class EnableDisable {
	
  @Test (priority = 1, enabled = true)
  public void testcaseOne() {
	 System.out.println("One"); 
  }
  
  @Test (priority = 2,enabled = true)
  public void testcaseTwo() {
	  System.out.println("Two"); 
  }
  
  @Test (priority = 2, enabled = true)
  public void testcaseThree() {
	  System.out.println("Three"); 
  }
  
  @Test (enabled = true)
  public void testcaseFour() {
	  System.out.println("Four"); 
  }
  
  @Test (enabled = false)
  public void testcaseFive() {
	  System.out.println("Five"); 
  }
  
}
