package stepDefinition;

import com.pages.HomePageNegative;
import com.qa.factory.Launch_Browser;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HomeNegtive_step {
	
	HomePageNegative hpn=new HomePageNegative(Launch_Browser.driver);
	
	@Given("user clicks Data Structure get start button without signingIn")
	public void user_clicks_data_structure_get_start_button_without_signing_in() throws InterruptedException {
		
		hpn.ds_Start();
		 
		   Thread.sleep(1000);
	}

	@Then("displays data structure error message")
	public void displays_data_structure_error_message() {
		
		hpn.error();
	   
	}

	@Given("user clicks Array get start button without signingIn")
	public void user_clicks_array_get_start_button_without_signing_in() {
		hpn.arr_Start();
	    
	}

	@Then("displays array error message")
	public void displays_array_error_message() throws InterruptedException {
	   hpn.error();
	   
	   Thread.sleep(1000);
	}



}
