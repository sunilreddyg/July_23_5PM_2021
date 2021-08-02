package orange_HRM.ProjectB;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Run_Repository 
{
	static WebDriver driver;
	static String url="https://opensource-demo.orangehrmlive.com/";

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		
		Repository repo=new Repository(driver);
		repo.print_page_title();
		

	}

}
