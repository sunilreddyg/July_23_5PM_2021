package webdriver_script.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Get_Options_Count 
{

	public static void main(String[] args) throws Exception
	{
		
		
		/*
		 * Testcase:-->
		 * 			1. Enter site url  https://www.cleartrip.com/
		 * 			2. Select Adults Dropdown selection maximum options 9
		 * 			3. verify Childrens dropdown should not display any options
		 * 				only shows default zero option
		 */
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		
		//Selecting adults dropdown options maximum 9
	/*	new Select(driver.findElement(By.xpath("(//select[contains(@class,'bc-neutral-100 bg-transparent')])[1]")))
		.selectByVisibleText("9");*/
		Thread.sleep(4000);
		
		
		/*
		 * This syntax return how any option tags under select tag.
		 */
		
		Select Children_Dropdown=new Select(driver.findElement(By.xpath("(//select[@class='bc-neutral-100 bg-transparent'])[2]")));
		int Children_Count=Children_Dropdown.getOptions().size();
		System.out.println(Children_Count);
		
		
		if(Children_Count == 1)
		{
			System.out.println("Testpass, As expected Childs only showing default option zero");
		}
		else
		{
			System.out.println("Testfail, Child dropdown contain more than one option "+Children_Count);
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
