package interactions.Mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hover_on_Location {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\New_browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		
		//HRM login syntax
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		
		//Performing mouse hovering on location
		WebElement Time_Element=driver.findElement(By.id("menu_time_viewTimeModule"));
		new Actions(driver).moveToElement(Time_Element).perform();
		Thread.sleep(2000);
		
		
		//Performing mouse hovering on location
		WebElement Time_Reports_Menu=driver.findElement(By.id("menu_time_Reports"));
		new Actions(driver).moveToElement(Time_Reports_Menu).perform();
		
		
		WebElement Project_reports=driver.findElement(By.id("menu_time_displayProjectReportCriteria"));
		//Click method using mouse interactions class
		new Actions(driver).click(Project_reports).perform();
		
		
		
		
		

	}

}
