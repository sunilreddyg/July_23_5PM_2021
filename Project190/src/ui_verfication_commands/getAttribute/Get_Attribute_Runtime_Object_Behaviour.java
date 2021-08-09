package ui_verfication_commands.getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Attribute_Runtime_Object_Behaviour {

	public static void main(String[] args) throws Exception 
	{
		/*
		 * Scenario:--> Verify Roundtrip radio button selection
		 * 		Given site url is "http://makemytrip.com"
		 * 		And verify triptype selecton oneway on browser launch
		 * 		When user tap on return date for bigger discounts
		 * 		Then Selection comes to roundtrip from oneway
		 */
		
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		WebElement Oneway_button=driver.findElement(By.xpath("//li[@data-cy='oneWayTrip']"));
		String Oneway_btn_classvalue=Oneway_button.getAttribute("class");
		if(Oneway_btn_classvalue.equals("selected"))
		{
			System.out.println("Oneway trip type is selected on browser launch");
			
			//Click on Retrun Date
			WebElement Return_Data=driver.findElement(By.xpath("//span[contains(.,'RETURN')]"));
			Return_Data.click();
			Thread.sleep(2000);
			
			
			WebElement TripType_Roundtrip=driver.findElement(By.xpath("//li[@data-cy='roundTrip']"));
			//Get Runtime property value using property name
			String Roundtrip_Status=TripType_Roundtrip.getAttribute("class");
			
			if(Roundtrip_Status.equals("selected"))
			{
				System.out.println("Testpass, As expected roundtrip is selected");
			}
			else
			{
				System.out.println("Testfail, Roundtrip is not selected");
			}
			
		}
		else
		{
			System.out.println("oneway trip type is not selected on webpage");
		}
		
		
		
		
		

	}

}
