package webdriver_script.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_Required_option_Selected_At_dropdown {

	public static void main(String[] args)
	{
		
		/*
		 * FAQ:--> How to verify selected option populated at dropdown
		 * 
		 * 		1. Enter url https://v1.hdfcbank.com/branch-atm-locator
		 * 		2. Select Telangana option at dropdown
		 * 		3. Verify Telangana option is selected
		 */
		
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://v1.hdfcbank.com/branch-atm-locator");
		driver.manage().window().maximize();
		
		//Selecting dropdown option
		Select State_Dropdown=new Select(driver.findElement(By.id("customState")));
		State_Dropdown.selectByVisibleText("Telangana");
		
		
		//Verify Telangana option only displayed at dropdown
		
		//This Syntax return selected option name in string format
		String Optioname=State_Dropdown.getFirstSelectedOption().getText();
		System.out.println(Optioname);
		
		
		//Comapre two String to verify equal comparision
		if(Optioname.equals("Telangana"))    //Equal method return boolean value true/false
		{
			System.out.println("Testpass, Telangana displayed");
		}
		else
		{
			System.out.println("Testfail, Expected option not populated");
		}
		
		
		
	
		

	}

}
