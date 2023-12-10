package homePageAction;

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

}
