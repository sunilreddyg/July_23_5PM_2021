package webdriver_script.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_Dropdown_is_Multiple_Selection_Type {

	public static void main(String[] args) throws Exception 
	{
		
		/*
		 * FAQ:--> How to verify dropdown is single option or multiple option
		 * 			selection type. Using automation program
		 */
		
		
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://bridgeqsystems.com/demo.php");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//button[contains(.,'Select Menu')]")).click();
		Thread.sleep(4000);
		
		
		
		boolean flag=new Select(driver.findElement(By.id("exampleFormControlSelect1"))).isMultiple();
		System.out.println("Dropdown Multiple selection status is ---> "+flag);
		
		
		boolean flag1=new Select(driver.findElement(By.id("exampleFormControlSelect2"))).isMultiple();
		System.out.println("Dropdown Multiple selection status is ----> "+flag1);
		

		
	}

}
