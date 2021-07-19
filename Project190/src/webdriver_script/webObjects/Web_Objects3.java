package webdriver_script.webObjects;

import org.omg.PortableServer.THREAD_POLICY_ID;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Web_Objects3 
{

	public static void main(String[] args) throws Exception 
	{
		
	
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies(); 
		
		
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@href='#'][contains(.,'Hyderabad (HYD)')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[contains(.,'Bengaluru (BLR)')])[2]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[contains(.,'25')])[3]")).click();
		
		
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		Thread.sleep(2000);
		new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult"))).selectByIndex(4);
		
		driver.findElement(By.xpath("//input[contains(@id,'FindFlights')]")).click();
		
		
		
	}

}
