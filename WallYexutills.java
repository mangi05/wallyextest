package wallyexUtills;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WallYexutills {public static void implicitwaitforseconds(WebDriver driver, int time)
		{
			driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
		}
		public static void implicitwaitforminute(WebDriver driver, int time)
		{
			driver.manage().timeouts().implicitlyWait(time, TimeUnit.MINUTES);
		}
		public static void explicitwaitforvisibility(WebDriver driver, Duration time, WebElement element)
		
		{
			WebDriverWait wait = new WebDriverWait(driver, time);
			wait.until(ExpectedConditions.visibilityOf(element));
		}
	public static void explicitwaitforclickable(WebDriver driver, Duration time, WebElement element)
		
		{
			WebDriverWait wait = new WebDriverWait(driver, time);
			wait.until(ExpectedConditions.elementToBeClickable(element));
		}

	
	
	
	
}
