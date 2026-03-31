package Miscleneous;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UpdatedDropDown 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","/Users/Dell/eclipse-workspace/Introduction/chromedriver.exe");
	}
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']")).click();
	    WebElement addAdult = driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']"));
	    //Add 5 Adults
	    int totalAdult = 5;
	    int i = 1;
	    while(i<totalAdult)
	    {
	    	addAdult.click();
	    	i++;
	    	
	    }
	    //Add 2 Children
	    WebElement addChildren = driver.findElement(By.xpath("//div[@data-testid='Children-testID-plus-one-cta']"));
	    int totalChildren = 2;
	    for(int j = 0; j<totalChildren;j++)
	    {
	    	addChildren.click();
	    }
	    driver.findElement(By.xpath("//div[@data-testid='home-page-travellers-done-cta']")).click();
	    String totalNumberOfPassengers = driver.findElement(By.xpath("//div[text()='Passengers']/../div[2]/div[1]")).getText();
	    System.out.println("Total No Of Passengers :"+totalNumberOfPassengers);
	    Assert.assertEquals(totalNumberOfPassengers, totalAdult+" Adults, "+totalChildren+" Children");
	    driver.quit();
		

	}

}
