package SeleniumWebdriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VerifyHref {

	public static void main(String[] args) {
		 
	    // Create a new instance of the Chrome driver
	    WebDriver driver = new ChromeDriver();

	    // Use the driver to open the OrangeHRM Live demo site
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	    
	    WebElement socialMediaIcons = driver.findElement(By.className("orangehrm-login-footer-sm"));
	
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    System.out.println(socialMediaIcons.getAttribute("href"));
	    
	  
	//    driver.close();
	  }

	
	}
	

