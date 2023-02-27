package SeleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class VerifyHrefURL {
    public static void main(String[] args) {
    	
    	// Create a new instance of the Chrome driver
	    WebDriver driver = new ChromeDriver();

        // Navigate to the website
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        
        driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Verify that there are four social media icons in the footer
	    WebElement footer_icons = driver.findElement(By.xpath("//div[@class='orangehrm-login-footer-sm']"));
	    
        List<WebElement> icons = footer_icons.findElements((By.xpath("//div[@class='orangehrm-login-footer-sm']/a")));
        
        boolean isYoutubeFound = false;
        
        for(WebElement icon : icons){
        	String href = icon.getAttribute("href");
        
            if(href.contains("youtube")){
                isYoutubeFound = true;
                System.out.println("Youtube link found: " + href);
                break;
            }
        }

        if(!isYoutubeFound){
            System.out.println("Youtube link not found");
        }
    
        // Close the browser
        driver.quit();
    }
}
