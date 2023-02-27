package SeleniumWebdriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.NoSuchElementException;

import javax.swing.text.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;



public class Utility {
	
	static WebDriver driver;

	public static void captureScreenshotOfWebElement(WebDriver driver ) {
		  
   //     TakesScreenshot ts = (TakesScreenshot) driver;
        
   //     File src = ts.getScreenshotAs(OutputType.FILE);
        
   //     File destination = new File("./MyScreenshot.png");
        
        try
        {
        	FileHandler.copy(((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE), new File("./screenshots/Screenshot_"+getCurrentTime()+".png"));
        }
        catch (IOException e)
        {
        	System.out.println("Something went wrong" +e.getMessage());     
        }
		
	}
	
	public static String getCurrentTime() {
		
		String date = new SimpleDateFormat("HH:mm:ss_dd_MM_yyyy").format(new Date());
		return date;
		
	}
	

	    public static WebElement waitForElement(By locator, int timeout) {
	        WebElement element = null;
	        long endTime = System.currentTimeMillis() + (timeout * 1000);
	        while (System.currentTimeMillis() < endTime) {
	            try {
	                element = driver.findElement(locator);
	                if (element.isEnabled()) {
	                    return element;
	                }
	            } catch (NoSuchElementException e) {
	                // handle all exceptions while retrying
	            }
	            try {
	                Thread.sleep(1000); // sleep for 1 second
	            } catch (InterruptedException e) {
	                Thread.currentThread().interrupt();
	            }
	        }
	        throw new TimeoutException("Timed out waiting for element to be enabled: " + locator);
	    }
	}



