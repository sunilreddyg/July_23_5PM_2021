package object_identification.css;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Default_CssSelector 
{

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.yahoo.com/");
		driver.manage().window().maximize();
		
		
		//Object identification with cssSelector property when class have spaces
		driver.findElement(By.cssSelector(".pure-button.puree-button-secondary.challenge-button")).click();
		
		//Object identification with cssSelector property
		driver.findElement(By.cssSelector(".ureg-fname")).sendKeys("NEwuser");
		
		//Object identification with cssSelector
		driver.findElement(By.cssSelector(".ureg-lname")).sendKeys("Webdriver");
	}

}
