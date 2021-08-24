package switch_Commands.Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Frame_With_WebElement {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\New_browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/dialog/");
		driver.manage().window().maximize();
		
		//Identifying frame location and storing into WebElement Reference
		WebElement Frame_Location=driver.findElement(By.xpath("//span[contains(@class,'ui-button-icon ui-icon ui-icon-closethick')]"));
		driver.switchTo().frame(Frame_Location);
		System.out.println("Switched controls to frame from webpage");
		
		
		driver.findElement(By.xpath("//span[@class='ui-button-icon ui-icon ui-icon-closethick']")).click();
		System.out.println("Dialog box closed");
		
		//Get Controls back to mainpage
		driver.switchTo().defaultContent();
		System.out.println("Controls back ot mainpage from frame");

	}

}
