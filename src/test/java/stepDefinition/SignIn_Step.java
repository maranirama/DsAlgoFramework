package stepDefinition;

import org.openqa.selenium.WebDriver;

import com.pages.SignInPage;
import com.qa.factory.Launch_Browser;
import com.qa.util.ConfigReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignIn_Step 

{
	WebDriver driver  =Launch_Browser.launch_browser();
	SignInPage si=new SignInPage(Launch_Browser.driver);

	
	@Given("user clicks on signIn page")
	public void user_clicks_on_sign_in_page() 
	{
		Launch_Browser.driver.get(ConfigReader.launch_Web("home_url"));
		
	 
	}

	@Given("user enters valid {string} and {string}")
	public void user_enters_valid_and(String uname, String pword) 
	{
		 si.signin();
	   si.username(uname);
	   si.password(pword);
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() 
	{
	   si.login();
	}

	@Then("user navigated to home page")
	public void user_navigated_to_home_page() 
	
	{
	   si.alertmessage();
	   si.signOut();
	}



}
