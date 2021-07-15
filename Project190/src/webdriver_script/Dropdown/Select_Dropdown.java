package webdriver_script.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Dropdown 
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(4000);
		
		
		//Selecting dropdown option using option name
		new Select(driver.findElement(By.id("day"))).selectByVisibleText("19");
		
		//selecting dropdown option using option property
		new Select(driver.findElement(By.id("month"))).selectByValue("3");
		
		//selecting dropdown option using index number
		new Select(driver.findElement(By.id("year"))).selectByIndex(21);
	
		
		/*
		 * FAQ:-->How to Select dropdown option without select commands?
		 * 
		 * 		Ans:--> We can select dropdown option using click command
		 * 		
		 * 		What is the process:-->
		 * 
		 * 			Copy Selected Option tag xpath and use click method to select it
		 * 			
		 * 		 
		 */
		
		driver.findElement(By.xpath("//option[@value='11'][contains(.,'Nov')]")).click();
		
		
		
		
	
	
		

	}

}
