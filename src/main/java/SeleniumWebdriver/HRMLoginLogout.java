package SeleniumWebdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

/*
 Write a script that should be able to add user > search user > delete the user.

		Flow- Login > Admin> Add User> Search User > Delete User > Logout

		Add an assertion after each section

		https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
		Admin/admin123 
		*/

public class HRMLoginLogout {

	public static void main(String[] args) throws InterruptedException {
		
		// Create a new instance of the Chrome driver
	    WebDriver driver = new ChromeDriver();

        // Navigate to the website
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        
        driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Enter username
	     driver.findElement(By.xpath("//input[contains(@placeholder,'Username')]")).sendKeys("admin");
	     
	    // Enter password
	     driver.findElement(By.xpath("//input[contains(@placeholder,'Password')]")).sendKeys("admin123");
	     
	    // click on Login button
	     driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	     
	    // click on Admin tab
	     driver.findElement(By.xpath("//a[normalize-space()='Admin']")).click();

	     // click on Add button 
	     driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();

	    // click on User Role drop down
	     driver.findElement(By.xpath("//*[text()='User Role']//following::div[1]")).click();
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("//div[@role='option']//span[text()='Admin']")).click();
	     
	    // click on Status drop down
	     driver.findElement(By.xpath("//*[text()='Status']//following::div[1]")).click();
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("//div[@role='listbox']//span[text()='Enabled']")).click();
	     
	    // Enter Employee name
	     driver.findElement(By.xpath("//label[normalize-space()='Employee Name']/following::input[1]")).sendKeys("A");
	     Thread.sleep(3000);
	     driver.findElement(By.xpath("//div[@role='listbox']//div[@class='oxd-autocomplete-option'][1]")).click();
	       
	     
	     // Enter Username
		  driver.findElement(By.xpath("//label[normalize-space()='Username']/following::input[1]")).sendKeys("Junaid");
     
		  // Enter Password
	     driver.findElement(By.xpath("//label[normalize-space()='Password']/following::input[1]")).sendKeys("Junaid@123");
	
	     // Enter Confirm Password
	     driver.findElement(By.xpath("//label[normalize-space()='Confirm Password']/following::input[1]")).sendKeys("Junaid@123");
	  
	  //  Click on Save button 
	     Thread.sleep(3000);
	     driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
	     
	     // Search UserName
	     
	     Thread.sleep(2000);
	   //  driver.findElement(By.xpath("//label[normalize-space()='Username']//following::input[1]")).click();
	     driver.findElement(By.xpath("//label[normalize-space()='Username']//following::input[1]")).sendKeys("Junaid");
	     
	     
	    // Click on Search
	     driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
	     Thread.sleep(3000);
	     
	     // Delete user
	     driver.findElement(By.xpath("//div[contains(text(),'Junaid')]//following::i[1]")).click();
	     driver.findElement(By.xpath("//button[normalize-space()='Yes, Delete']")).click();
		   
	     //Logout
	     driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
	     driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
	  

	}

}
