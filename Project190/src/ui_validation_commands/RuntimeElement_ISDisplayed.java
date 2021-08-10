package ui_validation_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RuntimeElement_ISDisplayed
{

	public static void main(String[] args) throws Exception 
	{
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //Launch browser
		driver.get("http://www.cleartrip.com");  //Load webpage
		driver.manage().window().maximize();  //maximize browser window
		Thread.sleep(10000);
	
		
		/*
		 * Click More options. 
		 * Expected "Class of travel" dropdown visible at webpage
		 */
		
		//target more options link
		WebElement More_options=driver.findElement(By.partialLinkText("More options:"));
		More_options.click();
		Thread.sleep(5000);
		
		WebElement Travel_Class=driver.findElement(By.xpath("(//select[@class='bc-neutral-100 bg-transparent'])[4]"));
		
		if(Travel_Class.isDisplayed())
			System.out.println("Tetpass, Travel class dropdown visible at webpage");
		else
			System.out.println("Testfail, Travel class dropdown hidden at webpage");
		
		
		
		
		/*
		 *  => Click More options.when travel class element is visible
		 *  => Expected "Class of travel" element  hide from webpage
		 */
		Thread.sleep(5000);   //Restoring object to avoid staleElementReference exception
		Travel_Class=driver.findElement(By.xpath("(//select[@class='bc-neutral-100 bg-transparent'])[4]"));
		if(Travel_Class.isDisplayed())
		{
				//Restroing to avoid stale Element Reference exception..
				More_options=driver.findElement(By.partialLinkText("More options:"));
				More_options.click();
				Thread.sleep(4000);
				
				if(!Travel_Class.isDisplayed())  //!--Not [It make opposite condition]
				{
					System.out.println("Testpass, OBject Hidden at webpage");
				}
				else
				{
					System.out.println("Testfail, OBjevt visible at webapge");
				}	
		}
		else
		{
			System.out.println("Travel class element is not visible and more otpion not clicked");
		}
		
		
	}

}
