package SeleniumWebdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyPageLogo {

	public static void main(String[] args) {
		 
	    // Create a new instance of the Chrome driver
	    WebDriver driver = new ChromeDriver();

	    // Use the driver to open the OrangeHRM Live demo site
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	    WebElement logoElement = driver.findElement(By.cssSelector(".orangehrm-login-branding"));
	      
	    if (logoElement.isDisplayed()) {
	      System.out.println("The logo is present on the page");
	    } else {
	      System.out.println("The logo is not present on the page");
	    }

	    // Close the browser
	    driver.close();
	  }
	}

