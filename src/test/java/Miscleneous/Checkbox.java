package Miscleneous;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox 
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
		
		// To check if the check box is selected or not. If not selected then check it.
				WebElement chkbox = driver.findElement(By.cssSelector("input[id*='friendsandfamily']"));
				if(chkbox.isSelected())
				{
					System.out.println("CheckBox is selected");
					Assert.assertTrue(chkbox.isSelected());
				}
				else
				{
					System.out.println("Checkbox is not selected.");
					Assert.assertFalse(chkbox.isSelected());
					chkbox.click();
					System.out.println("Checkbox is selected now");
				}
		// To check number of checkboxes present on page
				
				List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
				List<WebElement> labels = driver.findElements(By.xpath("//label"));
				int chkcount = checkBoxes.size();
				int labelCount = labels.size();
				System.out.println("Total Number of checkboxes : "+chkcount);
				System.out.println("Total Number of lables : "+labelCount);
				WebElement studentChkbox = driver.findElement(By.xpath("//label[text()=' Student']/../input"));
				for(int i=0;i<labelCount;i++)
				{
					System.out.println(labels.get(i).getText());
					if(labels.get(i).getText().equals("Student"))
					{
						studentChkbox.click();
						break;
					
						
					}
					
					
				
				}
				System.out.println("studentChkbox is selected :"+studentChkbox.isSelected());
				Assert.assertTrue(studentChkbox.isSelected());
				driver.close();
		
	}

}
