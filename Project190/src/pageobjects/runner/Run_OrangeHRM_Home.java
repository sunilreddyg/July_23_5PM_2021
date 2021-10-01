package pageobjects.runner;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageobjects.pages.HRM_home;


public class Run_OrangeHRM_Home {

	public static void main(String[] args) throws Exception 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUNIL\\Desktop\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		
		//Verify username Editbox allow to clear text 
		HRM_home home=new HRM_home(driver);
		home.Login_Username.sendKeys("Sunil");
		Thread.sleep(2000);
		home.Login_Username.clear();
		//Verify clear functionality
		boolean flag=home.Login_Username.getAttribute("value").isEmpty();
		System.out.println(flag);
		
		
		
		//valid user login
		home.type_username("Admin");
		home.type_password("admin123");
		home.click_login_button();
		
		

	}

}
