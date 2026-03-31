package SeleniumSingletonPattern;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PageTest 
{
	WebDriver driver;
    @BeforeMethod
    public void setup()
    {
    	DriverInit instance = DriverInit.getInstance();
    	driver = instance.openBrowser();
    }
    
    @Test
    public void testMethod()
    {
    	driver.get("https://www.google.com/");
    	System.out.println(driver.getTitle());
    }
    
    @AfterMethod
    public void tearDown()
    {
    	driver.quit();
    }

}
