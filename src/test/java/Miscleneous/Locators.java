package Miscleneous;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Locators {
	static
	{
		System.setProperty("webdriver.chrome.driver","/Users/Dell/eclipse-workspace/Introduction/chromedriver.exe");
		System.setProperty("webdriver.firefox.driver","/Users/Dell/eclipse-workspace/Introduction/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{
		String expectedText = "Hello Sam,";
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Test");
		driver.findElement(By.name("inputPassword")).sendKeys("Practice");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("John@gmail.com");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("JohnyJacob@gmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("94098234098");
		driver.findElement(By.xpath("//button[contains(text(),'Reset Login')]")).click();
		String assertText = driver.findElement(By.cssSelector("form p")).getText();
		System.out.println(assertText);
		Assert.assertEquals(assertText,"Please use temporary password 'rahulshettyacademy' to Login.");
		driver.findElement(By.xpath("//button[.='Go to Login']")).click();
		driver.findElement(By.id("inputUsername")).sendKeys("Sam");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		Thread.sleep(5000);
		driver.findElement(By.className("submit")).click();
		Thread.sleep(5000);
		String actualText = driver.findElement(By.cssSelector("h2")).getText();
		System.out.println("Actual Text : "+actualText);
		Assert.assertEquals(actualText,expectedText);
		driver.findElement(By.xpath("//button[.='Log Out']")).click();
		driver.quit();
		

	}

}
