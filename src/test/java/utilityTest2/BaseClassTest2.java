package utilityTest2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class BaseClassTest2 {
	
	public static Properties Test2_prop;
	public static WebDriver driver;
	
	public BaseClassTest2() {
		
	try {
		FileInputStream file = new FileInputStream (System.getProperty("user.dir")+"\\src\\test\\java\\com\\Test2\\config\\com.Test2.Properties");	
			
		Test2_prop = new Properties();
		Test2_prop.load(file);
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		
	}
	
	public void test2browserinit() {
		
	String browser = Test2_prop.getProperty("Browser1");
	
	if (browser.equalsIgnoreCase("Chrome")) {
		
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\webDriverTest2\\chromedriver.exe");	
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestDataTest2.implicitywait));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestDataTest2.pageLoadwait));
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
			
	}
	else if(browser.equalsIgnoreCase("FireFox")) {
		
		}
		
	}
	public static void test2launchURL(String URL) {
		
		driver.get(Test2_prop .getProperty("URL"));
	}
}







