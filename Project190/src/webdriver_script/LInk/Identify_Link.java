package webdriver_script.LInk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Identify_Link {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		//Identifying link using full link name property
		driver.findElement(By.linkText("Forgotten password?")).click();
		
		//Identifying link using full link name property
		driver.findElement(By.linkText("Marketplace")).click();
		
		
		
		

	}

}
