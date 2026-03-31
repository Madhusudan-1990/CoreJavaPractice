package JavaStreamsSeleniumAutomation;
import java.sql.Driver;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicWebTableWithPagination 
{
	//Scenario : 
		/*
		 * 1. In the webtable find the employee name with Rhona Davidson if not present, click pagination and search again till its found.
		 * 2. Once found find the salary of that person.
		 */
	public WebDriver driver;
		@Test
		public void handleComplexDynamicWebTableWithPagination()
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://datatables.net/extensions/select/examples/checkbox/checkbox.html");
			driver.manage().window().maximize();
			
			String employeeName = "Haley Kennedy";
			List<WebElement> empNameList = driver.findElements(By.xpath("//td[@class='sorting_1']"));
			
			List<String> empSal;
			//Scan the name column with getText --> if it matches Charde Marshall, get the salary of Charde Marshall.
			/*
			 * 1. In do block add a stream code to fetch the name of the employee from the list using filter() which will search for all the employees in page 1
			 * 2. Next Use map() to get the salary of that employee using getSalary() function and store it in a list if the employee name is filtered(present)
			 * 3. if(empSal.size()<1) - The size of the list  empSal is less than 1 (0), then click next and repeat step -> this is executed if the employee name is not found in current page
			 * 4. Next while(empSal.size()<1); will be executed as employee name was not found in the 1st page (if this will condition is true) it will again execute step 1 else it will come out of the loop.
			 */
			do 
			{
				List<WebElement> empNameListToAvoidStaleElementRefException = driver.findElements(By.xpath("//td[@class='sorting_1']")); // This line has 
				empSal = empNameListToAvoidStaleElementRefException.stream().filter(eName->eName.getText().contains(employeeName)).map(eSal->getSalary(employeeName,eSal)).collect(Collectors.toList());
				System.out.println(empSal);
				if(empSal.size()<1)
				{
					driver.findElement(By.xpath("//button[@data-dt-idx='next']")).click();
					
				}
				
			}
			while(empSal.size()<1);
			{
				
			}
			driver.quit();
		}
		public  String getSalary(String name,WebElement sal)
		{
			String salary = sal.findElement(By.xpath("//td[.='"+name+"']/following-sibling::td[4]")).getText();
			return salary;
		}
}
