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

import dev.failsafe.internal.util.Assert;

/*
Capture the url and verify url contains dashboard

Click on image > Click on Logout

		*/

public class HRMClickImage {

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
	     driver.findElement(By.xpath("//input[contains(@placeholder,'Password')]")).sendKeys("admin123");
	     
	    // click on Login button
	     driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	 
	    // get current url
	     String URL = driver.getCurrentUrl();
	     
	    // Verify that the URL title is "HRM"
		    if (URL.contains("dashboard")) {
		      System.out.println("The page url contains the string 'dashboard'");
		    } else {
		      System.out.println("The page url does not contains the string 'dashboard'");
		    }
		    
		 // click on picture Image 
		     driver.findElement(By.xpath("//div[@class='oxd-topbar-header']//img[@alt='profile picture']")).click();
		 
		 // click on logout
		     driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
		     
	}

}
