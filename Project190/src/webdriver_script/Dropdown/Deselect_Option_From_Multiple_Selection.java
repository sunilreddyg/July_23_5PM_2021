package webdriver_script.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Deselect_Option_From_Multiple_Selection 
{

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://bridgeqsystems.com/demo.php");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//button[contains(.,'Select Menu')]")).click();
		Thread.sleep(4000);
		
		
		boolean flag=new Select(driver.findElement(By.id("exampleFormControlSelect2"))).isMultiple();
		
		
		if(flag==true)
		{
			System.out.println("Dropdown is a multiple selection type");
			
			Select Country_Selector=new Select(driver.findElement(By.id("exampleFormControlSelect2")));
			Country_Selector.deselectAll();     //Deselect commands only works on multiple selection type
			Country_Selector.selectByIndex(1);
			Country_Selector.selectByIndex(3);
			Country_Selector.selectByIndex(5);
			Thread.sleep(4000);
			
			
					int Count=Country_Selector.getAllSelectedOptions().size();
					if(Count==3)
					{
						System.out.println("Maximum option selected");
						
						//Deselect single option from multiple selection
						Country_Selector.deselectByIndex(3);
						
								
								//Get Selection count after deselection
								int Dcount=Country_Selector.getAllSelectedOptions().size();
								if(Dcount==2)
								{
									System.out.println("Testpass, one option deselected succesfully from selection");
								}
								else
								{
									System.out.println("Testfail, There is a no proof of deselection");
								}
						
						
						
					}
					else
					{
						System.out.println("Maxmimum option selection failed");
					}
					
			
		}
		else
		{
			System.out.println("dropdown is not a multiple selection type");
		}
		
		
	

	}

}
