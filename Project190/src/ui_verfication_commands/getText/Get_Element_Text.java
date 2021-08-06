package ui_verfication_commands.getText;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Element_Text {

	public static void main(String[] args) throws Exception {
		
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
		
		
		WebElement Error_location=driver.findElement(By.xpath("//div[@id='usernameError']"));
		String Act_Errmsg=Error_location.getText();

		String Exp_Errmsg="That Microsoft account doesn't exist. Enter a different account or get a new one.";
		
		
		//Verify equal comparision between two strings
		if(Act_Errmsg.equals(Exp_Errmsg))
			System.out.println("Testpass. Expected error message displayed");
		else
			System.out.println("Tetfail, Expected error message not displayed");
		

	}

}
