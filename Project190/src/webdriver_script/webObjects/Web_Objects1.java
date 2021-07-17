package webdriver_script.webObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Objects1 
{

	public static void main(String[] args) throws Exception
	{
		
		//WebDriver browser initiation commands
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();   //It delete previous history
		Thread.sleep(5000);
		
		
		//Step to click roundtrip radio button
		driver.findElement(By.xpath("(//span[@class='radio__circle bs-border bc-neutral-500 bw-1 ba'])[2]")).click();
		
		
		/*
		 * Selecting Option from auto-complete editbox.
		 * 
		 * 		Step1:--> Type Referral text into editbox
		 * 		Step2:--> Wait until sugesstion displayed
		 * 		Step3:--> Select any one sugesstion by click on it.
		 */
		driver.findElement(By.xpath("(//span[@class='radio__circle bs-border bc-neutral-500 bw-1 ba'])[2]")).click();
		driver.findElement(By.xpath("(//span[@class='radio__circle bs-border bc-neutral-500 bw-1 ba'])[2]"))
		.sendKeys("HYD");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//p[contains(.,'Hyderabad, IN - Rajiv Gandhi International (HYD)')]")).click();
		

	}

}
