package Miscleneous;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicDropDown 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","/Users/Dell/eclipse-workspace/Introduction/chromedriver.exe");
	}
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[text()=' Bengaluru (BLR)']")).click();
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		driver.quit();
	 
		

	}

}
