package para;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProverClass {
  @Test(dataProvider = "testData")
  public void login(String name, String sirname) {
	  System.out.println("  Name " +name+ " Sirname " +sirname);
  }

  @DataProvider
  public Object[][] testData() {
	  
	  Object[][] data = new Object[3][2];
	  
	  data[0][0] = " Yugal ";
	  data[0][1] = " Tirpude ";
	  
	  data[1][0] = " Rajanikant ";
	  data[1][1] = " Baghwat ";
	  
	  data[2][0] = " Dev ";
	  data[2][1] = " Dubale ";
	  
	  return data;
  }
}
