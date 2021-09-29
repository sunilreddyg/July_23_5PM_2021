package mq.selenium.library;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonReusableActions 
{
	public WebDriver driver=null;
	public WebDriverWait wait;
	
	String driver_path="new_drivers\\";
	
	/*
	 * Keyword:--> Launch browser  [Chrome,edge,firefox]
	 * Aurhot:-->
	 * parameters used:-->
	 */
	public void launch_browser(String browsername)
	{
		switch (browsername) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", driver_path+"chromedriver.exe");
			driver=new ChromeDriver();
			break;

		case "firefox":
			System.setProperty("webdriver.gecko.driver", driver_path+"geckodriver.exe");
			driver=new FirefoxDriver();
			break;
			
		case "edge":
			System.setProperty("webdriver.edge.driver", driver_path+"msedgedriver.exe");
			driver=new EdgeDriver();
			break;
		default:System.out.println("browser name is mismatch");
			break;
		}
	}
	
	/*
	 * Keyword:--> set window size
	 * Aurhot:-->SunilReddy
	 * parameters used:--> Local parameters
	 */
	public void setwindow_size(int width, int height)
	{
		driver.manage().window().setSize(new Dimension(width, height));
	}
	
	
	/*
	 * Keyword:--> load webpage to browser window
	 * Aurhot:-->SunilReddy
	 * parameters used:--> Local parameters
	 */
	public void load_webpage(String url)
	{
		driver.get(url);
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
	 public void wait_until_object_visibleAt_page(String element_xpath)
	 {
		 try {
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(element_xpath)));
		} catch (Exception e) {
			e.printStackTrace();
		
		}
		
	 }
		 
	 
	 /*
	 * KeyWord:--> This keyword Type text into editbox
	 * Author:--> SunilReddy
	 * Parameters Used:-->  Local Parameter
	 */
	public void Type_text(String xpath,String inputdata)
	{
		try {
			wait_until_object_visibleAt_page(xpath);
			driver.findElement(By.xpath(xpath)).sendKeys(inputdata);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	 /*
	 * KeyWord:--> This keyword Type text into editbox using javascript
	 * Author:--> SunilReddy
	 * Parameters Used:-->  Local Parameter
	 */
	public void Type_text_using_js(String xpath,String inputdata)
	{
		try {
			wait_until_object_visibleAt_page(xpath);
			WebElement Element=driver.findElement(By.xpath(xpath));
			((JavascriptExecutor)driver).executeScript("arguments[0].value='text'", Element);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	 /*
	 * KeyWord:--> This keyword Type text into editbox
	 * Author:--> SunilReddy
	 * Parameters Used:-->  Local Parameter
	 */
	public void Type_text_using_keyboard(String xpath,String inputdata)
	{
		try {
			wait_until_object_visibleAt_page(xpath);
			WebElement Element=driver.findElement(By.xpath(xpath));
			new Actions(driver).sendKeys(Element, inputdata).perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	/*
	 * KeyWord:--> This keyword Click on location [Buttons,Radio,Checkbox,list---etc]
	 * Author:--> SunilReddy
	 * Parameters Used:-->  Local Parameter
	 */
	public void click_element(String xpath)
	{
		try {
			wait_until_object_visibleAt_page(xpath);
			driver.findElement(By.xpath(xpath)).click();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	/*
	 * KeyWord:--> This keyword Click on location using mouse actions[Buttons,Radio,Checkbox,list---etc]
	 * Author:--> SunilReddy
	 * Parameters Used:-->  Local Parameter
	 */
	public void click_element_using_Mouse(String xpath)
	{
		try {
			wait_until_object_visibleAt_page(xpath);
			WebElement element=driver.findElement(By.xpath(xpath));
			new Actions(driver).click(element).perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * KeyWord:--> This keyword Click on location [Buttons,Radio,Checkbox,list---etc]
	 * Author:--> SunilReddy
	 * Parameters Used:-->  Local Parameter
	 */
	public void click_element__with_js(String xpath)
	{
		
		try {
			wait_until_object_visibleAt_page(xpath);
			WebElement element=driver.findElement(By.xpath(xpath));
			((JavascriptExecutor)driver).executeScript("arguments[0].click()", element);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	/*
	 * Manage static timeout
	 */
	public void javawait(int ms)
	{
		try {
			Thread.sleep(ms);
		} catch (Exception e) {
			
		}
	}
	
	

	/*
	 * KeyWord:--> This keyword Select Dropdown Option using [visibletext,value,index] numbers
	 * Author:--> SunilReddy
	 * Parameters Used:-->  Local Parameter
	 */
	public void select_dropdown(String xpath,String selector,String option)
	{
		try {
			
			wait_until_object_visibleAt_page(xpath);
			Select dropdown_selector=new Select(driver.findElement(By.xpath(xpath)));
			switch (selector) {
			case "text":
				dropdown_selector.selectByVisibleText(option);
				break;
				
			case "value":
				dropdown_selector.selectByValue(option);
				break;
				
			case "index":
				int index = Integer.parseInt(option);
				dropdown_selector.selectByIndex(index);
				break;

			default:System.out.println("selector mismatch");
				break;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	/*
	 * KeyWord:--> This keyword perform mouseHover action on element
	 * Author:--> SunilReddy
	 * Parameters Used:-->  Local Parameter
	 */
	public void mousehover(String xpath)
	{
		try {
			wait_until_object_visibleAt_page(xpath);
			WebElement element=driver.findElement(By.xpath(xpath));
			new Actions(driver).moveToElement(element).perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	/*
	 * KeyWord:--> This keyword perform RightClick action on element
	 * Author:--> SunilReddy
	 * Parameters Used:-->  Local Parameter
	 */
	public void RightClick_Action(String xpath)
	{
		try {
			wait_until_object_visibleAt_page(xpath);
			WebElement element=driver.findElement(By.xpath(xpath));
			new Actions(driver).contextClick(element).perform();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	/*
	 * KeyWord:--> This keyword perform DragAndDrop option
	 * Author:--> SunilReddy
	 * Parameters Used:-->  Local Parameter
	 */
	public void drag_element_to_Target(String Sourcexpath,String targetxpath)
	{
		
		try {
			WebElement Src=driver.findElement(By.xpath(Sourcexpath));
			WebElement Target=driver.findElement(By.xpath(targetxpath));
			new Actions(driver).dragAndDrop(Src, Target).perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	/*
	 * KeyWord:--> This keyword drag object to requried target
	 * Author:--> SunilReddy
	 * Parameters Used:-->  Local Parameter
	 */
	public void drag_element_to_required_coordinates(String Sourcexpath,int xcoord, int ycoord)
	{
		
		try {
			WebElement Src=driver.findElement(By.xpath(Sourcexpath));
			new Actions(driver).dragAndDropBy(Src, xcoord, ycoord).perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * KeyWord:--> Send keys any requied location
	 * Author:--> SunilReddy
	 * Parameters Used:-->  Local Parameter
	 */
	public void Send_keyboard_keys(String xpath,Keys key)
	{
		
		WebElement Src=driver.findElement(By.xpath(xpath));
		new Actions(driver).sendKeys(Src, key).perform();
	}
	
	
	
	

}
