package waitcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_Page_title 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://selenium.dev");
		driver.manage().window().maximize();
		
		
		//Enabled explicit timeout on automatio browser
		WebDriverWait wait=new WebDriverWait(driver, 50);
		
		try {
			wait.until(ExpectedConditions.titleIs("Selenium"));
			System.out.println("Selenium title is verified");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		WebElement Download_Tab=driver.findElement(By.xpath("//span[contains(.,'Downloads')]"));
		Download_Tab.click();
		
		
		
		try {
			wait.until(ExpectedConditions.titleContains("Downloads"));
			System.out.println("Downlaod page title verified");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		

	}

}
