package webdriver_script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_Registration {

	public static void main(String[] args) throws Exception 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		
		driver.findElement(By.xpath("//a[contains(.,'Create New Account')]")).click();
		Thread.sleep(4000);
		
		
		driver.findElement(By.name("firstname")).sendKeys("Aakash");
		driver.findElement(By.xpath("//input[@aria-label='Surname']")).sendKeys("Krishna");
		driver.findElement(By.name("reg_email__")).sendKeys("info.aakash@gmail.com");
		driver.findElement(By.xpath("//input[@aria-label='Re-enter email address']")).sendKeys("info.aakash@gmail.com");
		
	}

}
