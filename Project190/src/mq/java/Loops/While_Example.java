package mq.java.Loops;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class While_Example 
{

	public static void main(String[] args) throws Exception 
	{
		
		
		//Print numbers from 1 to 10  [While loop with true condition]
		int i=0;
		while(i < 10)
		{
			
			i=i+1;
			System.out.println(i);
		}
		
		
		//While loop with false condition
		int j=10;
		while(j < 0)
		{
				System.out.println("false Condition");
		}
		
		
		
		
		//Manage Explicitwait using While loop
		System.setProperty("webdriver.chrome.driver", "E:\\New_browser_Drivers\\chromedriver.exe");    
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		
		WebElement Email=driver.findElement(By.id("email"));
		//((JavascriptExecutor)driver).executeScript("document.getElementById('email').setAttribute('disabled','disabled')");
		
		//Managing explicit wait until object is disabled
		int k=0;
		while(Email.isEnabled())
		{
			System.out.println("checking email disabled function");
			
			Thread.sleep(1000);
			k=k+1;
			if(k==20)
			{
				throw new Exception("Object is Enabled");
			}
		}
		
		System.out.println("Email is disabled");
		
		
		
		
		

	}

}
