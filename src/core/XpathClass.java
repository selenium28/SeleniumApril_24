package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathClass {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//NormalXapth
		driver.findElement(By.xpath("//input[@type='text']"));
		
		//Text Xapth
		driver.findElement(By.xpath("//button[text()='Log in']"));
		driver.findElement(By.xpath("//*[text()='Create new account']"));
		
		//Following xpath
		driver.findElement(By.xpath("//label[text()='Username']//following::input[1]"));
		
		//Preceding xPath
		driver.findElement(By.xpath("//label[text()='Confirm Password']//preceding::input[1]"));
		
		//And Xpath
		driver.findElement(By.xpath("//input[@autocomplete='off' and @fdprocessedid='rmn09']"));
		
		//OR & indexing xpath
		driver.findElement(By.xpath("(//input[@fdprocessedid='uivx0q' or @type='password'])[2]"));		

	}

}
