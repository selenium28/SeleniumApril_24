package parallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelLoginn {
	
	@Test
	public void testCaseOne() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.selenium.dev/downloads/");
		driver.manage().window().maximize();
	}

}
