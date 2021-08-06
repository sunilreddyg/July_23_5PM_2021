package ui_verfication_commands.getText;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Text_Visible_At_Webpage 
{

	public static void main(String[] args) throws Exception
	{
		
		/*
		 * Scenario:-->
		 * 			Verify login with invalid email
		 * 	
		 * 			Given site url http://outlook.com
		 * 			And click signin button
		 * 			When user Enter invalid email "info3efdf@gmail.com"
		 * 			And click Next button
		 * 			Then verify Error message displayed at error location
		 */
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://outlook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement Signin_btn=driver.findElement(By.xpath("(//a[contains(.,'Sign in')])[1]"));
		Signin_btn.click();
		
		WebElement Email=driver.findElement(By.xpath("//input[@id='i0116']"));
		Email.clear();
		Email.sendKeys("info3efdf@gmail.com"+Keys.ENTER);
		Thread.sleep(4000);
		
		//Targeting page body and capture entire visible text at webpage
		String Page_Visible_Text=driver.findElement(By.tagName("body")).getText();
		System.out.println(Page_Visible_Text);
		
		
		String Exp_Errmsg="That Microsoft account doesn't exist. Enter a different account or get a new one.";

		
		//Verify Expected error message dispalyed on page
		if(Page_Visible_Text.contains(Exp_Errmsg))
		{
			System.out.println("Testpass, Expected error message displayed");
		}
		else
		{
			System.out.println("Testfail, Expected error message not displayed at webpage");
		}
		
		
	}

}
