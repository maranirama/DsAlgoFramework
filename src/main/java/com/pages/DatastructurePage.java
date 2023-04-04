package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DatastructurePage extends Base_page {
	
	public DatastructurePage(WebDriver driver) 
	{
		super(driver);
		
	}
	  @FindBy(xpath="//a[@href='data-structures-introduction']") WebElement started;
	  @FindBy(xpath = "//a[@class= 'list-group-item']") WebElement tcmplxty;
	  @FindBy(linkText = "Data Structures-Introduction") WebElement DSIntro;
	  @FindBy(xpath = "//a[@href='/tryEditor']") WebElement DSTryHr;
	  @FindBy(linkText="Time Complexity") WebElement DSTMCmp;
	  @FindBy(xpath="//form/div/div/div/textarea") WebElement Txtbx;
	  @FindBy(xpath="//button[text()='Run']") WebElement Rn;
	  
	 
	

	 
	  	

	  	
	    
	    public void DSstart()
	    {
	  	  started.click();
	    }
	    public void TimeComplexity() 
	    {
	  	  tcmplxty.click();
	    }
	    public void DSIntroduction() 
	    {
	  	  DSIntro.click();
	    }
	    public void DSTryHere()
	    {
	  	  DSTryHr.click();
	    }
	    public void TextBox()
	    {
	    
	  	 
	  	 Txtbx.sendKeys("print('hi')");
	  	 
	    }
	    
	    public void Run()
	    {
	    	
	    	Rn.click();
	    }
	   


}
