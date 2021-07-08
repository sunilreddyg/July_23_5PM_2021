package webdriver_script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_WebDriver_Scripting 
{

	public static void main(String[] args) 
	{
		
		
		/*
		 * 1. Open Chrome browser
		 * 2. Navigate to facebook page
		 * 3. Maximize brower window [Optional]
		 * 4. Type username
		 * 5. Type password
		 * 6. Click Signin Button
		 */
		
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("email")).sendKeys("info.dsnr@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Hello12345");
		
		
		
		
		

	}

}
