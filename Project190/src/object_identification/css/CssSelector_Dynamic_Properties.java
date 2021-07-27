package object_identification.css;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector_Dynamic_Properties {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.cssSelector("a[title='Create Rediffmail Account']")).click();
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("[name*='name']")).sendKeys("Sravan");
		
		
		
	}

}
