package parallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelLogin {

	@Test
	public void testCaseOne() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/downloads/");
		driver.manage().window().maximize();
	}

}
