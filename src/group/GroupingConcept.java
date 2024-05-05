package group;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class GroupingConcept {

	@Test (groups = "Smoke")
	public void testCaseOne() {
		System.out.println("Smoke - testCaseOne");
	}

	@Test (groups = "Smoke")
	public void testCaseTwo() {
		System.out.println("Smoke - testCaseTwo");
	}

	@Test (groups = {"Regression", "Smoke"})
	public void testCaseThree() {
		System.out.println("Smoke-Regression - testCaseThree");
	}

	@Test (groups = {"Regression", "Smoke"})
	public void testCaseFour() {
		System.out.println("Regression-Smoke - testCaseFour");
	}

	@Test (groups = "Regression")
	public void testCaseFive() {
		System.out.println("Regression - testCaseFive");
	}

	@Test (groups = "Regression")
	public void testCaseSix() {
		System.out.println("Regression - testCaseSix");
	}

}
