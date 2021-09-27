package findelements;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Group_links 
{

	public static void main(String[] args) throws Exception 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\New_browser_Drivers\\chromedriver.exe");    
		WebDriver driver=new ChromeDriver();
		driver.get("https://instagram.com");
		driver.manage().window().maximize();
		
		
		WebElement Footer_location=driver.findElement(By.xpath("//*[@id='react-root']/section/footer/div/div[1]"));
		List<WebElement> Footer_links=Footer_location.findElements(By.tagName("a"));
		System.out.println(Footer_links.size());
		
		String mainwindow=driver.getWindowHandle();
		
		
		for (int i = 0; i < Footer_links.size(); i++) 
		{
			//Get Each link using index number
			WebElement Each_link=Footer_links.get(i);
			String linkName=Each_link.getText();
			String linkhref=Each_link.getAttribute("href");
			String linktarget=Each_link.getAttribute("target");
			
			
			
			if(linktarget.contains("_blank"))
			{
				Each_link.click();
				new WebDriverWait(driver, 10).until(ExpectedConditions.numberOfWindowsToBe(2));
				
				Set<String> allwindows=driver.getWindowHandles();
				for (String eachwindow : allwindows) 
				{
					driver.switchTo().window(eachwindow);
				}
				Thread.sleep(1000);
				System.out.println(linkName+"   "+driver.getTitle());
				driver.close(); //Close sub window
				driver.switchTo().window(mainwindow);
				
			}
			else
			{
				Each_link.click();
				Thread.sleep(2000);
				System.out.println(linkName+"    "+driver.getTitle());
				driver.navigate().back(); 
				Thread.sleep(2000);
			}
			
			
			
		
			//Restore all page references to avoid stale element reference exception
			Footer_location=driver.findElement(By.xpath("//*[@id='react-root']/section/footer/div/div[1]"));
			Footer_links=Footer_location.findElements(By.tagName("a"));
		}

	}

}
