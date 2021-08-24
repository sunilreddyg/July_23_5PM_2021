package switch_Commands.Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_ChildFrame {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\New_browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
		
		//Click TAB to display multiple frames
		driver.findElement(By.xpath("//a[@href='#Multiple']")).click();
		Thread.sleep(5000);
		
		
		WebElement Parent_Frame_Object=driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(Parent_Frame_Object);
		System.out.println("Switch to Parent frame successfull");
		
		
		//Switch To Child Frame using index number [It target first child frame under parent frame]
		driver.switchTo().frame(0);
		System.out.println("Switch to child frame under parent frame");
		
		
	
		//Type text into editbox under child frame
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hello friends");
		
		
		//From child frame get control back to parent frame
		driver.switchTo().parentFrame();
		System.out.println("Controls are Switch to Parent frame from child");
		
		//From Parent frame get controls to mainpage
		driver.switchTo().defaultContent();
		System.out.println("controls are switch to mainpage");
		
		//CLick home button at main page
		driver.findElement(By.xpath("//a[@href='Index.html']")).click();
		
		
		

	}

}
