package Miscleneous;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CountOnlyFooterLinksAndClickEachOne {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement footer = driver.findElement(By.xpath("//table[@class='gf-t']/tbody/tr/td[1]/ul"));
		int count = footer.findElements(By.tagName("a")).size();
		System.out.println("FooterLink Count : "+count);
		JavascriptExecutor exec = (JavascriptExecutor)driver;
		exec.executeScript("window.scrollBy(0,2000)","");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfAllElements(footer));
		for(int i = 1;i<count;i++)
		{
			String openNewTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			footer.findElements(By.tagName("a")).get(i).sendKeys(openNewTab);
			
			
		}
		// using for loop
//		Set<String> childWindows = driver.getWindowHandles();
//		int windowsCount = childWindows.size();
//		System.out.println("Total Tabs Opened :"+windowsCount);
//		for(String childWindow:childWindows)
//		{
//			driver.switchTo().window(childWindow);
//			System.out.println(driver.getTitle());
//		}
		//using while loop with iterator
		Set<String> childWindows = driver.getWindowHandles();
		Iterator<String> itr = childWindows.iterator();
		while(itr.hasNext())
		{
			driver.switchTo().window(itr.next());
			System.out.println(driver.getTitle());
		}

	}

}
