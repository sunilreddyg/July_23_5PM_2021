package object_identification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_Attribute_Syntax {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.yahoo.com/");
		driver.manage().window().maximize();

		//Clicking Create button link
		driver.findElement(By.cssSelector("a[class='pure-button puree-button-secondary challenge-button']")).click();
		
		//Identifying firname and surname with cssSelector properties
		driver.findElement(By.cssSelector("input[autocomplete='given-name']")).sendKeys("Newuser");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[class='ureg-lname ']")).sendKeys("webdriver");
	}

}
