package SeleniumWebdriver;

import java.util.concurrent.TimeUnit;

import org.apache.hc.core5.util.Asserts;
import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;



public class VerifyPasswordRequiredField {
	

	public static void main(String[] args) {
		
		
		
		// Create a new instance of the Chrome driver
	    WebDriver driver = new ChromeDriver();

        // Navigate to the website
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        
        driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	   // Enter username
	     driver.findElement(By.xpath("//input[contains(@placeholder,'Username')]")).sendKeys("admin");
	    
	    // click on Login button
	    driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	    
	    String ActualPwdRequired = driver.findElement(By.xpath(" //input[@placeholder='Password']//following::span[1]")).getText();
	    
	 // Verify that the 'Required' text is present below password
	    if (ActualPwdRequired.contains("Required")) {
	      System.out.println("The Required text is present on blank input on Password field");
	    } else {
	      System.out.println("The Required text is not present");
	    }

	}
}
