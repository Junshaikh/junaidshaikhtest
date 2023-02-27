package SeleniumWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ParallelExecutionTestNG {
	
	WebDriver driver;
	
	@Test(priority=1)
	public void testChromebrowser() {
		driver = new ChromeDriver();
	    driver.get("https://opensource-demo.orangehrmlive.com/");

       String title = driver.getTitle();
     // Verify that the URL title is "HRM"
	   Assert.assertEquals(title.contains("HRM"), true);
       driver.close();
	}
	
	@Test(priority=2)
	public void testFirefoxbrowser() {
		driver = new FirefoxDriver();
	    driver.get("https://opensource-demo.orangehrmlive.com/");

       String title = driver.getTitle();
     // Verify that the URL title is "HRM"
	   Assert.assertEquals(title.contains("HRM"), true);
       driver.close();
	}
	
	@Test(priority=3)
	public void testSafaribrowser() {
		driver = new SafariDriver();
	    driver.get("https://opensource-demo.orangehrmlive.com/");

       String title = driver.getTitle();
     // Verify that the URL title is "HRM"
	   Assert.assertEquals(title.contains("HRM"), true);
	    driver.close();
	}
}
