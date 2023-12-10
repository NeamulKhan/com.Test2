package stepDefinationTest2;

import homePageAction.Test2HomePageAction;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilityTest2.BaseClassTest2;
import utilityTest2.UtilityTest2;

public class SignupTest2 extends BaseClassTest2 {
	
	Test2HomePageAction test2HomePageAction = new Test2HomePageAction();
	
@Given("Launch {string}")
public void launch(String URL) {
  
	test2launchURL(URL);
	
}

@When("user validate home page title and click sign up link")
public void user_validate_home_page_title_and_click_sign_up_link() throws Exception {
   
	UtilityTest2.takeMyScreenshot(driver,"Home Pasge title");
	
	test2HomePageAction.verifyhomepagetitle();
	
}

@When("enter user name, password and click signupButton")
public void enter_user_name_password_and_click_signup_button() {
   
	
}

@Then("verify user successfully signed up")
public void verify_user_successfully_signed_up() {
    
	
}



	
	

}
