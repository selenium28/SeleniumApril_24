package para;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NormalParametrization {
	WebDriver driver;

	String browser = "firefox";

	@Test
	public void loginTest() {
		if (browser.equals("chrome")) {
			driver = new ChromeDriver();

		} else if(browser.equals("firefox")){
			driver = new FirefoxDriver();
		}

		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}
}
