package ui_verfication_commands.getAttribute;


import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Verify_System_Data_With_Departue_Date {

	public static void main(String[] args) throws Exception 
	{
		
		
		/*
		 * Testcase:-->
		 * 				verify Departure date matching with system date..
		 */
		
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		
		//Reading input text from departure editbox
		WebElement Departure_Editbox=driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']"));
		String DepartureDate=Departure_Editbox.getAttribute("value");
		System.out.println(DepartureDate);
		
		
		//Get System Default time
		Date date=new Date();        //import java.util
		System.out.println(date.toString());
		
		//Create simple date format accoring to departure date format
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM");
		String System_Date=sdf.format(date);
		System.out.println(System_Date);
		
		
		
		if(DepartureDate.equals(System_Date))
			System.out.println("Testpass as expected departure date match with system date");
		else
			System.out.println("Testfail system date mismatch with departrue date");
		
		
		/*
		 * dd ---> day  	[0-31]
		 * MM ---> month 	[01-12]
		 * MMM---> month	[jan-dec]
		 * EEE---> week		[sun-sat]
		 * mm ---> minutes  [01-60]
		 * yyyy--> year     [2000-2021]
		 * yy  -->          [98-21]
		 * ss  --> seconds  [01-60]
		 */
		

	}

}
