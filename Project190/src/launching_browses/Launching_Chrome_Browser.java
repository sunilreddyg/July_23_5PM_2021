package launching_browses;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launching_Chrome_Browser 
{

	public static void main(String[] args) 
	{
		
		
		/*
		 * Inorder to launch chrome browser using webdriver
		 * We need chromedriver.exe file.
		 * 
		 * Download chromedriver.exe file:-->
		 * 
		 * 		1. URL:--> https://sites.google.com/chromium.org/driver/downloads
		 * 		2. Find current version of chrome browser which is installed in pc
		 * 				[Open chrome setting ---> Help Menu --> click 
		 * 				About google chrome ---> Watch it chrmome browser version]
		 * 		3. W.r.t chrome browser version download chromedriver
		 * 		
		 * 			for example:-->If you are using Chrome version 91, 
		 * 							please download ChromeDriver 91.0.4472.101
		 * 
		 * 		4. Click on Selected Version link, It takes to index page
		 * 		5. Downlaod chromedriver file w.r.t operating system
		 * 		6. Save zipformat file into backup drive
		 * 		7. Unzip the file, For this action we receive chromdriver.exe file
		 * 		8. Set Runtime Environment variable before lanching chrome browser
		 * 
		 */
		
		//Setting Environment variable for chromedriver.exe file
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		//Launching chrome browser
		ChromeDriver chrome=new ChromeDriver();
		
		//Load page to browser window
		chrome.get("http://facebook.com");
		
		
		
		
		

	}

}
