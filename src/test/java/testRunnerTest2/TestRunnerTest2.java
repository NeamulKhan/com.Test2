package testRunnerTest2;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import utilityTest2.BaseClassTest2;

@CucumberOptions(features= {"src/test/resource/featureFolderTest2"},
plugin={"json:target/cucumber.json"},
glue="stepDefinationTest2", tags= "@SignupTest2"
		)

public class TestRunnerTest2 extends AbstractTestNGCucumberTests{
	
	@BeforeTest
	 
	 public void setup()throws IOException {
		 
		BaseClassTest2  test = new  BaseClassTest2();
		 
		test.test2browserinit();
	 }
		 
		 @AfterTest
		 
		 public void closerURL() throws IOException, Exception{
			 
			 BaseClassTest2  test = new  BaseClassTest2();
			 
			 Thread.sleep(5000);
			 
			 test.driver.quit();
			 
			 
	 }
	 
}


