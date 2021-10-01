package pageobjects.runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import mq.selenium.library.POM_common_reusable_actions;
import pageobjects.pages.HRM_home;

public class RunPageobjects_Using_Reusable_keywords {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUNIL\\Desktop\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		
		POM_common_reusable_actions actions=new POM_common_reusable_actions(driver);
		actions.load_webpage("https://opensource-demo.orangehrmlive.com/");
		
		HRM_home home=new HRM_home(driver);
		actions.Type_text(home.Login_Username, "Admin");
		actions.Type_text(home.Login_password, "admin123");
		actions.click_element(home.Login_button);
	}

}
