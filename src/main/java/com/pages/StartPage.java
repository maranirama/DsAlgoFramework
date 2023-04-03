package com.pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qa.factory.DriverFactory;

import dev.failsafe.internal.util.Assert;

public class StartPage extends Base_page{
	
	//public WebDriver driver;
	public StartPage(WebDriver driver)
	{
		super(driver);
	}
	
	
	@FindBy(className="btn")
	WebElement btn;
	
	@FindBy(partialLinkText="NumpyNinja")
	WebElement home;
	
	public void clickBtn()
	{
		btn.click();
	}
	public void GetHome()
	{
		
		String actual=home.getText();
		System.out.println(actual);
	}
	

}
