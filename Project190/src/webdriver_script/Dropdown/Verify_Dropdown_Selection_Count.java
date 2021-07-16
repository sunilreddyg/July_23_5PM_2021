package webdriver_script.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_Dropdown_Selection_Count {

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
			
			
					int Count=Country_Selector.getAllSelectedOptions().size();
					if(Count==2)
					{
						System.out.println("Tetpass, Expected options selected ");
					}
					else
					{
						System.out.println("Testfail, Selected options count mismatch with expected count");
					}
					
			
		}
		else
		{
			System.out.println("dropdown is not a multiple selection type");
		}
		
		
		

	}

}
