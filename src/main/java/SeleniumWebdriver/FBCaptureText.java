package SeleniumWebdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBCaptureText {

	public static void main(String[] args) {
		
		// Create a new instance of the Chrome driver
	    WebDriver driver = new ChromeDriver();

        // Navigate to the website
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    // Get the Facebook text
	     String FBText = driver.findElement(By.xpath("//h2[contains(text(),'Connect with friends and the world around you on F')]")).getText();
	    
	    if (FBText.contains("Connect with friends and the world around you on Facebook")) {
		      System.out.println("FB text is correct");
		    } else {
		      System.out.println("FB text is not correct");
		    }
}}
