package pageobjects.runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import mq.selenium.library.POM_common_reusable_actions;
import pageobjects.pages.Admin_Menu;
import pageobjects.pages.HRM_home;
import pageobjects.pages.IndexPage;

public class Test_AdminPage_With_Keywords {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUNIL\\Desktop\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		POM_common_reusable_actions actions=new POM_common_reusable_actions(driver);
		actions.load_webpage("https://opensource-demo.orangehrmlive.com/");
		
		HRM_home home=new HRM_home(driver);
		actions.Type_text(home.Login_Username, "Admin");
		actions.Type_text(home.Login_password, "admin123");
		actions.click_element(home.Login_button);
		Thread.sleep(3000);
		
		IndexPage indexpage=new IndexPage(driver);
		actions.click_element(indexpage.admin);
		
		Admin_Menu admin=new Admin_Menu(driver);
		actions.Type_text(admin.Username, "Aravind");
		

	}

}
