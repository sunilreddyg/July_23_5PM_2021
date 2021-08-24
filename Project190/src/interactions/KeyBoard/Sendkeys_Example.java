package interactions.KeyBoard;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Sendkeys_Example {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\New_browser_Drivers\\chromedriver.exe");    
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/free-job-alerts");
		driver.manage().window().maximize();
		
		
		WebElement Work_Exp_list=driver.findElement(By.xpath("//input[@id='cjaExp']"));
		Work_Exp_list.click();
		Thread.sleep(2000);
		
		
		
		Actions action=new Actions(driver);
		action.sendKeys(Keys.ARROW_DOWN)
		.pause(1000)
		.sendKeys(Keys.ARROW_DOWN)
		.pause(1000)
		.sendKeys(Keys.ENTER).perform();
		
		
		
		//Use Escape keys at webapge
		action.sendKeys(Keys.ESCAPE).perform();
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
