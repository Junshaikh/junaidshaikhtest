package SeleniumWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyUrlTitle {

	public static void main(String[] args) {
		 
	    // Create a new instance of the Chrome driver
	    WebDriver driver = new ChromeDriver();

	    // Use the driver to open the OrangeHRM Live demo site
	    driver.get("https://opensource-demo.orangehrmlive.com/");

	    // Get the title of the URL
	    String title = driver.getTitle();

	    // Verify that the URL title is "HRM"
	    if (title.contains("HRM")) {
	      System.out.println("The page title contains the string 'HRM'");
	    } else {
	      System.out.println("The page title does not contains the string 'HRM'");
	    }

	    // Close the browser
	    driver.close();
	  }

	}

