package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Valdiate_Group_of_Options {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\New_browser_Drivers\\chromedriver.exe");    
		WebDriver driver=new ChromeDriver();
		driver.get("https://v1.hdfcbank.com/branch-atm-locator");
		driver.manage().window().maximize();
		
		
		String Exp_cities[]= 
			{
				"Please select state first",
				"South Andaman",
				"Port Blair",
				"Anantapur",
				"East Siang",
				"Darrang",
				"Arrah",
				"Chandigarh",
				"Durg",
				"Dadra",
				"Naroli",
				"Daman",
				"New Delhi",
			};
		
		
		WebElement State_Dropdown=driver.findElement(By.id("customState"));
		//Using Select class get Dropdown option tages
		List<WebElement> list=new Select(State_Dropdown).getOptions();
		
		
		for (int i = 8; i < 13; i++)
		{
			//Get Each State option from list
			WebElement EachOpiton=list.get(i);
			String StateName=EachOpiton.getText();
			//Click Each State
			EachOpiton.click();
			Thread.sleep(5000);
			
			//Identifying city dropdown
			WebElement City_Dropdown=driver.findElement(By.xpath("//select[@id='customCity']"));
			String All_Cities=City_Dropdown.getText();
		
			if(All_Cities.contains(Exp_cities[i]))
			{
				System.out.println("for State -> "+StateName+"   valid City Displayed   --> "+Exp_cities[i]);
			}
			else
			{
				System.out.println("for State -> "+StateName+"   wrong City Displayed   --> "+Exp_cities[i]);
			}
			
		}
		

	}

}
