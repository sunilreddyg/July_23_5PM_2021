package interactions.KeyBoard;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoard_Shortcuts {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\New_browser_Drivers\\chromedriver.exe");    
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		
		
		
		//Cntrl+ALt+W
		new Actions(driver).keyDown(Keys.CONTROL).keyDown(Keys.ALT).sendKeys(Keys.chord("W")).perform();
		new Actions(driver).keyDown(Keys.CONTROL).keyDown(Keys.ALT).sendKeys("W").perform();

	}

}
