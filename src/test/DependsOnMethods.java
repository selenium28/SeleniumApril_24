package test;

import org.testng.annotations.Test;

public class DependsOnMethods {
	
	@Test (dependsOnMethods = "testcaseFive")
	public void testcaseOne() {
		System.out.println("One"); 
	}

	@Test (dependsOnMethods = "testcaseFour")
	public void testcaseTwo() {
		System.out.println("Two"); 
	}

	@Test (dependsOnMethods = "testcaseTwo")
	public void testcaseThree() {
		System.out.println("Three"); 
	}

	@Test (dependsOnMethods = "testcaseOne")
	public void testcaseFour() {
		System.out.println("Four"); 
	}

	@Test 
	public void testcaseFive() {
		System.out.println("Five"); 
	}
}
