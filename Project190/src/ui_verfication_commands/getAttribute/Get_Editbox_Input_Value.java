package ui_verfication_commands.getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Editbox_Input_Value {

	public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		WebElement Username=driver.findElement(By.id("email"));
		Username.clear();
		Username.sendKeys("darshan@gmail.com");
		Thread.sleep(4000);
		
		//It will read text presented inside the editbox
		String Input_Value=Username.getAttribute("value");
		System.out.println(Input_Value);
		

	}

}
