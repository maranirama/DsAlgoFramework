
  package stepDefinition;
  
  
  
  import java.io.IOException;
  
  import org.junit.Assert; import org.openqa.selenium.WebDriver;
  
  import com.pages.RegisterPage;
  import com.qa.factory.DriverFactory; 
  import com.qa.factory.Launch_Browser; 
  import com.qa.util.ConfigReader;
  
  import io.cucumber.java.en.Given; 
  import io.cucumber.java.en.Then; 
  import io.cucumber.java.en.When;
  
  public class Register_Step 
  {
  
  WebDriver driver =Launch_Browser.launch_browser();
  RegisterPage r=new RegisterPage(driver);
  
  @Given("user clicks cn Register link for invalid login")
  public void user_clicks_cn_register_link_for_invalid_login() throws InterruptedException 
  
  {
	  
	  r.clickOnReg();
  }
     
  

  @When("user enters the invalid {string} {string} and {string}")
  public void user_enters_the_invalid_and(String invaliduser, String invalidpassword, String invalidconfirmpassword) {
	  
	  
	  
	  r.sendValues(invaliduser, invalidpassword, invalidconfirmpassword); 
  }
    
  

  @When("user clicks on Register button for invalid login")
  public void user_clicks_on_register_button_for_invalid_login() {

	  
	  r.regButton();
	  
	  
  }
   

  @Then("error msg displayed")
  public void error_msg_displayed() 
  {
	  
	  r.alertmsg();
      
  }
	
	  @Given("user clicks cn Register link")
	  
	  public void user_clicks_cn_register_link() throws IOException,
	  InterruptedException
	  { 
		  r.clickOnReg();
		  
	  }
	 
  
  @When("user enters the valid {string} {string} and {string}") public void
  user_enters_the_valid_and(String UserName, String Password, String
  ConfirmPassword ) throws IOException 
  {
  
  //RegisterPage r=new RegisterPage(DriverFactory.driverSetup());
  System.out.println(Password); System.out.println(ConfirmPassword);
  
  r.sendValues(UserName, Password, ConfirmPassword); 
  }
  
	
  
	
	  @When("user clicks on Register button") public void
	  user_clicks_on_register_button() throws InterruptedException 
	  {
	  
	  Thread.sleep(2000);
	  
	  r.regButton();
	  
	  }
	 
	
	  @Then("user navigated to NumpyNinja Home page") public void
	  user_navigated_to_numpy_ninja_home_page() 
	  {
	  
	  String expected=Launch_Browser.driver.getTitle();
	  
	  System.out.println(expected);
	  
	 r.alertmsg();
	  }
	 
  
  
  
  
  }
 