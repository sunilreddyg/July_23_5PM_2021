package mq.java.variable.GlobalVariable;

import org.openqa.selenium.WebDriver;

public class Run_Reusable_methods_By_user1
{

	static WebDriver driver=null;
	
	public static void main(String[] args) throws Exception 
	{
		
		Reusable_Methods obj=new Reusable_Methods();
		obj.launch_browser();
		driver=obj.driver;  
		//Getting driver controls from reusablemethods class and 
		//assigning to current Class globarl variable    
		
		obj.load_webpage();
		System.out.println(driver.getTitle());
		
		obj.User_Login();
		
		System.out.println(driver.getCurrentUrl());
		
		
		Thread.sleep(4000);
		driver.close();
		
	}

}
