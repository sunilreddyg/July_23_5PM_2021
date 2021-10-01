package mq.selenium.library;

public class Run_Common_Reusable_Actions1 
{

	public static void main(String[] args) 
	{
		
		
		CommonReusableActions action=new CommonReusableActions();
		action.launch_browser("chrome");
		action.setwindow_size(1366, 768);
		action.load_webpage("https://opensource-demo.orangehrmlive.com/");
		action.set_explicitwait_time(20);
		
		
		if(action.verify_titlePresented("OrangeHRM"))
		{
			action.Type_text("//input[@id='txtUsername']", "Admin");
			action.Type_text_using_keyboard("//input[@id='txtPassword']", "admin123");
			action.javawait(1000);
			action.click_element("//input[@id='btnLogin']");
			action.javawait(4000);
			action.capturescreen("AccountPage");
			action.click_element("//b[contains(.,'Admin')]");
			action.select_dropdown("//select[contains(@id,'userType')]", "text", "ESS");
			action.javawait(2000);
			String OptionName=action.getSelectedValueInDropDown("//select[contains(@id,'userType')]");
			System.out.println(OptionName);
		}
		else
		{
			System.out.println("Homepage title is mismatched");
		}
		
		
		
		

	}

}
