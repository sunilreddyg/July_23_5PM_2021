package switch_Commands.window;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Required_Window_When_Multiple_Windows_Are_Opened {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		driver.manage().window().maximize();
		
		//Capture current Window dynamic id
		String Main_windowID=driver.getWindowHandle();
		
		
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Check PNR Status']")).click();
		Thread.sleep(2000);
		
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Trains availability calendar']")).click();
		Thread.sleep(2000);
				
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Cancel trains tickets']")).click();
		Thread.sleep(2000);
		
		//Get All Window Dynamic ID's
		Set<String> All_WindowIDS=driver.getWindowHandles();
		System.out.println("Number of Window available is --> "+All_WindowIDS.size());
		
		//iterator for number of windows
		for (String EachWindowID : All_WindowIDS) 
		{
				//Switch to Each window
				driver.switchTo().window(EachWindowID);
				
				//Get Every Window Title
				String Runtime_title=driver.getTitle();
				System.out.println(Runtime_title);
				
				
				if(Runtime_title.contains("Indian Railway Seat Availability"))
				{
					break;
					//Break keyword stop iteration
				}
			
		}
		
		System.out.println("Current Focused window title is --> "+driver.getTitle());

	}

}
