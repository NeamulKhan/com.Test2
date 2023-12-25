package homePageAction;

import org.openqa.selenium.Alert;
import org.testng.Assert;

import homePageLocator.Test2HomePageLocator;
import utilityTest2.BaseClassTest2;


public class Test2HomePageAction extends BaseClassTest2{
	
	Test2HomePageLocator test2HomePageLocator = new Test2HomePageLocator();
	
	public void verifyhomepagetitle() throws Exception {
		
		boolean title = test2HomePageLocator.title.isDisplayed();
		
		Assert.assertTrue(title);
		
		Thread.sleep(3000);
		
		test2HomePageLocator.signupLink.click();
		
	}
	
	public void enter_username_password_and_click_signupButton(String x, String y) throws Exception {
		
		Thread.sleep(3000);
		test2HomePageLocator.username.sendKeys(x);
		test2HomePageLocator.password.sendKeys(y);
		
		Thread.sleep(2000);
		
		test2HomePageLocator.signupButton.click();
		
	}
    public void verifySignedup() throws Exception {
    	
    /*	Thread.sleep(5000);
    	
    	Alert alert = driver.switchTo().alert();
    	
    	String expectedmsg = "This user already exist.";
    	
    	String actualmsg = test2HomePageLocator.driver.switchTo().alert().getText();
    	
    	Assert.assertEquals(actualmsg, expectedmsg);
    	*/
    }
    public void clickLoginLink() {
    	
    	test2HomePageLocator.loginLink.click();
    	
    }
    public void enter_username_password_and_click_login_button(String i, String j) throws Exception {
    	
    	Thread.sleep(2000);
    	
    	test2HomePageLocator.username_login.sendKeys(i);
    	test2HomePageLocator.password_login.sendKeys(j);
    	
    	Thread.sleep(2000);
    	
    	test2HomePageLocator.loginButton.click();
    	
    	
    	
    }
    
    
    
}
