package JavaStreamsSeleniumAutomation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

// Mutliple Windows With Streams
public class Demo2WindowHandles 
{
	public static WebDriver driver;
	String flipKartUrl = "https://www.flipkart.com/";
	String amazonUrl = "https://www.amazon.in/";
	
	@BeforeMethod
	public void init()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	// Window Handles Using Foreach
	@Test
	public void testSwitchWindowsUsingForeach()
	{
		
		getUrl(flipKartUrl);
		
		driver.switchTo().newWindow(WindowType.TAB);
		getUrl(amazonUrl);
		
		// Get Window Handles without using iterator(using foreach)
		Set<String> windows = driver.getWindowHandles();
		System.out.println("testSwitchWindowsUsingIterator Total Windows : "+windows.size());
		for(String window : windows)
		{
			String currentUrl = driver.switchTo().window(window).getCurrentUrl();
			System.out.println("testSwitchWindowsUsingForeach Current URL : "+currentUrl);
		}
		
		
	}
	
	// Window Handles Using Iterator
	@Test
	public void testSwitchWindowsUsingIterator()
	{

		getUrl(flipKartUrl);
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		getUrl(amazonUrl);
		
		String amazonWindow = driver.getWindowHandle(); // Flipkart
		
		// Get Window Handles using iterator
		Set<String> windows  = driver.getWindowHandles();
		System.out.println("testSwitchWindowsUsingIterator Total Windows : "+windows.size());
		Iterator<String> itr = windows.iterator();
		while(itr.hasNext())
		{
			String flipKartWindow = itr.next();
			if(!amazonWindow.equals(flipKartWindow)) // if the amazon window is not currently switched then switch the control to flipkart window
			{
				driver.switchTo().window(flipKartWindow);
				System.out.println("testSwitchWindowsUsingIterator : " +driver.switchTo().window(flipKartWindow).getCurrentUrl());
			}
		}
		
	}
	
	// Window Handles Using Lambda Foreach
		@Test
		public void testSwitchWindowsUsingLambda()
		{
			
			getUrl(flipKartUrl);
			
			driver.switchTo().newWindow(WindowType.TAB);
			getUrl(amazonUrl);
			
			// Get Window Handles without using iterator(using foreach)
			Set<String> windows = driver.getWindowHandles();
			System.out.println("testSwitchWindowsUsingLambda Total Windows : "+windows.size());
			windows.forEach(window->System.out.println(driver.switchTo().window(window).getTitle()));
			windows.forEach(window->System.out.println(driver.switchTo().window(window).getCurrentUrl()));
			
			
		}
	// Generic Method to get Url
	public static void getUrl(String url)
	{
		driver.get(url);
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
