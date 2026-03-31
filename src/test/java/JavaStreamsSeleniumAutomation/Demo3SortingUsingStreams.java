package JavaStreamsSeleniumAutomation;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo3SortingUsingStreams 
{
	public static WebDriver driver;
	String url = "https://demowebshop.tricentis.com/jewelry";
	@BeforeMethod
	public void init()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		getUrl(url);
	}
	// Approach to validate if the items or sorted or not after selecting sort option Name: A to Z 
	/*
	 * 1. Use select class to choose option sort A to Z 
	 * 2. Now using List of Webelement(itemList) collect all the items available on the page (products / items)
	 * 3. Process the list using stream and collect it to list.( This will have the order after choosing A to Z using select class
	 * 4. Now from the List of Webelement(itemList) again process it through stream and map(to getText() of all elements) and then use sorted() function.
	 * 5. Now assert the collected lists from step 3 and 5
	 */
	@Test
	public void sortBooksWithStreams()
	{
		WebElement sortProduct = driver.findElement(By.id("products-orderby"));
		Select select = new Select(sortProduct);
		select.selectByVisibleText("Name: A to Z"); // Here we are sorting 
		
		//Before Validating the Sort Using Streams
		List<WebElement> itemList = driver.findElements(By.className("product-title"));
		
		// Extracting text of each webelement from the list List<WebElement> beforeSortValidationList using map()
		
			List<String> itemNamesBeforeSort=itemList.stream().map(item->item.getText()).collect(Collectors.toList());
		
		// Print Elements Before Sort Validation
		 itemNamesBeforeSort.forEach(item->System.out.println("Elements Before Sort Validation "+item));	
		
		// Now were are sorting using sorted()
			List<String> itemNamesAfterSort = itemList.stream().map(item->item.getText()).sorted().collect(Collectors.toList());
			
		// Print Elements After Sort Validation	
			itemNamesAfterSort.forEach(item->System.out.println("Elements After Sort Validation "+item));		
		
		Assert.assertEquals(itemNamesBeforeSort, itemNamesAfterSort,"Products are not Sorted !!!");	
		
		
			
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
