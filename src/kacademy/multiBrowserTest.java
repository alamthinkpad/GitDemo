package kacademy;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class multiBrowserTest {
	
	@Test
	public void titleCheck() throws MalformedURLException
	{
		MutableCapabilities caps = new MutableCapabilities();
		
		WebDriver driver = new RemoteWebDriver(new URL("https://automate.browserstack.com/dashboard/v2/quick-start/get-started"), caps);
		driver.get("https://www.youtube.com/");
		Assert.assertTrue(driver.getTitle().matches("YouTube"));
		System.out.println(driver.getTitle());
		
	}

}
