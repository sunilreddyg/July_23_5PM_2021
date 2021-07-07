package launching_browses;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch_Firefox_Browser 
{

	public static void main(String[] args) 
	{
		
		/*
		 * Inorder to launch firefox browser using webdriver
		 * we need a geckodriver.exe 
		 * 
		 * Download geckodriver w.r.t firefox browser version:--->
		 * 
		 * 	1. URL:--> https://firefox-source-docs.mozilla.org/testing/geckodriver/Support.html
		 *  2. Findout which version geckodriver supports to current browser
		 *  
		 *  	How to find firefox browser version
		 *  		Open Firefox --> click on setting ---> Help --> About firefox
		 *  
		 *  3. Click on geckodriver releases
		 *  4. under assets download geckodriver file w.r.t operating system and hotspot size
		 *  5. Set Runtime environment variable before launch firefox browser
		 * 
		 * 
		 */
		
		System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
		FirefoxDriver firefox=new FirefoxDriver();
		firefox.get("http://facebook.com");

	}

}
