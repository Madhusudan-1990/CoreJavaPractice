package Miscleneous;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SeleniumIntroduction 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","/Users/Dell/eclipse-workspace/Introduction/chromedriver.exe");
		System.setProperty("webdriver.firefox.driver","/Users/Dell/eclipse-workspace/Introduction/geckodriver.exe");
	}
	@SuppressWarnings("deprecation")
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/");
		// Title
		String pageTitle = driver.getTitle();
		System.out.println("Page Title : "+pageTitle);
		//Url
		String url = driver.getCurrentUrl();
		System.out.println("Current URL :"+url);
		driver.close();
		
		// FireFox
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/");
		driver.manage().window().minimize();
		Thread.sleep(5000);
		driver.quit();
		

		
	}

}
