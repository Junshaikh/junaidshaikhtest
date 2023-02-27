package SeleniumWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

  
public class MyFirstTestNG { 
	
	WebDriver driver;
	
	@Test (priority=1)
	public void teststartbrowser() {
		driver = new ChromeDriver();
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	}
   @Test (priority=2)
	public void verifyTitle() {
	    String title = driver.getTitle();
     // Verify that the URL title is "HRM"
	   Assert.assertEquals(title.contains("HRM"), true);
   }
   @Test (priority=3)
   public void tearDown() {
	    driver.close();
   }
    } 
	


