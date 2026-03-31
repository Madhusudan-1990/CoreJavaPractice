package Miscleneous;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShodowDomWithSelenium4 
{

	//@Test
	public void handleShadowDomWithSelenium4Example1() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://shop.polymer-project.org/");
		driver.manage().window().maximize();
		
		//This Element is inside single shadow DOM.
		SearchContext shadow = driver.findElement(By.cssSelector("shop-app[page='home']")).getShadowRoot();
		Thread.sleep(1000);
		shadow.findElement(By.cssSelector("a[href='/list/mens_outerwear']")).click();
	}
	
	@Test
	public void handleShadowDomWithSelenium4Example2() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://books-pwakit.appspot.com/");
		driver.manage().window().maximize();
		
	
		SearchContext shadow = driver.findElement(By.cssSelector("book-app[apptitle='BOOKS']")).getShadowRoot();
		Thread.sleep(1000);
		// The last element can have xpath. Rest of the previous element should have css selector 
		shadow.findElement(By.id("input")).sendKeys("abc");
	}
}
