package SeleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class StoreHrefMap {
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
        
        HashMap<String, String> socialMediaLinks = new HashMap<String, String>();
        
        if (icons.size() == 4) {
            System.out.println("Footer has four social media icons");
            
            for(WebElement icon : icons){
                String href = icon.getAttribute("href");
                if(href.contains("facebook")){
                    socialMediaLinks.put("Facebook", href);
                }else if(href.contains("witter")){
                    socialMediaLinks.put("Twitter", href);
                }else if(href.contains("outube")){
                    socialMediaLinks.put("Youtube", href);
                }else if(href.contains("inkedin")){
                    socialMediaLinks.put("Linkedin", href);
                }
            }
        } else {
            System.out.println("Footer does not have four social media icons");
        }
        //print the map
        System.out.println(socialMediaLinks);
        // Close the browser
        driver.quit();
    }
}
