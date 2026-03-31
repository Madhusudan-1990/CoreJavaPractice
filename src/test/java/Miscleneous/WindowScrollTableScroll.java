package Miscleneous;
import java.text.ParseException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowScrollTableScroll {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(5000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		
		List<WebElement> amount = driver.findElements(By.xpath("//table[@id='product']//td[4]"));
		int count = amount.size();
		int sum =0;
		for(int i =0;i<count;i++)
		{
			String amountStr = amount.get(i).getText();
			sum = sum+Integer.parseInt(amountStr);
			System.out.println(sum);
		}
		System.out.println("Total Sum :"+sum);
	    String totalText = driver.findElement(By.xpath("//div[@class='totalAmount']")).getText();
	    String expectedTotalAmount = driver.findElement(By.xpath("//div[@class='totalAmount']")).getText().split(":")[1].trim();
	    int expectedTotalAmountNumber = Integer.parseInt(expectedTotalAmount);
	    System.out.println("Expected Amount:"+expectedTotalAmountNumber);
	    Assert.assertEquals(sum, expectedTotalAmountNumber);

	}

}
