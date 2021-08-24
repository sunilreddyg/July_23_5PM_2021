package switch_Commands.Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Switch_Between_Frames {

	public static void main(String[] args) throws Exception
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\New_browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://epass.apcfss.in/");
		driver.manage().window().maximize();
		
		
		//Switch to frame using frame name or frame id
		driver.switchTo().frame("menuFrame");
		System.out.println("Now your controls under frame available");
		
		//Identifying object under menuframe
		driver.findElement(By.xpath("//a[@href='FeestructureReport.do']")).click();
		Thread.sleep(4000);
		
		
		//Get Controls back to mainpage from menuframe
		driver.switchTo().defaultContent();
		
		Thread.sleep(2000);
		
		//Switch to different frame using Frame ID/Name
		driver.switchTo().frame("bodyFrame");
		System.out.println("Now your controls under body frame available");
		
		new Select(driver.findElement(By.xpath("//select[@id='univ']"))).selectByIndex(4);
		
		
		
		
		
		
		
		

	}

}
