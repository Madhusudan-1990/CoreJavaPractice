package JavaStreamsSeleniumAutomation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FetchProductAndNamesPriceGreaterThan1000 
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
	
	// Get the products along with price greater than 1000 using Hash Map
	@Test
	public void getProductPriceUsingStreams()
	{
		
		List<WebElement> productTitleList = driver.findElements(By.className("product-title"));
		List<WebElement> productPriceList = driver.findElements(By.className("prices"));
		
		HashMap<String, Double> productMap = new HashMap<String, Double>();
		
		for(int i=0;i<productTitleList.size();i++) // Getting size of product title which is also equal to size of product price
		{
			// Get the product name and iterate
			String productName = productTitleList.get(i).getText();
			
			// Get the product price and iterate
			Double productPrice = Double.parseDouble(productPriceList.get(i).getText());
			
			//Now add it to Hash Map
			productMap.put(productName, productPrice);
		}
		
		for(Map.Entry<String, Double> entry : productMap.entrySet())
		{
			String getProductName = entry.getKey();
			Double getProductPrice = entry.getValue();
			if(getProductPrice>1000)
			{
				System.out.println("Products : "+getProductName + " Price :"+getProductPrice);
			}
		}
		
		// Print HashMap data using Lambda Expression
		productMap.forEach((prodTitle,prodPrice)->System.out.println(prodTitle+"  "+prodPrice));
		
		// Filter and Print the products having price greater than 800
		
		productMap.entrySet().stream().filter(price->price.getValue()>500).forEach(sys->System.out.println("Filter and Print the products having price greater than 800 using streams : "+sys));
		
	}
	

	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
}
