package Miscleneous;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticDropDown 
{
//	static
//	{
//		System.setProperty("webdriver.chrome.driver","/Users/Dell/eclipse-workspace/Introduction/chromedriver.exe");
//	}
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement staticDropDown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		staticDropDown.click();
		Select select = new Select(staticDropDown);
		select.selectByIndex(3);
		String selectedDropDown = select.getFirstSelectedOption().getText();
		System.out.println("selectedDropDown1 : "+selectedDropDown);
		
		select.selectByVisibleText("INR");
		String selectedDropDown2 = select.getFirstSelectedOption().getText();
		System.out.println("selectedDropDown2 : "+selectedDropDown2);
		
		select.selectByValue("AED");
		String selectedDropDown3 = select.getFirstSelectedOption().getText();
		System.out.println("selectedDropDown3 : "+selectedDropDown3);
		
		
		driver.quit();
	}

}
