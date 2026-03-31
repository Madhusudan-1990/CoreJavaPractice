package Miscleneous;
import java.util.List;
import java.util.Timer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetDynamicWorldPopulationData 
{
	@Test
	public void getDynamicWorldData()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.worldometers.info/world-population/");
		driver.manage().window().maximize();
		
		
		List<WebElement> currentWorldPopulation = driver.findElements(By.xpath("//span[@class='rts-counter']"));
		int count = 0;
		while(count<=20)
		{
			for(WebElement ele : currentWorldPopulation)
			{
				System.out.println(ele.getText());
			}
			break;
		}
	}

}
