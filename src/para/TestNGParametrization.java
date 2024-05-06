package para;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParametrization {
	WebDriver driver;

//	String browser = "firefox";
//  Parameters pass the parameter just once per execution.
	@Parameters("browser")
	@Test
	public void loginTest(String browser) {
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
