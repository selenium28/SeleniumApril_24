package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) {
		String expectedLoginSuccesmsg = "Logged In Successfully";
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("username"));
		username.isDisplayed();
		username.clear();
		username.sendKeys("student");
		System.out.println("Username entered");
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("Password123");
		System.out.println("Password entered");
		
		WebElement submitButton = driver.findElement(By.id("submit"));
		submitButton.click();
		System.out.println("Login Button clicked");
		
		WebElement successmsg = driver.findElement(By.xpath("//*[text()='Logged In Successfully']"));
		String actulLoginmsg = successmsg.getText();
		
		if (expectedLoginSuccesmsg.equals(actulLoginmsg)) {
			System.out.println("Login Succesfull");
		} else {
			System.out.println("Login Not Succesfull");
		}
		
		driver.quit();
	}

}
