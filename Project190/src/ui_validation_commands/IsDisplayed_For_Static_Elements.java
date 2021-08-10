package ui_validation_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class IsDisplayed_For_Static_Elements 
{

	public static void main(String[] args) throws Exception 
	{
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  	//Launch browser
		driver.get("https://www.outlook.com");  //Load webpage
		driver.manage().window().maximize();    //maximize browser window
								
	
		//Identify Signin button
		WebElement Signin_btn=driver.findElement(By.xpath("//a[text()='Sign in']"));
		if(Signin_btn.isDisplayed())
		{
			Signin_btn.click();
		}
		else
		{
			System.out.println("Object not visible at webpage");
		}
		
		
		
		WebElement Email_textbox=driver.findElement(By.id("i0116"));
		if(Email_textbox.isDisplayed())
		{
			Email_textbox.clear();
			Email_textbox.sendKeys("sunilreddy.gajjala@gmail.com");
		}
		else
		{
			System.out.println("Element Not visible at webpage");
		}
		

		/*
		 * ElementNotvisibleException   
		 * 			==> It Throws When user perform action on hidden element  
		 * InvalidElementstateException 
		 * 			==> It Throws When user perform action on disabled element
		 */
		
		
		
		
		
		
		
	
			
			
		
		
		
		
		
		
		

	}

}
