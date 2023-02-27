package SeleniumWebdriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TimerElementCatch {

	public static void main(String[] args) throws InterruptedException {
		
		// Create a new instance of the Chrome driver
	    WebDriver driver = new ChromeDriver();

        // Navigate to the website
        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
        
        driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     
	    // click on Timer 
	     Thread.sleep(3000);
	     driver.findElement(By.xpath("//button[normalize-space()='Click me to start timer']")).click();
	     
	   // wait for text 'WebDriver'
	     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	     WebElement AutomationTools = driver.findElement(By.xpath("//p[@id='demo']"));
	     wait.until(ExpectedConditions.textToBePresentInElement(AutomationTools, "WebDriver"));
         System.out.println(AutomationTools.getText());

	}

}
