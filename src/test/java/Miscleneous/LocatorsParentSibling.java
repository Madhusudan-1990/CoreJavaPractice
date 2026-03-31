package Miscleneous;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsParentSibling 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","/Users/Dell/eclipse-workspace/Introduction/chromedriver.exe");
		System.setProperty("webdriver.firefox.driver","/Users/Dell/eclipse-workspace/Introduction/geckodriver.exe");
	}

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//Parent to Child to Child
		WebElement elementParentToChild = driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]"));
		elementParentToChild.click();
		System.out.println(elementParentToChild.getText());
		
		// Child to Parent to GrandParent
		WebElement elementChildToParent = driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]"));
		System.out.println(elementChildToParent.getText());
		driver.close();
		
		
		

	}

}
