package ui_verfication_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_page_title 
{

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		
		
		String Exp_title="SeleniumHQ Browser Automation";
		
		
		//Get Runtime title
		String Act_title=driver.getTitle();
		
		//Verify equal comparision between actual and expected tilte
		boolean flag=Act_title.equals(Exp_title);
		System.out.println("Selenium Hompage title is verified ? --> "+flag);
		
		
		//Conditional statement for further script execution on title verified
		if(flag==true)
		{
			System.out.println("Selenium Homepage title found correct");
			
			WebElement Downloads=driver.findElement(By.xpath("//a[@class='nav-item'][contains(.,'Downloads')]"));
			Downloads.click();
			
				if(driver.getTitle().equals("Downloads"))
				{
					System.out.println("Downloads page verified");
				}
				else
				{
					System.out.println("Download page title not verified");
				}
		}
		else
		{
			System.out.println("Selenium homepage title found wrong");
		}
		
		
		Thread.sleep(4000);
		driver.close();

	}

}
