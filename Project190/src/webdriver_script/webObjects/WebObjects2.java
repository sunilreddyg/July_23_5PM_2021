package webdriver_script.webObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebObjects2 {

	public static void main(String[] args) throws Exception 
	{
	
		
		/*
		 * Selecting datepicker options:-->
		 * 		1. Click to open calendar
		 * 		2. Cick Next method button to selected change month
		 * 		3. Click on Date
		 */
		
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();   //It delete previous history
		
		
		//Open Calendar
		driver.findElement(By.xpath("//input[contains(@id,'date1')]")).click();
	
		//Click Next month button
		driver.findElement(By.xpath("//span[contains(.,'Next')]")).click();
		Thread.sleep(2000);
		
		//Select a date by click on it
		driver.findElement(By.linkText("18")).click();
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
