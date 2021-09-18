package switch_Commands.window;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Next_Window {

	public static void main(String[] args) throws Exception 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\New_browser_Drivers\\chromedriver.exe");    
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		
		//Get Current Window ID
		String MainWindowID=driver.getWindowHandle();
		System.out.println(MainWindowID);
		
		
		
		//Click Hyper link  [Hyper links open page in window or TAB]
		WebElement Instagram_link=driver.findElement(By.linkText("Instagram"));
		Instagram_link.click();
		Thread.sleep(5000);
		
		
		
		System.out.println("Current focused window before switch  title is -->"+driver.getTitle());
		
		
		//Get All Window Dynamic ID's
		Set<String> All_WindowIDS=driver.getWindowHandles();
		System.out.println("Number of Window available is --> "+All_WindowIDS.size());
		
		//Apply foreach loop to iterate for number of windows
		for (String EachWIndowID : All_WindowIDS) 
		{
			driver.switchTo().window(EachWIndowID); 
			//Once your iteration finished driver controls will be available on last window
		}
		
		
		System.out.println("Current focused window after switch title is -->"+driver.getTitle());
		
		WebElement MobileNumber=driver.findElement(By.xpath("//input[contains(@name,'username')]"));
		MobileNumber.sendKeys("9030248855");
		Thread.sleep(4000);
		
		
		//Get Control Back to mainwindow
		driver.switchTo().window(MainWindowID);
		System.out.println("Now your focus available on main window");
		
		

	}

}
