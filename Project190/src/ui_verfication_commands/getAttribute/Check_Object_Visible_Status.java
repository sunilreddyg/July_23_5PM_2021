package ui_verfication_commands.getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check_Object_Visible_Status {

	public static void main(String[] args) throws Exception 
	{
		
		
		/*
		 * Scenario:--> Verify object returen date visible status
		 * 	
		 * 			Given site url is "https://www.facebook.com/r.php"
		 * 			When user enter valid email
		 * 			Then verify retype password visible at webpag
		 */
		
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/r.php");
		driver.manage().window().maximize();
		
		
		
		
		WebElement email=driver.findElement(By.name("reg_email__"));
		email.sendKeys("info@gmail.com");
		Thread.sleep(4000);
		
		
		String status=driver.findElement(By.xpath("//div[@id='reg_form_box']/div[3]")).getAttribute("style");
		if(status.equals("opacity: 1;"))
		{
			System.out.println("Object is at visible state");
		}
		else
		{
			System.out.println("Object is not at visible state");
		}

	}

}
