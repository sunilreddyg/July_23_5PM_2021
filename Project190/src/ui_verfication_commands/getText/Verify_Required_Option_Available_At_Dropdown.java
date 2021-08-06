package ui_verfication_commands.getText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_Required_Option_Available_At_Dropdown {

	public static void main(String[] args) throws Exception 
	{
		/*
		 * Scenario:-->
		 * 			Verify Citydropdown displayed City names 
		 * 			according to state selection
		 * 
		 * 			Given site url "https://v1.hdfcbank.com/branch-atm-locator"
		 * 			When user select any state
		 * 			Then verify expected cities listout at City Dropdown
		 */
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://v1.hdfcbank.com/branch-atm-locator");
		driver.manage().window().maximize();
		
		
		//Select State dropdown
		Select State_dropdown=new Select(driver.findElement(By.id("customState")));
		State_dropdown.selectByVisibleText("Andhra Pradesh");
		Thread.sleep(5000);
		
		
		String All_Cities=driver.findElement(By.id("customCity")).getText();
		//System.out.println(All_Cities);
		
		
		if(All_Cities.contains("Anantapur"))
			System.out.println("Expected Cities loaded according to state selection");
		else
			System.out.println("Expected cities not loaded according to state selection");
		
		
		

	}

}
