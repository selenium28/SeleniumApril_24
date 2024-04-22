package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement country = driver.findElement(By.name("country"));
		
		Select s = new Select(country);
		Thread.sleep(3000);
//		s.selectByIndex(7);
//		s.selectByValue("CANADA");
		s.selectByVisibleText("INDIA");

	}

}
