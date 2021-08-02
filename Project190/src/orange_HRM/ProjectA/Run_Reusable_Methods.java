package orange_HRM.ProjectA;

import org.openqa.selenium.WebDriver;

public class Run_Reusable_Methods 
{
	
	static WebDriver driver;

	public static void main(String[] args) 
	{
	
		Reusable_Methods obj=new Reusable_Methods();
		obj.Launch_chrome_browser();
		obj.Load_webpage();
		
		driver=obj.driver;
		System.out.println(driver.getTitle());
		
		//Close browser
		driver.close();
		

	}

}
