package SeleniumWebdriver;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class FBCreateAccount {

	public static void main(String[] args) throws InterruptedException {
		
		// Create a new instance of the Chrome driver
	    WebDriver driver = new ChromeDriver();

        // Navigate to the website
        driver.get("https://www.facebook.com/");
        
        driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    // click on Create account button
	    driver.findElement(By.xpath("(//a[normalize-space()='Create new account'])[1]")).click();
	    Thread.sleep(3000);
	    // Enter First name
	    driver.findElement(By.xpath("(//input[@name='firstname'])")).sendKeys("John");
	    // Enter Last name
	    driver.findElement(By.xpath("(//input[@name='lastname'])")).sendKeys("David");
	    // Enter Email or Mobile
	    driver.findElement(By.xpath("(//input[@name='reg_email__'])")).sendKeys("123456789");
	   // Enter New password
	    driver.findElement(By.xpath("(//input[@name='reg_passwd__'])")).sendKeys("John@12345");
	    Thread.sleep(3000);
	    // Select Month
	   WebElement MonthDD = driver.findElement(By.xpath("//select[@id='month']"));
	   Select month = new Select(MonthDD);
	   month.selectByVisibleText("Jun");  
	   // Select Date
	   WebElement DateDD = driver.findElement(By.xpath("//select[@id='day']"));
	   Select date = new Select(DateDD);
	   date.selectByVisibleText("10");
	   // Select Year
	   WebElement YearDD = driver.findElement(By.xpath("//select[@id='year']"));
	   Select year = new Select(YearDD);
	   year.selectByVisibleText("1987");
	   // Select Gender radio button
	   WebElement GenderRB = driver.findElement(By.xpath("//input[@type='radio' and @value='2']"));
	   GenderRB.click();
	  // Click on Sign up button
	   WebElement SignUpbtn = driver.findElement(By.xpath("//button[@type='submit' and @name='websubmit']"));
	   SignUpbtn.click();	 
	}
	}


	
