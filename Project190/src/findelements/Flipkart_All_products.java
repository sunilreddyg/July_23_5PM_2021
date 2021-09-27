package findelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_All_products {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\New_browser_Drivers\\chromedriver.exe");    
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/search?q=iphone+11&sid=tyy%2C4io&as=on&as-show=on&otracker=AS_QueryStore_OrganicAutoSuggest_1_6_na_na_na&otracker1=AS_QueryStore_OrganicAutoSuggest_1_6_na_na_na&as-pos=1&as-type=HISTORY&suggestionId=iphone+11%7CMobiles&requestId=f4f45604-e4ea-490e-824b-a8b18d28a609");
		driver.manage().window().maximize();
		
		
		WebElement Next_button=driver.findElement(By.xpath("//span[contains(.,'Next')]"));
		boolean flag=false;
		
		do {
			
			
			
			
			Next_button=driver.findElement(By.xpath("//span[contains(.,'Next')]"));
			flag=Next_button.isDisplayed();
			if(flag==true)
			{
				Next_button.click();
				Thread.sleep(2000);
			}
			
			
		} while (flag==true);

	}

}
