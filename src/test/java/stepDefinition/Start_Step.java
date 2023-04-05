package stepDefinition;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.pages.Start_Page;
import com.qa.factory.DriverFactory;
import com.qa.factory.Launch_Browser;
import com.qa.util.ConfigReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Start_Step 
{
		WebDriver driver  =Launch_Browser.launch_browser();
	 Start_Page sp=new Start_Page(Launch_Browser.driver);

	@Given("DsAlgo Portal link")
	public void ds_algo_portal_link() throws IOException 
	{
		Launch_Browser.driver.get(ConfigReader.launch_Web("portal_url"));
	}

	
	@When("user clicks the get start button")
	public void user_clicks_the_get_start_button() 
	{
		
		sp.clickBtn();
	}

	

	@Then("user navigated to signup page")
	public void user_navigated_to_signup_page() 
	{
		
		
		  String title=Launch_Browser.driver.getTitle();
		  Assert.assertEquals(title,"NumpyNinja"); 
		  System.out.println(title);
		  
		 
	}



}
