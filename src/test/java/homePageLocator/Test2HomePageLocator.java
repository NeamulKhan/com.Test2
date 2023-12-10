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

}
