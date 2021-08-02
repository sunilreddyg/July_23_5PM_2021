package mq.java.variable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class Wrapping_Element_or_Locator 
{
	static WebDriver driver;
	static String url="https://opensource-demo.orangehrmlive.com/";
	static String driver_path="drivers\\chromedriver.exe";
	
	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", driver_path);
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		
		//Without Any reference
		driver.findElement(By.id("txtUsername")).clear();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		
		//Storing page object location into reference variable
		WebElement Password=driver.findElement(By.id("txtPassword"));
		Password.clear();
		Password.sendKeys("admin123");
		
		
		//Storing location into Refernce variable
		By Login_btn_locator=By.id("btnLogin");
		driver.findElement(Login_btn_locator).click();
		
		By Admin_Menu_option=By.id("menu_admin_viewAdminModule");
		driver.findElement(Admin_Menu_option).click();
		
		By User_role_loc=By.id("searchSystemUser_userType");
		WebElement User_role_Element=driver.findElement(User_role_loc);
		Select User_Role_Selector=new Select(User_role_Element);
		User_Role_Selector.selectByVisibleText("ESS");
		
		System.out.println("All dropdown options "+"\n"+User_role_Element.getText());
		
	}

}
