package kacademy;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class multiBrowserTest2 {
	
	@Test
	public void titleCheckBci() throws MalformedURLException
	{
		MutableCapabilities caps = new MutableCapabilities();
		
		WebDriver driver = new RemoteWebDriver(new URL("https://automate.browserstack.com/dashboard/v2/quick-start/get-started"), caps);
		driver.get("https://cottonplatform.bettercotton.org/login/");
		Assert.assertTrue(driver.getTitle().matches("BCI system"));
		
	}

}
