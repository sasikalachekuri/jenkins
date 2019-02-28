package Google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Google {
	WebDriver driver;

	@BeforeTest
	public void Setup() {
		driver = new ChromeDriver();
	}

	@Test
	public void method2() {
		driver.get("https:/www.google.com");
		System.out.println(driver.getTitle());

	}

	@AfterTest
	public void TearDown() {
		driver.quit();
	}

}
