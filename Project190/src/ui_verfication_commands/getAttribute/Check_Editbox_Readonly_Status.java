package ui_verfication_commands.getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check_Editbox_Readonly_Status {

	public static void main(String[] args) throws Exception 
	{
		
		/*
		 * Scenario: Verifying departure readonly state
		 * 		Given site url is "http://makemytrip.com"
		 * 		Then verify departure editbox is readonly
		 */
		
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.makemytrip.com");
		driver.manage().window().maximize();
		
		
		Thread.sleep(30000);
	
		
	
		WebElement Departure_Date=driver.findElement(By.id("departure"));
		String Status=Departure_Date.getAttribute("readonly");
		System.out.println(Status);
		
		if(!(Status==null))
		{
			if(Status.equals("true"))
			{
				System.out.println("Testpass, Departure editbox is in readonly mode");
			}

		}
		else
		{
			System.out.println("Testfail,Editbox is in writable state");
		}
		
		
		
		
		
		
		

	}

}
