package SeleniumWebdriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyPageIcons {

	public static void main(String[] args) {
		 
	    // Create a new instance of the Chrome driver
	    WebDriver driver = new ChromeDriver();

	    // Use the driver to open the OrangeHRM Live demo site
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	    
	 // Find the footer element
	    WebElement footer_icons = driver.findElement(By.xpath("//div[@class='orangehrm-login-footer-sm']"));

	    int numIcons = 
	    footer_icons.findElements(By.xpath("//div[@class='orangehrm-login-footer-sm']/a")).size();
	    
        if (numIcons == 4) {
            System.out.println("Footer has four social media icons");
        } else {
            System.out.println("Footer does not have four social media icons");
        }
	  	
	    // Close the browser
	    driver.quit();
	  }
	}

	
	
	

