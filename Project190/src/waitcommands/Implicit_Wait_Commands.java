package waitcommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_Wait_Commands {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts()
		.implicitlyWait(100,TimeUnit.SECONDS)
		.pageLoadTimeout(100, TimeUnit.SECONDS)
		.setScriptTimeout(100, TimeUnit.SECONDS);
		
		
		/*
		 * Implicitlywait:-->
		 * 		Manage timeout until object available at DOM [Document Object model]
		 * 
		 * PageLoadTimeout:-->
		 * 		Manage timeout until all objects loaded into webpage
		 * 
		 * SetScriptTimeout:-->
		 * 		Manage timeout until asychronized source to load at pagesource
		 */

	}

}
