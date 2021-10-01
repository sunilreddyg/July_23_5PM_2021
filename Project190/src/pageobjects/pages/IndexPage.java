package pageobjects.pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class IndexPage
{
	WebDriver driver;
	public IndexPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}


@FindBy(xpath = "//b[contains(.,'Admin')]")
public WebElement  admin;

@FindBy(xpath = "//b[contains(.,'PIM')]")
public WebElement  pIM;

@FindBy(xpath = "//b[contains(.,'Leave')]")
public WebElement  leave;

@FindBy(xpath = "//b[contains(.,'Time')]")
public WebElement  time;

@FindBy(xpath = "//b[contains(.,'Recruitment')]")
public WebElement  recruitment;

@FindBy(xpath = "//b[contains(.,'My Info')]")
public WebElement  myInfo;

@FindBy(xpath = "//b[contains(.,'Performance')]")
public WebElement  performance;

@FindBy(xpath = "//b[contains(.,'Dashboard')]")
public WebElement  dashboard;

@FindBy(xpath = "//b[contains(.,'Directory')]")
public WebElement  directory;

@FindBy(xpath = "//b[contains(.,'Maintenance')]")
public WebElement  maintenance;

@FindBy(xpath = "//b[contains(.,'Buzz')]")
public WebElement  buzz;

@FindBy(xpath = "//input[@id='MP_link']")
public WebElement  marketplace;

@FindBy(xpath = "//input[@id='Subscriber_link']")
public WebElement  subscribe;

@FindBy(xpath = "//path[@fill='currentColor']")
public WebElement  info_icon;



}