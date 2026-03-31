package Miscleneous;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calendar 
{

	public static void main(String[] args) throws InterruptedException 
	{
		String day = "24";
		String month = "9";
		String year = "2025";
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement monEle = driver.findElement(By.xpath("//input[@name='month']"));
		WebElement dayEle =driver.findElement(By.xpath("//input[@name='day']"));
		WebElement yearEle = driver.findElement(By.xpath("//input[@name='year']"));
		monEle.sendKeys(month+"/");
		dayEle.sendKeys(day+"/");
		yearEle.sendKeys(year);
		driver.findElement(By.xpath("//button[@class='react-date-picker__calendar-button react-date-picker__button']")).click();
		
		Assert.assertEquals(day, dayEle.getAttribute("value"));
		Assert.assertEquals(month, monEle.getAttribute("value"));
		Assert.assertEquals(year, yearEle.getAttribute("value"));
		
		
		
		
		
		
	}

}
