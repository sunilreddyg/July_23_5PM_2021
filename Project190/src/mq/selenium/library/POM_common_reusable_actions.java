package mq.selenium.library;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class POM_common_reusable_actions 
{
	
	public WebDriver driver;
	String MainwindowID;
	WebDriverWait wait;
	public POM_common_reusable_actions(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	
	
	/*
	 * Keyword:--> load webpage to browser window
	 * Aurhot:-->SunilReddy
	 * parameters used:--> Local parameters
	 */
	public void load_webpage(String url)
	{
		driver.get(url);
		MainwindowID=driver.getWindowHandle();
	}
	
	
	 /*
	 * KeyWord:--> This keyword manage implicit timeout
	 * Author:--> SunilReddy
	 * Parameters Used:-->  Local Parameter
	 */
	 public void set_implicitwait(int time_in_sec)
	 {
		 driver.manage().timeouts().implicitlyWait(time_in_sec, TimeUnit.SECONDS);
	 }
	 
	 
	 /*
	 * KeyWord:--> This keyword manage Page laod timeout
	 * Author:--> SunilReddy
	 * Parameters Used:-->  Local Parameter
	 */
	 public void set_page_load_timeout(int time_in_sec)
	 {
		 driver.manage().timeouts().pageLoadTimeout(time_in_sec, TimeUnit.SECONDS);
	 }
		
	 
	 /*
	 * KeyWord:--> This keyword manage asynchronized timeout
	 * Author:--> SunilReddy
	 * Parameters Used:-->  Local Parameter
	 */
	 public void set_async_timeout(int time_in_sec)
	 {
		 driver.manage().timeouts().setScriptTimeout(time_in_sec, TimeUnit.SECONDS);
	 }
	 
	 
	 /*
	 * KeyWord:--> This keyword set explicit wait time
	 * Author:--> SunilReddy
	 * Parameters Used:-->  Local Parameter
	 */
	 public void set_explicitwait_time(int Time_in_sec)
	 {
		wait=new WebDriverWait(driver, Time_in_sec);
	 }
		 
		 
	 /*
	 * KeyWord:--> This keyword Manage timeout until expected object visible at webpage
	 * Author:--> SunilReddy
	 * Parameters Used:-->  Local Parameter
	 */
	 public void wait_until_object_visibleAt_page(WebElement element)
	 {
		 try {
			
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			e.printStackTrace();
		
		}
		
	 }
		 
	 
	 /*
	 * KeyWord:--> This keyword Type text into editbox
	 * Author:--> SunilReddy
	 * Parameters Used:-->  Local Parameter
	 */
	public void Type_text(WebElement element,String inputdata)
	{
		try {
			wait_until_object_visibleAt_page(element);
			element.clear();
			element.sendKeys(inputdata);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	/*
	 * KeyWord:--> This keyword Click on location [Buttons,Radio,Checkbox,list---etc]
	 * Author:--> SunilReddy
	 * Parameters Used:-->  Local Parameter
	 */
	public void click_element(WebElement element)
	{
		try {
			wait_until_object_visibleAt_page(element);
			element.click();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		
	 

}
