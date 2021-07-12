package webdriver_script.Editbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keyboard_Keys {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.name("firstname"))
		.sendKeys("Akshay"+Keys.TAB+"Kumar"+Keys.TAB+"Akshay@gmail.com");
		
		
		//Selecting dropdown option using keyboard shortcuts
		driver.findElement(By.id("day")).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN);
		
		//Selecting dropdown option using keyboard shortcuts
		driver.findElement(By.name("birthday_month")).sendKeys("D");
		
		
		
		
		/*
		 * Note:--> Don't use sendkeys method to select dropdown options
		 * 			Becuase webdriver had separate methdos to do that.
		 */
		
		
		
		
		
		
		
		

	}

}
