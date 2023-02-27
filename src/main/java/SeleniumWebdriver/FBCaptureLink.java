package SeleniumWebdriver;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBCaptureLink {

	public static void main(String[] args) {
		
		// Create a new instance of the Chrome driver
	    WebDriver driver = new ChromeDriver();

        // Navigate to the website
        driver.get("https://www.facebook.com/");
        
        driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    // Get the Facebook link
	    
	   List<WebElement> FBLink = driver.findElements(By.xpath("//a"));
	   
	   HashMap<String, String> FBLinks = new HashMap<String, String>();
	   
	   for(WebElement links : FBLink){
           String text = links.getAttribute("text");
	       System.out.println(text);
	   }
	   
	// Verify that the 'Create a Page' link is present
	WebElement CreatePage = driver.findElement(By.xpath("//a[normalize-space()='Create a Page']"));
	  
	 if (CreatePage.isEnabled()) {
	      System.out.println("Create a Page is present");
	      CreatePage.click();
	    } else {
	      System.out.println("Create a Page is Not present");
	    }
	}}

