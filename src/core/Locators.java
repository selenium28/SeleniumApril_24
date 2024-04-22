package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		
//		1. ID
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("student");
		
//		2. Name
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("Password123");
		
//		3. ClassName
		WebElement submitButton = driver.findElement(By.className("btn"));
		submitButton.click();
		
//		4. LinkText
		WebElement homeLink = driver.findElement(By.linkText("Home"));
		homeLink.click();
		
//		5. PartialText
		WebElement practiceLink = driver.findElement(By.partialLinkText("Practi"));
		practiceLink.click();
		
//		6. Tag Name
		WebElement tagName = driver.findElement(By.tagName("a"));
		
//		7. xPath
		WebElement successmsg = driver.findElement(By.xpath("//input[@autocomplete='given-name']"));
		String msg = successmsg.getText();
		
//		8. cssSelector
		WebElement successmsgUsingCss = driver.findElement(By.cssSelector("h1[class='post-title']"));
		String msgcss = successmsgUsingCss.getText();

	}

}
