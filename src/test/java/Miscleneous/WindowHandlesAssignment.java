package Miscleneous;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlesAssignment 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","/Users/Dell/eclipse-workspace/Introduction/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//a[.='Multiple Windows']")).click();
		driver.findElement(By.xpath("//a[.='Click Here']")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> itrWindow = windows.iterator();
		String parentWindow = itrWindow.next();
		String childWindow = itrWindow.next();
		driver.switchTo().window(childWindow);
		System.out.println("Control Moved To Child Window");
		WebElement childWindowTextElement = driver.findElement(By.xpath("//h3[.='New Window']"));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(childWindowTextElement));
		String childWindowText = childWindowTextElement.getText();
		System.out.println("childWindowText : "+childWindowText);
		driver.switchTo().window(parentWindow);
		System.out.println("Control Moved To Parent Window");
		String parentWindowText = driver.findElement(By.xpath("//h3[.='Opening a new window']")).getText();
		System.out.println("parentWindowText : "+parentWindowText);

		
		
		
		

	}

}
