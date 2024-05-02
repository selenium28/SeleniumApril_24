package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class LoginClass {
	WebDriver driver;

	@Test
	public void login() {
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("student");
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("Password123");
		
		WebElement submitButton = driver.findElement(By.id("submit"));
		submitButton.click();
	}
	
	@Test
	public void invaildUsername() {
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("trdff");
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("Password123");
		
		WebElement submitButton = driver.findElement(By.id("submit"));
		submitButton.click();
		
		driver.findElement(By.xpath("//*[text()='Log out']")).isDisplayed();
	}
	
	@Test
	public void invalidPassword() {
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("student");
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("34gehd");
		
		WebElement submitButton = driver.findElement(By.id("submit"));
		submitButton.click();
		
		driver.findElement(By.xpath("//*[text()='Log out']")).isDisplayed();
	}
	
	@BeforeMethod
	public void beforeMethod() {
	    driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
