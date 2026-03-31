package Miscleneous;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentForm {
	static {
		System.setProperty("webdriver.chrome.driver", "/Users/Dell/eclipse-workspace/Introduction/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//label[text()='Name']/../input")).sendKeys("asdaskkjk");
		driver.findElement(By.xpath("//label[text()='Email']/../input")).sendKeys("lkljd@test.com");
		driver.findElement(By.xpath("//label[text()='Password']/../input")).sendKeys("lkjlkllk");
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.xpath("//input[@type='date']")).sendKeys("23-12-1903");
		driver.findElement(By.cssSelector("input[class*=\"success\"]")).click();
		WebElement elementSuccessMsg = driver.findElement(By.cssSelector("div[class*='alert']"));
		Assert.assertTrue(elementSuccessMsg.isDisplayed());
		System.out.println(elementSuccessMsg.getText());

	}

}
