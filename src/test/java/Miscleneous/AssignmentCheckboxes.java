package Miscleneous;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AssignmentCheckboxes 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "/Users/Dell/eclipse-workspace/Introduction/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Task 1 : Check the the first Checkbox and verify if it is successfully checked and unchecked it again to verify if it is successfully Unchecked
		
		WebElement firstCheckBox = driver.findElement(By.id("checkBoxOption1"));
		firstCheckBox.click();
		Assert.assertTrue(firstCheckBox.isSelected());
		
		firstCheckBox.click();
		Assert.assertFalse(firstCheckBox.isSelected());
		
		//Task 2 : How to get the count of number of checkboxes present in the page
		
		List<WebElement> totalCheckBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println("Total Number of Checkboxes : "+totalCheckBoxes.size());
		
		driver.quit();

	}

}
