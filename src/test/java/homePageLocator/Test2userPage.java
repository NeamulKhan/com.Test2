package homePageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilityTest2.BaseClassTest2;

public class Test2userPage extends BaseClassTest2 {
	
	public Test2userPage() {
		
		PageFactory.initElements(driver,this);
		
	}
		
		@FindBy (id="nameofuser")
		public WebElement userpage;
		
		@FindBy (id="logout2")
		public WebElement logout;
		
		
	}


