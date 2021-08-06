package ui_verfication_commands.getText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Expected_Records_Available_At_Table {

	public static void main(String[] args) {
		
		
		/*
		 * Verify in Today market expected 
		 * Company name was listed 
		 */
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.icicidirect.com/equity");
		driver.manage().window().maximize();
		
		
		//Identify Table
		String All_Table_Records=driver.findElement(By.id("tblMarketToday")).getText();
		if(All_Table_Records.contains("Tata Consumer"))
		{
			System.out.println("Testpass, Record exist at webpage");
		}
		else
		{
			System.out.println("Testfail, Record doesn't exist at webapge");
		}

	}

}
