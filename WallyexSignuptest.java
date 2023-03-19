package wallyex.com.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import wallyexBaseLib.BaseLib;
import wallyexPages.WallyexSignup;

public class WallyexSignuptest extends BaseLib{

	public WallyexSignuptest() {
	super();	
		
	}	
	
	
@BeforeMethod
public void setup(){
	 intitialization();	 			
}

@Test
public void signupTitleTest() {
	WallyexSignup signup = new WallyexSignup();
	String title =signup.validateSignupPageTitle();
	Assert.assertEquals(title, "Wally Get Started");
	
}

@AfterMethod
public void tearDown() {
driver.quit();
	
}


}





