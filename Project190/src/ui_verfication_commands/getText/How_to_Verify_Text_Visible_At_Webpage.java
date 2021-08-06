package ui_verfication_commands.getText;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.xml.internal.messaging.saaj.packaging.mime.Header;

public class How_to_Verify_Text_Visible_At_Webpage {

	public static void main(String[] args) throws Exception
	{
		
		
		/*
		 * When object doesn't contains any text or Object is at hidden
		 * state <<getText>> method return empty status..
		 */
		
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://outlook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement Signin_btn=driver.findElement(By.xpath("(//a[contains(.,'Sign in')])[1]"));
		Signin_btn.click();
		Thread.sleep(3000);

		//Taret page Header Location
		String HeaderText=driver.findElement(By.xpath("//div[@role='heading']")).getText();
		System.out.println(HeaderText);
		
		if(HeaderText!=null)    //Header will be empty when text is not visible at webpage
			System.out.println("Header is  visible at webpage");
		else
			System.out.println("Header is not visible at webpage");
		

	}

}
