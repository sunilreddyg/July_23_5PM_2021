package capturescreen;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Caputre_Screen_Using_Robot_Class {

	public static void main(String[] args) throws Exception 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\New_browser_Drivers\\chromedriver.exe");    
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		
		//Create object for Robot [AWT]
		Robot robot=new Robot();
		BufferedImage image=robot.createScreenCapture(new Rectangle(1200, 800));
		//Dump buffered image into local system
		ImageIO.write(image, "PNG", new File("C:\\Users\\SUNIL\\Desktop\\screens\\img1.png"));
		
		
		/*
		 * ImageIO.write(BufferedImage,"ImageExtension",""NewFile Location");
		 */
		
		/*
		 * Disadvantage:-->
		 * 			=> It capture what it seen  [Even eclipse open at the time it capture eclispe image]
		 * 
		 * Advantages:-->
		 * 			=> Even alert presented time we can capture screen
		 */

	}

}
