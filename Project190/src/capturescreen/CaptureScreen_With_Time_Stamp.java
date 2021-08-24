package capturescreen;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreen_With_Time_Stamp {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\New_browser_Drivers\\chromedriver.exe");    
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		
		
		
		//Create object for Date
		Date date=new Date();     //import java.util    
		System.out.println(date.toString());
		//Create own date format
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MMM-dd-hh-mm-ss");
		//Covert date format 
		String time=sdf.format(date);
		
		
		
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.createDir(new File("Screens"));
		FileHandler.copy(src, new File("Screens\\JqueryUI_HOmepage"+time+".png"));
		
		
		

	}

}
