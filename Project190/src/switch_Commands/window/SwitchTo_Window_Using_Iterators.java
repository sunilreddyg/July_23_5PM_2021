package switch_Commands.window;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Window_Using_Iterators {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\New_browser_Drivers\\chromedriver.exe");    
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		//Click Hyper link  [Hyper links open page in window or TAB]
		WebElement Instagram_link=driver.findElement(By.linkText("Instagram"));
		Instagram_link.click();
		Thread.sleep(5000);
		
	
		System.out.println("Current focused window before switch  title is -->"+driver.getTitle());
		
		
		//Get All Window Dynamic ID's
		Set<String> All_WindowIDS=driver.getWindowHandles();
		System.out.println("Number of Window available is --> "+All_WindowIDS.size());
		
		
		//Convert collection of objects into individual tokens.
		Iterator<String> itr=All_WindowIDS.iterator();
		//Read Each token using "next keyword"
		String W1=itr.next();
		String W2=itr.next();
		
		System.out.println("before switch window title is --> "+driver.getTitle());
		driver.switchTo().window(W2);
		System.out.println("After switch window title is --> "+driver.getTitle());
		
		//Switch First window
		driver.switchTo().window(W1);
		System.out.println("W1 title is --> "+driver.getTitle());
		
		
		

	}

}
