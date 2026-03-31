package Miscleneous;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleSvgElements 
{
	
	@Test
	public void handleSvgElement() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new  ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/time/viewEmployeeTimesheet");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//When performing action on svg elements always need to suffix //*[name()='svg'] along with the xpath
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Leave']/..//*[name()='svg']")).click();
	}

}
