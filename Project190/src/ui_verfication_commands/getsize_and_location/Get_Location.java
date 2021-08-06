package ui_verfication_commands.getsize_and_location;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Location {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://v1.hdfcbank.com/branch-atm-locator");
		driver.manage().window().maximize();
		
		
		WebElement City_Dropdown=driver.findElement(By.id("customCity"));
		
		int obj_x=City_Dropdown.getLocation().getX();
		int obj_y=City_Dropdown.getLocation().getY();
		
		System.out.println("Object x coordinates are --> "+obj_x);
		System.out.println("Object y coordinates are --> "+obj_y);
		
		if(obj_x < 500)
			System.out.println("Object exist at left side of page");
		else
			System.out.println("Object doesn't exist left side of the page");
		
		
		/*
		 * Coordinate only return when object visible at webpage, For 
		 * 	hidden objects coordinates return 0
		 */
		
		if(obj_x > 0)
			System.out.println("Object Visible at webpage");
		else
			System.out.println("Object hidden at webpage");
		
		
		

	}

}
