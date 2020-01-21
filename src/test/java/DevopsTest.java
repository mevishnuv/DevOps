

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DevopsTest {
	WebDriver driver;

	@Test
	public void openBrowser() throws InterruptedException {
		driver.get("https://www.google.com");
//comment
		Assert.assertEquals(driver.getTitle(), "Google");

	}

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.ie.driver", "src\\test\\resources\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
	}

	@AfterTest
	public void afterTest() {
		driver.close();

	}

}