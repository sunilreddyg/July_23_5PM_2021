package ui_verfication_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_pageSource 
{

	public static void main(String[] args) 
	{
	
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();

		
		
		
		//Get Entire page source
		String PageSource=driver.getPageSource();
		
		
		//Verify Object ID property available at page source
		if(PageSource.contains("email"))
		{
			System.out.println("Email object available at pagesource");
			WebElement Email=driver.findElement(By.id("email"));
			Email.clear();
			Email.sendKeys("darshan@gmail.com");
		}
		else
		{
			System.out.println("Element not presented at source");
		}
		
		
		/*
		 * Where getpagesource is usefull:-->
		 * 
		 * 			=> It is helpfull to prevent unnecessary actions 
		 * 				when element is not available at source..
		 */
		
		
		
		/*
		 * SecondMethod:-->
		 * 			How to Prevent performing action when element is not presented
		 * 			at source.
		 * 
		 * 			Note:--> FindElement is a method designed to identify object
		 * 					 at webpage incase object not presented at source 
		 * 					 this method throws exception "NoSuchElementException"
		 */
		
		
		try {
			
			WebElement password=driver.findElement(By.id("pass")); 
			password.clear();
			password.sendKeys("Hello12345");
			System.out.println("password entered successfully");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("Run will be continue even exception presented or not presented");
		
		

	}

}
