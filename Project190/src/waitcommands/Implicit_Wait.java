package waitcommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_Wait {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://facebook.com");
		driver.manage().window().maximize();

		
		long start_time=System.currentTimeMillis();
		
		try {
			driver.findElement(By.id("email"));
			System.out.println("object identified");
			System.out.println(System.currentTimeMillis()-start_time);
			
		} catch (Exception e) {
			System.out.println(System.currentTimeMillis()-start_time);
		}
		
		
		
		/*
		 * Note:-->
		 * 		=> Implicit wait enable dynamic timeout on NoSuchElement Exception
		 */
		
		
		
	}

}
