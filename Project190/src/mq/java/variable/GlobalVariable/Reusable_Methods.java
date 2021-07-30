package mq.java.variable.GlobalVariable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Reusable_Methods 
{
	
	String driver_path="drivers\\chromedriver.exe";
	WebDriver driver;
	String url="https://opensource-demo.orangehrmlive.com/";
	String username="Admin";
	String password="admin123";
	
	public void launch_browser()
	{
		System.setProperty("webdriver.chrome.driver", driver_path);
		driver=new ChromeDriver();
	
	}
	
	public void load_webpage()
	{
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	public void User_Login()
	{
		driver.findElement(Reusable_objects.Login_UID).sendKeys(username);
		driver.findElement(Reusable_objects.Login_PWD).sendKeys(password);
		driver.findElement(Reusable_objects.Login_button).click();
	}
	

}
