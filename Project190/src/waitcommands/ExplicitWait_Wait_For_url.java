package waitcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_Wait_For_url {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://selenium.dev");
		driver.manage().window().maximize();
		
		
		try {
			new WebDriverWait(driver,50).until(ExpectedConditions.urlToBe("https://www.selenium.dev/"));
			System.out.println("Selenium homepage url is verified");
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
		
		WebElement Download_Tab=driver.findElement(By.xpath("//span[contains(.,'Downloads')]"));
		Download_Tab.click();
		
		
		try {
			new WebDriverWait(driver, 30).until(ExpectedConditions.urlContains("downloads/"));
			System.out.println("Downloads page url is verified");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
