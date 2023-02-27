package SeleniumWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyUrlEndsWith{

	public static void main(String[] args) {
	 
	    // Create a new instance of the Chrome driver
	    WebDriver driver = new ChromeDriver();

	    // Use the driver to open the OrangeHRM Live demo site
	    driver.get("https://opensource-demo.orangehrmlive.com/");

	    // Get the URL of the current page
	    String currentUrl = driver.getCurrentUrl();

	    // Verify that the URL ends with "login"
	    if (currentUrl.endsWith("login")) {
	      System.out.println("The URL ends with 'login'.");
	    } else {
	      System.out.println("The URL does not end with 'login'.");
	    }

	    // Close the browser
	    driver.close();
	  }

	}

