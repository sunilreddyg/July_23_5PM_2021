package switch_Commands.Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switchto_Frame_Using_Navigation_Command {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\New_browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/dialog/");
		driver.manage().window().maximize();
		
		
		driver.navigate().to("https://jqueryui.com/resources/demos/dialog/default.html");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[@class='ui-button-icon ui-icon ui-icon-closethick']")).click();
		System.out.println("Dialog box closed");
		
		//Using Navigation method get control back to mainpage
		driver.navigate().back();
		
		
		/*
		 * Ques:-->How to handle frame element without writing switchto command
		 * Ans:-->
		 * 			Every frame has independant URL we can navigate to frame using  Get or navigate.to(URL) method
		 */
		
		
		
		
		
		
		
		

	}

}
