package wallyexPages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import wallyexBaseLib.BaseLib;

public class WallyexSignup extends BaseLib {

//page
	
@FindBy(xpath="//input[@name='firstName']")
WebElement Firstname;
	
@FindBy( xpath="//input[@name='lastName']" )
WebElement LastName;


@FindBy( xpath="//input[@name='email']" ) 
WebElement Email;

@FindBy (xpath = "//div[@class='flag-dropdown countryDropdown']")
WebElement Phonecode;

@FindBy (xpath="//input[@class='form-control phoneInput']")
 WebElement Phone;

@FindBy(xpath= "//select[@id='role']")
WebElement Role;

@FindBy(id = "organization")
 WebElement  CompanyName;

//Radio button for size of company

@FindBy(id= "freelancer")
 WebElement Freelancer;

@FindBy(id= "smallCompany")
WebElement smallCompany;

@FindBy(id= "largeCompany")
WebElement largeCompany;

//Website responsiable for 

@FindBy(id= "single")
 WebElement singley;

@FindBy(id= "single")
WebElement single;

@FindBy(id= "medium")
WebElement medium;

@FindBy(id= "large")
WebElement large;

@FindBy(xpath ="//input[@type='submit']")
WebElement Submit;
//intilize page object
public WallyexSignup () {
PageFactory.initElements(driver,this);
			
}
//Actions:-verify the page
public String validateSignupPageTitle() {
	return driver.getTitle();
		
}

//verify successfullsignup

public void newsignupTest(String ftname, String ltNmae, String Eml, String phnecode, String phne, 
String rle, String companyName ) {	
Firstname.sendKeys(ftname);
LastName.sendKeys(ltNmae);
Email.sendKeys(Eml);

//select phone code
Phonecode.click();
Phone.sendKeys(phne);
//select role

Select role = new Select(Role);







	
	
}


	
	
	
}	
	








	
		










