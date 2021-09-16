package waitcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_Visibility {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		
		//Hide object using javascript
		//((JavascriptExecutor)driver).executeScript("document.getElementById('email').setAttribute('style','display:none')");
		
		
		WebDriverWait wait=new WebDriverWait(driver, 50);
		
		try {
			WebElement Username=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
			Username.clear();
			Username.sendKeys("Darshan");
			System.out.println("Object is visible and email is typed");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		

	}

}
