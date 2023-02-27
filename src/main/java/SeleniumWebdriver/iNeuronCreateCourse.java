package SeleniumWebdriver;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class iNeuronCreateCourse {

	public static void main(String[] args) throws InterruptedException {
		
		// Create a new instance of the Chrome driver
	    WebDriver driver = new ChromeDriver();

        // Navigate to the website
        driver.get("https://ineuron-courses.vercel.app/signup");
        Thread.sleep(3000);
        driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	/*    
	    // click on Sign up disabled button
	  WebElement Signupbtn =  driver.findElement(By.xpath("//button[normalize-space()='Sign up']"));
	   
	  if (Signupbtn.isEnabled()) {
	      System.out.println("Signup btn is enabled");
	    } else {
	      System.out.println("Signup btn is disabled");
	    }
	  // Enter Name
	  driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Junaid");
	  // Enter Email
	  driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Junsk10@gmail.com");
	  // Enter Password
	  driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Junaid@123");
	  // Select Interest subject
	  driver.findElement(By.xpath("//label[text()='Testing']")).click();
	  // Select Gender
	  driver.findElement(By.xpath("//input[@name='gender' and @value='Male']")).click();
	  // Select State
       WebElement StateDD = driver.findElement(By.xpath("//select[@id='state']"));
	   Select state = new Select(StateDD);
	   state.selectByVisibleText("Maharashtra");
	  // click on Sign up button
	   JavascriptExecutor js = (JavascriptExecutor)driver;
	   js.executeScript("arguments[0].scrollIntoView(true)",Signupbtn);
	   Thread.sleep(3000);
	   Signupbtn.click();
	   */
	  // Sign in to iNeuron 
	   driver.findElement(By.cssSelector(".navbar-menu-links button")).click();
	   driver.findElement(By.xpath("//input[@id='email1']")).sendKeys("Junsk10@gmail.com");
	   driver.findElement(By.xpath("//input[@id='password1']")).sendKeys("Junaid@123");
	   driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();  
	}
	}


	
