package ui_verfication_commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page_Verification_Commands {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		
		//Get Current page title
		String page_title=driver.getTitle();
		System.out.println(page_title);
		
		
		//Get Current page url
		String page_url=driver.getCurrentUrl();
		System.out.println(page_url);
		
		
		//Get Current Dynamic window ID  [It is different from browser to browser] 
		String WindowID=driver.getWindowHandle();
		System.out.println(WindowID);
		
		
		//Get PageSource
		String Page_Source=driver.getPageSource();
		System.out.println(Page_Source);
		

	}

}
