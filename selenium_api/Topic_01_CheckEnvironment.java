package selenium_api;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Topic_01_CheckEnvironment {
	WebDriver driver;

	@Test
	public void Check_title_01() {
		String homeTitle = driver.getTitle();
		//Assert.assertEquals(homeTitle, "Google");
		System.out.println("print" + homeTitle);
	}

	@BeforeClass
	public void beforeClass() {
		// driver = new FirefoxDriver();
		// driver.get("https://www.google.com/");
		System.setProperty("webdriver.chrome.driver", ".\\libs\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
