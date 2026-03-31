package Miscleneous;
import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FilterWebTableUsingStreams {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement element = driver.findElement(By.xpath("//input[@id='search-field']"));
		element.sendKeys("Tomato");
		
		List<WebElement> itemList = driver.findElements(By.xpath("//tr/td[1]"));
		//
		List<WebElement> filteredList = itemList.stream().filter(a->a.getText().contains("Tomato")).
				collect(Collectors.toList());
		
		Assert.assertEquals(itemList.size(),filteredList.size());


	}

}
