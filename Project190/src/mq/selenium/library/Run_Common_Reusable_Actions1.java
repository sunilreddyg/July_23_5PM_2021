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
		
		action.Type_text("//input[@id='txtUsername']", "Admin");
		action.Type_text_using_keyboard("//input[@id='txtPassword']", "admin123");
		action.javawait(1000);
		action.click_element("//input[@id='btnLogin']");
		
		

	}

}
