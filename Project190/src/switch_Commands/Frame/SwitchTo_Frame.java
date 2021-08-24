package switch_Commands.Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Frame {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "E:\\New_browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/account/trips");
		driver.manage().window().maximize();

		
		driver.switchTo().frame("modal_window");
		Thread.sleep(2000);
		
		//IDentifying frame under objects
		driver.findElement(By.id("email")).sendKeys("info.mindq@gmail.com");
		
		//IDentifying frame under objects
		driver.findElement(By.id("tripidSecond")).sendKeys("668768768");
		
		//Get IDentification controls from page to mainpage
		driver.switchTo().defaultContent();
		
	
		//Identify Link at PageSource
		driver.findElement(By.xpath("//a[contains(.,'Feedback')]")).click();
		Thread.sleep(10000);
		
		//Switch Control to Page using Frame ID
		driver.switchTo().frame("modal_window");
		Thread.sleep(2000);
		
		//Identifying Frame under objects
		driver.findElement(By.xpath("//button[contains(.,'Back to home')]")).click();
		Thread.sleep(2000);
		
		
		
		
		
		
	}

}
