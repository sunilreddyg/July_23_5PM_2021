package capturescreen;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WebDriver_ScreenCapture_Method 
{

	public static void main(String[] args) throws IOException 
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\New_browser_Drivers\\chromedriver.exe");    
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		
		
		//Capturescree and convert int file output
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.createDir(new File("Screens"));
		FileHandler.copy(src, new File("Screens\\sample.png"));     //.PNG [Portable network graphic]
		
		
		
		/*
		 * Disadvantages:-->
		 * 			=> In Selenium 3.14 screen capture only visible interface
		 * 			=> Solution:--> Upgrade to selenium 4 version 
		 * 
		 * 			=> Every time program running screen is overriding
		 * 			=> Solution:--> Attach time stamp to image name
		 * 
		 * 			=> Can't capture when alert presented at webapge  [Alert throw exception unhandled alert exception]
		 * 			=> Use Robot[AWT] framework to capture screen on alert
		 */
		
		
		
	}

}
