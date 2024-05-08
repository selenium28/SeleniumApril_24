package para;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ImplementationDataProvider {

	@Test(dataProvider = "testData")
	public void login(String name, String pass) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys(name);
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys(pass);
		
		WebElement submitButton = driver.findElement(By.id("submit"));
		submitButton.click();
		
	}

	@DataProvider
	public Object[][] testData() {

		Object[][] data = new Object[3][2];
		data[0][0] = "student";
		data[0][1] = "Password123";
		
		data[1][0] = "trdes";
		data[1][1] = "Password123";
		
		data[2][0] = "student";
		data[2][1] = "8uy76t";

		return data;

	}

}
