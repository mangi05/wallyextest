package wallyexBaseLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseLib {

public static WebDriver driver;
public static Properties prop;
	
			
public BaseLib() {
	try {
		prop = new Properties();
		FileInputStream ip = new FileInputStream("D:\\wallyex\\Configfile\\Propertiesfile");
		prop.load(ip);
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}	
}	
public static void intitialization() {
String browser= prop.getProperty("browser");
if(browser.equals("edge")){
driver =new EdgeDriver();
}else if (browser.equals("FF")) {
	
	driver = new FirefoxDriver();		
}
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.get(prop.getProperty("url"));

	
}	
	
	
	
	
	
	
	
	
	
	
	
	
}
	




