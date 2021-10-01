package pageobjects.pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Admin_Menu
{
	
	WebDriver driver;
	public Admin_Menu(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}


@FindBy(xpath = "//input[contains(@id,'userName')]")
public WebElement  Username;

@FindBy(xpath = "//select[contains(@id,'userType')]")
public WebElement  Role;

@FindBy(xpath = "//input[contains(@id,'empName')]")
public WebElement  EmployeeName;

@FindBy(xpath = "//select[contains(@id,'status')]")
public WebElement  Status;

@FindBy(xpath = "//input[@id='searchBtn']")
public WebElement  search;

@FindBy(xpath = "//input[@id='resetBtn']")
public WebElement  reset;

public void verifyPage_title()
{
	driver.getTitle();
}



}