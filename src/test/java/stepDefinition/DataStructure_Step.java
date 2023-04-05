package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.pages.DatastructurePage;
import com.pages.Datastructure_Page;
import com.pages.SignInPage;
import com.pages.SignIn_Page;
import com.qa.factory.Launch_Browser;
import com.qa.util.ConfigReader;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class DataStructure_Step 
{
	
	WebDriver driver =Launch_Browser.launch_browser();
	Datastructure_Page dsp = new Datastructure_Page(driver);
	SignIn_Page si=new SignIn_Page(Launch_Browser.driver);
	/*
	 * @Given("user click on signin button") public void
	 * user_click_on_signin_button() {
	 * Launch_Browser.driver.get(ConfigReader.launch_Web("home_url")); }
	 * 
	 * @When("user enter {string} and {string}") public void user_enter_and(String
	 * uname, String pword) { si.signin(); si.username(uname); si.password(pword);
	 * 
	 * }
	 * 
	 * @When("user clicks on loginbutton") public void user_clicks_on_loginbutton()
	 * { si.login(); }
	 */
	
	
	@Given("user is on DataStructure Module")
	public void user_is_on_data_structure_module() 
	{
		System.out.println("data structure");
	}
	@When("user clicks DataStructure getstarted button")
	public void user_clicks_data_structure_getstarted_button() 
	{
		 dsp.DSstart();
	}
	@Then("user launches DataStructure page")
	public void user_launches_data_structure_page() {
		String expected=Launch_Browser.driver.getTitle();
		Assert.assertEquals(expected, "Data Structures-Introduction");
	}
	
	@When("user clicks on time complexity link")
	public void user_clicks_on_time_complexity_link() {
	    dsp.TimeComplexity();
	}

	@When("user clicks on Try here button")
	public void user_clicks_on_try_here_button() {
		
		dsp.DSTryHere();
	    
	}

	@Then("user types python code in text box")
	public void user_types_python_code_in_text_box() {
		
		dsp.TextBox();
	  
	}

	@Then("user clicks on Run button")
	public void user_clicks_on_run_button() {
	   dsp.Run();
	}



}

