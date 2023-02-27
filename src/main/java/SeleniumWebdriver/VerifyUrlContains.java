package SeleniumWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class VerifyUrlContains {

	public static void main(String[] args) {
		 
	    // Create a new instance of the Chrome driver
	    WebDriver driver = new ChromeDriver();

	    // Use the driver to open the OrangeHRM Live demo site
	    driver.get("https://opensource-demo.orangehrmlive.com/");

	    // Get the URL of the current page
	    String currentUrl = driver.getCurrentUrl();

	    // Verify that the URL contains with "demo"
	    
	    if (currentUrl.contains("demo")) {
	      System.out.println("The URL contains the string 'demo'");
	    } else {
	      System.out.println("The URL does not contains the string 'demo'");
	    }
	    
	    
	    // Close the browser
	    driver.close();
	  }

	}

