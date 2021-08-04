package ui_verfication_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Verify_Page_url {

	public static void main(String[] args) 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		
		
		if(driver.getCurrentUrl().equals("https://www.selenium.dev/"))
		{
			System.out.println("Url verified for selenium homepage");
			
			WebElement Downloads=driver.findElement(By.xpath("//a[@class='nav-item'][contains(.,'Downloads')]"));
			Downloads.click();
			
				if(driver.getCurrentUrl().contains("downloads/"))
					System.out.println("Downloads page url verified");
				else
					System.out.println("Download page url found invalid");
				
		}
		else
		{
			System.out.println("Url found mismatch for selenium page");
		}

	}

}
