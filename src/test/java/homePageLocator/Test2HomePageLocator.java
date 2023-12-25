package homePageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilityTest2.BaseClassTest2;

public class Test2HomePageLocator extends BaseClassTest2{
	
	public Test2HomePageLocator() {
		
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(id="nava")
	public WebElement title;
	
	@FindBy (id="signin2")
	public WebElement signupLink;
	
	@FindBy (id="sign-username")
	public WebElement username;
	
	@FindBy (id="sign-password")
	public WebElement password;
	
	@FindBy (xpath="//*[@id=\"signInModal\"]/div/div/div[3]/button[2]")
	public WebElement signupButton; 
	
	@FindBy (id="login2")
	public WebElement loginLink;
	
	@FindBy (id="loginusername")
	public WebElement username_login;
	
	@FindBy (id="loginpassword")
	public WebElement password_login;
	
	@FindBy(xpath="//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")
	public WebElement loginButton;
		
	

}
