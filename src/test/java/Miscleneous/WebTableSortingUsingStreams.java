package Miscleneous;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableSortingUsingStreams {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Click on the Columns
		driver.findElement(By.xpath("//span[text()='Veg/fruit name']")).click();
		String originalListText = "";
		//Capture all the WebElements into list
		List<WebElement> elementsList = driver.findElements( By.xpath("//tr/td[1]"));
			
        //Capture text of all webelements using stream into new(original list)
		List<String>originalList = elementsList.stream().map(s->s.getText()).collect(Collectors.toList());
		
		System.out.println("Original List : "+originalList);
		//Sort the list on step 3 -> Sorted List
		
		List<String>sortedList = originalList.stream().sorted().collect(Collectors.toList());
		
		System.out.println("Sorted List : "+sortedList);
		
		//Compare Original List v/s Sorted List
		
		Assert.assertTrue(originalList.equals(sortedList));
		List<String> priceText;
		//Scan the name column with getText --> if it matches Pineapple, get the price of Pineapple.
		do {
			List<WebElement> rows = driver.findElements( By.xpath("//tr/td[1]"));
			System.out.println(rows);
			priceText = rows.stream().filter(s->s.getText().contains("Pineapple")).
				map(s->getVeggiePrice(s)).collect(Collectors.toList());
		  priceText.forEach(s->System.out.println(s));
		  if(priceText.size()<1)
		  {
			  driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
		  }
		}
		while(priceText.size()<1);
		

		}

	private static String getVeggiePrice(WebElement s) {
		String priceValue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return priceValue;
	}	
		
		
		
		

		
	}


