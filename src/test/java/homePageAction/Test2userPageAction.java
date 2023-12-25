package homePageAction;

import org.testng.Assert;

import homePageLocator.Test2userPage;
import utilityTest2.BaseClassTest2;

public class Test2userPageAction extends BaseClassTest2{
	
	Test2userPage test2userPage = new Test2userPage();
	
	public void verify_user_can_successfully_logged_in() throws Exception {
		
		Thread.sleep(3000);
		
		boolean verifyuserpage = test2userPage.userpage.isDisplayed();
		
		Assert.assertTrue(verifyuserpage);
		
	}
	
	public void logout() {
		
		test2userPage.logout.click();
		
	}

}
