package SeleniumWebdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;


public class HRMInvalidLogin {

	public static void main(String[] args) throws InterruptedException {
		
		// Create a new instance of the Chrome driver
	    WebDriver driver = new ChromeDriver();

        // Navigate to the website
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        
        driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Enter username
	     driver.findElement(By.xpath("//input[contains(@placeholder,'Username')]")).sendKeys("admin");
	     
	    // Enter password
	     driver.findElement(By.xpath("//input[contains(@placeholder,'Password')]")).sendKeys("mukesh");
	     
	    // click on Login button
	     driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	     
	   // 
	     
	   String Alertmsg =  driver.findElement(By.xpath("//div[@role='alert']")).getText();
	     
	  // Verify that the alert contains 'Invalid credentials'
		    if (Alertmsg.contains("Invalid credentials")) {
		      System.out.println("alert contains 'Invalid credentials'");
		    } else {
		      System.out.println("alert does not contains 'Invalid credentials'");
		    }
	}

}
