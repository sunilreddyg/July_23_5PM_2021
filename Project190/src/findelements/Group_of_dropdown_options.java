package findelements;

import java.security.cert.PKIXRevocationChecker.Option;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Group_of_dropdown_options {

	public static void main(String[] args) throws Exception
	{
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\New_browser_Drivers\\chromedriver.exe");    
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		
		
		WebElement Month_Dropdown=driver.findElement(By.id("month"));
		List<WebElement> All_options=Month_Dropdown.findElements(By.tagName("option"));
		System.out.println("List of options available at month dropdown --> "+All_options.size());
		
		if(All_options.size() > 0)
		{
			
			//iterate for number of options
			for (int i = 0; i < All_options.size(); i++) 
			{
				//Get Each option from list using index number
				WebElement EachOption=All_options.get(i);
				String OptionName=EachOption.getText();
				System.out.println(OptionName);
				
				
				if(OptionName.equals("Mar"))
				{
					//Click Eachoption
					EachOption.click();
				}
				
			
				
			}
			
			
			
		}
		
		
		

	}

}
