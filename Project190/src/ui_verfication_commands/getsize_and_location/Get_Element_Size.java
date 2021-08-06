package ui_verfication_commands.getsize_and_location;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Element_Size {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://v1.hdfcbank.com/branch-atm-locator");
		driver.manage().window().maximize();
		
		
		WebElement City_Dropdown=driver.findElement(By.id("customCity"));
		
		//Get OBject height and width
		int Obj_height=City_Dropdown.getSize().getHeight();
		int Obj_widht=City_Dropdown.getSize().getWidth();
		
		System.out.println("Object Height is --> "+Obj_height);
		System.out.println("Object width is --> "+Obj_widht);
		
		/*
		 * OBject height and width only return when object visible at webpage, For 
		 * 	hidden objects height and width return 0
		 */
		
		if(Obj_height > 0)
			System.out.println("Object visible at webpage");
		else
			System.out.println("Object hidden at webpage");

	}

}
