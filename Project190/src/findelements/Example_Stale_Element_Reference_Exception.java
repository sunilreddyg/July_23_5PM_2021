package findelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_Stale_Element_Reference_Exception {

	public static void main(String[] args) throws Exception {
		
		

		System.setProperty("webdriver.chrome.driver", "E:\\New_browser_Drivers\\chromedriver.exe");    
		WebDriver driver=new ChromeDriver();
		driver.get("https://instagram.com");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("user1");
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@name,'username')]")).clear();
		driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("user2");
		
		
		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("pwd1");
		driver.navigate().refresh();  //When page refresh are changed varaible will expire
		password.clear();
		password.sendKeys("pwd2");
		
	}

}
