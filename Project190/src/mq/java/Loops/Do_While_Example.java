package mq.java.Loops;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Do_While_Example {

	public static void main(String[] args) throws Exception 
	{
		
		
		//While With false COndition
		int i=10;
		while(i < 0)
		{
			System.out.println("false Condition");
		}
		
		
		//Do-while with false conditino [Do-while will run once even condition return false]
		int j=10;
		do {
			System.out.println(j);
		} while (j < 0);
		
		
		//Do-while with true condition
		int k=0;
		do {
			k=k+1;
			System.out.println(k);
		} while (k < 10);
		
		
		
		//Loading A Webpage untile Expected title presented
		System.setProperty("webdriver.chrome.driver", "E:\\New_browser_Drivers\\chromedriver.exe");    
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		int count=0;
		boolean flag=false;
		do {
			driver.get("https://instagram.com");
			
			try {
				flag=new WebDriverWait(driver, 10).until(ExpectedConditions.titleIs("Instagram"));
			} catch (Exception e) {
				System.out.println("Title mismatched");
			}
			
			count=count+1;
			if(count==10)
			{
				throw new Exception("Page is not loaded attempted 10 times");
			}
			
		} while (flag==false);
		System.out.println("Expected Webpage loaded");
		
		
		
		
		
		

	}

}
