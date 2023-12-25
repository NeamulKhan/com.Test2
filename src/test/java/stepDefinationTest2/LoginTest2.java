package stepDefinationTest2;

import homePageAction.Test2HomePageAction;
import homePageAction.Test2userPageAction;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilityTest2.BaseClassTest2;
import utilityTest2.UtilityTest2;

public class LoginTest2 extends BaseClassTest2 {
	
	Test2HomePageAction  test2HomePageAction  = new Test2HomePageAction ();
	Test2userPageAction test2userPageAction = new Test2userPageAction();
	

@Given("launch {string}")
public void launch(String URL) {
   
	test2launchURL(URL);
}

@When("user is in homepage and click login link")
public void user_is_in_homepage_and_click_login_link() {
    
	test2HomePageAction.clickLoginLink();
}

@When("enter username, password and click login button")
public void enter_username_password_and_click_login_button() throws Exception {
    
	test2HomePageAction.enter_username_password_and_click_login_button(Test2_prop.getProperty("Username"), Test2_prop.getProperty("Password"));
	
}

@Then("verify user can successfully logged in")
public void verify_user_can_successfully_logged_in() throws Exception {
	
	test2userPageAction.verify_user_can_successfully_logged_in();
    
	UtilityTest2.takeMyScreenshot(driver, "Logged_in");
	
	
}

@Then("user can successfully logged out")
public void user_can_successfully_logged_out() {
    
	test2userPageAction.logout();
}
	
}
