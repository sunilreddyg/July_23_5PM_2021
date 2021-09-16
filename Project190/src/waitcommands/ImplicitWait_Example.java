package waitcommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait_Example {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://google.com");
		driver.manage().window().maximize();
		
		
		//Facebook page id
		driver.findElement(By.id("email"));
		System.out.println("Email identified at facebook page");
		
		//Outlook Page ID
		driver.findElement(By.xpath("(//a[contains(.,'Sign in')])[1]"));
		System.out.println("signin button identified at outlook page");
		
		//Facebook page id
		driver.findElement(By.id("email"));
		System.out.println("Email identified at facebook page");
		
		

	}

}
