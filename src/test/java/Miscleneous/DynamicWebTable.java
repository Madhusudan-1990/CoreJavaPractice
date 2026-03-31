package Miscleneous;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicWebTable 
{
	//Scenario :
	//For Chrome process get value of CPU load.
	//Compare it with value in the yellow label.
	
	//Approach 1 : Using Dynamic Xpath(Most Effecient and Simple)
	//@Test
	public void handleDynamicWebTable()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/dynamic-table");
		driver.manage().window().maximize();
		
		WebElement chromeCPUPercent = driver.findElement(By.xpath("//td[.='Chrome']/../td[contains(text(),'%')]"));
		
		String chromCPUPercentText = chromeCPUPercent.getText();
		System.out.println(chromCPUPercentText);
		
		WebElement chromeCPU = driver.findElement(By.id("chrome-cpu"));
		String chromeCPUText = chromeCPU.getText().split(" ")[2];
		Assert.assertEquals(chromCPUPercentText, chromeCPUText,"CPU Load For Chrome Doesn't Match !!!");
		driver.quit();
		
	}
	//Approach 2 : Using For Loop with List Of Webelement
	//@Test
	public void handleDynamicWebTableUsingForloop()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/dynamic-table");
		driver.manage().window().maximize();
		
		List<WebElement> list = driver.findElements(By.xpath("//td"));
		for(WebElement ele : list)
		{
			System.out.println(ele.getText());
			if(ele.getText().equals("Chrome"))
			{
				WebElement cpu = driver.findElement(By.xpath("//td[.='Chrome']/../td[contains(text(),'%')]"));
				System.out.println(cpu.getText());
				
				WebElement chromeCPU = driver.findElement(By.id("chrome-cpu"));
				String chromeCPUText = chromeCPU.getText().split(" ")[2];
				Assert.assertEquals(cpu.getText(), chromeCPUText,"CPU Load For Chrome Doesn't Match !!!");
				break;
			}
			
		}
		driver.quit();
	}
	
	

}
