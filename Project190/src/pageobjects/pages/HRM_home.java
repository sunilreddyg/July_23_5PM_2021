package pageobjects.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HRM_home 
{

	//It is the initalizer to identify obejcts
	public HRM_home(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//Look for object at webpage
	@FindBy(id="txtUsername") public WebElement Login_Username;
	@FindBy(xpath="//input[@id='txtPassword']") public WebElement Login_password;
	@FindBy(xpath = "//input[@id='btnLogin']") public WebElement Login_button;
	
	
	public void type_username(String uid)
	{
		Login_Username.clear();
		Login_Username.sendKeys(uid);
	}
	
	
	public void type_password(String pwd)
	{
		Login_password.clear();
		Login_password.sendKeys(pwd);
	}
	
	public void click_login_button()
	{
		Login_button.click();
	}
	
	
	
	
}
