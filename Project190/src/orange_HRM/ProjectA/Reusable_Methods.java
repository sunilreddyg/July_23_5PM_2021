package orange_HRM.ProjectA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Reusable_Methods 
{
	
	WebDriver driver;
	String driver_path="drivers\\chromedriver.exe";
	String url="https://opensource-demo.orangehrmlive.com/";
	

	public void Launch_chrome_browser()
	{
		System.setProperty("webdriver.chrome.driver",driver_path);
		driver=new ChromeDriver();
	}

	public void Load_webpage()
	{
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	
	
	

}
