package switch_Commands.window;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_SubWindow 
{

	public static void main(String[] args) 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\New_browser_Drivers\\chromedriver.exe");    
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		driver.manage().window().maximize();
		
		//clicking on hyper link [It open in new window /New Tab]
		WebElement check_pnr_status=driver.findElement(By.xpath("//a[@href='http://www.cleartrip.com/trains/pnr']"));
		check_pnr_status.click();
		
		
		//Get All Window Dynamic ID's
		Set<String> All_WindowIDS=driver.getWindowHandles();
		System.out.println("Number of Window available is --> "+All_WindowIDS.size());
		
		//Apply foreach loop to iterate for number of windows
		for (String EachWIndowID : All_WindowIDS) 
		{
			driver.switchTo().window(EachWIndowID);
		}
		
		//Enter PNR number at sub window
		WebElement PNR_Editbox=driver.findElement(By.xpath("//input[@id='pnr']"));
		PNR_Editbox.sendKeys("17837873");
		
		
		/*
		 * Set:--> 
		 * 		 Set is a unoder collection of objects 
		 * 		 It store group of objects in random order..
		 * 
		 * 		Note:--> When Collection of objects only two available if follow order
		 */
		

	}

}
