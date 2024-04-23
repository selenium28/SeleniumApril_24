package core;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpHandling {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		
		WebElement cusID = driver.findElement(By.name("cusid"));
		cusID.sendKeys("5434");
		
		WebElement submitButton = driver.findElement(By.xpath("//input[@type='submit']"));
		submitButton.click();
		
//		Alert - interface in selenium
		Alert alert = driver.switchTo().alert();
		String popmsg = alert.getText();
		Thread.sleep(3000);
		System.out.println("Popup get Message: "+popmsg);
		alert.accept();	
		System.out.println("1st Popup handled");
		Thread.sleep(3000);
//		alert.dismiss();
		alert.accept();
		System.out.println("2nd Popup handled");
		
	}

}
