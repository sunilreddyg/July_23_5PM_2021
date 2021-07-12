package webdriver_script.Editbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear_Method 
{

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		
		
		//Type mobile number
		driver.findElement(By.name("firstname")).sendKeys("9030248855");
		Thread.sleep(5000);
		driver.findElement(By.name("firstname")).clear();
		
		
	
		driver.get("https://paytm.com/");
	
		
		driver.findElement(By.xpath("//input[@data-reactid='208']")).sendKeys("90");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@data-reactid='208']")).sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE);
		
		
		
		
		
		
		/*
		 * Clear:-->
		 * 			Method was designed to clear text at editbox.When 
		 * 			Clear method was used for other objects we get error
		 * 			message called  "InvalidElementStateException"
		 */
		
		
		

	}

}
