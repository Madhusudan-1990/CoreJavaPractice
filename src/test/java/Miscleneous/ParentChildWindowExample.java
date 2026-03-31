package Miscleneous;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParentChildWindowExample {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//a[contains(text(),'Free')]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String>itr = windowHandles.iterator();
		String parentWindow = itr.next();
		String childWindow = itr.next();
		
		driver.switchTo().window(childWindow);
		String fullText = driver.findElement(By.xpath("//p[@class='im-para red']")).getText().split("at")[1].trim().split(" ")[0];
		driver.switchTo().window(parentWindow);
		driver.findElement(By.id("username")).sendKeys(fullText);
		
		

	}

}
