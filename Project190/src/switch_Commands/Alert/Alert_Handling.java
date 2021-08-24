package switch_Commands.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Handling {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\New_browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://bridgeqsystems.com/demo.php");
		driver.manage().window().maximize();
		
		//Click on Alert,Frames and windows menu tab
		driver.findElement(By.xpath("//a[@id='v-pills-messages-tab']")).click();
		Thread.sleep(3000);
		
		//Clicking on Alerts Menu
		driver.findElement(By.xpath("//button[contains(.,'Alerts')]")).click();
		Thread.sleep(2000);
		
		//Click on click me button [This action will bring alert at webpage]
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		Thread.sleep(5000);
		
		
		/*
		 * Que:--> How to verify alert presented at webpage and Handle when 
		 * 			alert was presented and Ignore Closing alert when alert was not presented
		 */
		
		
		try {
			
			driver.switchTo().alert().accept();
			System.out.println("Alert is Closed");
			
		} catch (NoAlertPresentException e) {
			
			System.out.println("Alert is not presented");
		}
		
		
		System.out.println("Run Continued");
		

	}

}
