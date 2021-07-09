package webdriver_script.Editbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Senkeys_Method 
{

	public static void main(String[] args) 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://outlook.com");
		driver.manage().window().maximize();
		
		//Clicking Signin button
		driver.findElement(By.xpath("(//a[contains(.,'Sign in')])[1]")).click();
		
		//Type email at textbox and press keyboard shortcut ENTER
		driver.findElement(By.id("i0116")).sendKeys("sunilreddy.gajjala@outlook.com"+Keys.ENTER);
		
		

	}

}
