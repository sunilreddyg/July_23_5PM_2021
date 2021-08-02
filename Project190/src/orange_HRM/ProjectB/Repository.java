package orange_HRM.ProjectB;

import org.openqa.selenium.WebDriver;

public class Repository 
{
	WebDriver driver=null;
	public Repository(WebDriver driver)
	{
		this.driver=driver;
		//this keyword access current class global variable
	}
	
	public void print_page_title()
	{
		System.out.println(driver.getTitle());
	}

}
