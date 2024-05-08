package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionConcept {
	@Test
	public void Login() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("student");

		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("Password123");

		WebElement submitButton = driver.findElement(By.id("submit"));
		submitButton.click();
		
		String expectedTitle = "Logged In | Practice Test Automation";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle, " Title has not matched ");

	}
}
