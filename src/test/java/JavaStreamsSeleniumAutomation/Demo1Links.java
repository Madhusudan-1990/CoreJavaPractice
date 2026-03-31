package JavaStreamsSeleniumAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

//1.Find the Number of Links in Page
//2.Print Link Texts from all the links
//3.Check how many links do not have href attributes(Find the broken links)
public class Demo1Links 
{
	public static WebDriver driver;
	
	static By link = By.tagName("a");
	
	@BeforeMethod
	public void init()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
	}

	
	//Get all link text using for each loop
	@Test(priority = 1)
	public void getLinksUsingForEachLoop()
	{
		List<WebElement> links = findAllElements(link);
		System.out.println("No of links : "+links.size());
		
		for(WebElement link : links)
		{
			System.out.println("All the link text using foreach loop : "+link.getText());
		}
	}
	
	// Get all link text using Lambda(most optimized and efficient)
	@Test(priority = 2)
	public void getLinksUsingLambda()
	{
		List<WebElement> links = findAllElements(link);
		//Using Lambda Expression
		links.forEach(allLinks->System.out.println("All the link text using Lambda Expression : "+allLinks.getText()));
	}
	
	// Get all links which doesn't have href attribute. (Find the broken links)
	@Test(priority = 3)
	public void getBrokenLinksUsingStream()
	{
		List<WebElement> links = findAllElements(link);
		//Processing the elements using stream -> filter. 
		
		// href = null will give broken links
		long brokenLink = links.stream().filter(link->link.getDomAttribute("href")==null).count();
		System.out.println("Broken Links : "+brokenLink);
		
		// href ! = null will give working links
		long workingLink = links.stream().filter(link->link.getDomAttribute("href")!=null).count();
		System.out.println("Working Links : "+workingLink);
		
		
		
		//Old Approach:
//			String value = element.getAttribute("value");
//
//		// New Approach:
//
//			// For the initial attribute value
//
//			String attributeValue = element.getDomAttribute("value");
//
//			 
//
//			// For the current DOM property value
//          String propertyValue = element.getDomProperty("value");
		
		
//      Use getDomAttribute for static attributes like id, name, or href. 
//		Use getDomProperty for dynamic properties like value or checked.		
		
	}
	
	// Generic Method to find List<WebElement>
	public static List<WebElement> findAllElements(By locator)
	{
		return driver.findElements(locator);
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
}
