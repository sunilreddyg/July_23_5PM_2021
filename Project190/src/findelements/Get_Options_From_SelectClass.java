package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Get_Options_From_SelectClass {

	public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\New_browser_Drivers\\chromedriver.exe");    
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		
		
		WebElement Month_Dropdown=driver.findElement(By.id("year"));
		//Using Select class get Dropdown option tages
		List<WebElement> list=new Select(Month_Dropdown).getOptions();
		
		for (WebElement EachOption : list) 
		{
			EachOption.click();
			Thread.sleep(500);
		}

	}

}
