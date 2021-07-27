package object_identification.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Attribute_And_Text_Identificaton {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/free-job-alerts");
		driver.manage().window().maximize();

		
		//Identifying object with xpath attribute format
		driver.findElement(By.xpath
				("//input[@placeholder='Skills, Designations, Roles, Companies']")).sendKeys("Software Testing");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[.='Manual Testing']")).click();
		
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[.='Automation Testing']")).click();
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[.='Selenium']")).click();
		
		
		
		
		
		
		
		
		
		
		
	}

}
