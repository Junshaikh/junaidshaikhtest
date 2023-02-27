package SeleniumWebdriver;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class iNeuronSignup {

	public static void main(String[] args) throws InterruptedException {
		
		// Create a new instance of the Chrome driver
	    WebDriver driver = new ChromeDriver();

        // Navigate to the website
        driver.get("https://ineuron-courses.vercel.app/login");
        Thread.sleep(3000);
        driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	  // Login into iNeuron 
	   driver.findElement(By.xpath("//input[@id='email1']")).sendKeys("ineuron@ineuron.ai");
	   driver.findElement(By.xpath("//input[@id='password1']")).sendKeys("ineuron");
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click(); 
	   // Mouse Hover on manage
	   Thread.sleep(3000);
	   Actions act = new Actions(driver);
	   WebElement Managelink = driver.findElement(By.xpath("//span[normalize-space()='Manage']"));
	   act.moveToElement(Managelink).build().perform();
	   // Click on Manage courses
	   Thread.sleep(2000);
	   WebElement Managecourses = driver.findElement(By.xpath("//span[normalize-space()='Manage Courses']"));
	   JavascriptExecutor js = (JavascriptExecutor)driver;
	   js.executeScript("arguments[0]",Managecourses);
	   Managecourses.click();
	   driver.findElement(By.xpath("//h1[normalize-space()='Manage Courses']")).click();
	    // Click on add new course
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//button[normalize-space()='Add New Course']")).click(); 
	   // Fill all course details
	   // upload file image
	   Thread.sleep(2000);
		  WebElement fileupload = driver.findElement(By.xpath("//input[@id='thumbnail']"));
		   JavascriptExecutor js1 = (JavascriptExecutor)driver;
		   js1.executeScript("arguments[0]",fileupload);
		   fileupload.sendKeys("/Users/junaidshaikh/Desktop/fileuploaded.png");
	   //course name
	   driver.findElement(By.xpath("//h3[normalize-space()='Course Name']//following::input[1]")).sendKeys("Selenium");
	   //description name
	   driver.findElement(By.xpath("//textarea[@id='description']")).sendKeys("Selenium Full Course");
	   //instructor name
	   driver.findElement(By.xpath("//h3[normalize-space()='Instructor']//following::input[1]")).sendKeys("Mukesh");
	   //price name
	   driver.findElement(By.xpath("//h3[normalize-space()='Price']//following::input[1]")).clear();
	   driver.findElement(By.xpath("//h3[normalize-space()='Price']//following::input[1]")).sendKeys("8000");
	  // start date picker
	   driver.findElement(By.xpath("//input[contains(@name,'startDate')]")).click();
	List<WebElement> Startdate =  driver.findElements(By.xpath("//div[@role='listbox']//div[@aria-disabled='false']"));
	
	for(WebElement startday:Startdate) 
	{
		String startdatetext = startday.getText();
		System.out.println("Start Dates enabled are " +startdatetext);
		  if(startdatetext.contains("13"))
		  {
			  System.out.println("Start Dates selected " +startdatetext.contains("13")); 
			  startday.click();
			  break;
		  } 
		  // end date picker
		   driver.findElement(By.xpath("//input[contains(@name,'endDate')]")).click();
		   Thread.sleep(2000);
		List<WebElement> Enddate =  driver.findElements(By.xpath("//div[@role='listbox']//div[@aria-disabled='false']"));
		
		for(WebElement endday:Enddate) 
		{
			String enddatetext = endday.getText();
			System.out.println("End Dates enabled are " +enddatetext);
			  if(enddatetext.contains("28"))
			  {
				  System.out.println("Start Dates selected " +enddatetext.contains("28")); 
				  endday.click();
				  break;
			  } 
		    // select on Category
			  driver.findElement(By.xpath("//div[normalize-space()='Select Category']")).click();
			  driver.findElement(By.xpath("//button[text()='Testing']")).click();
			  Thread.sleep(2000);
			  // click on Save button
			driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
			Thread.sleep(5000);
			// Verify my course exist
		    WebElement MyCourse =	driver.findElement(By.xpath("//td[normalize-space()='Testing']//preceding::td[normalize-space()='Selenium']//following::td[normalize-space()='Mukesh']"));
			JavascriptExecutor js2 = (JavascriptExecutor)driver;
			 js2.executeScript("arguments[0].scrollIntoView(true)",MyCourse);
			 if(MyCourse.isDisplayed())
				{
					System.out.println("My course exist");
				} else  {
				      System.out.println("My course does not exist");
				}
			 // delete my course
	     WebElement DeleteMyCourse = driver.findElement(By.xpath("//td[normalize-space()='Testing']//preceding::td[normalize-space()='Selenium']//following::td[normalize-space()='Mukesh']//following::button[1]"));
	     JavascriptExecutor js3 = (JavascriptExecutor)driver;
		 js3.executeScript("arguments[0].scrollIntoView(true)",DeleteMyCourse);
		 Thread.sleep(5000);
	     DeleteMyCourse.click();
	     Thread.sleep(5000);

		    // Sign out
		    driver.findElement(By.xpath("//button[normalize-space()='Sign out']")).click();
		}
	}}}


	
