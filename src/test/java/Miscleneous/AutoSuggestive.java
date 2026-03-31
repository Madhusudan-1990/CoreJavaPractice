package Miscleneous;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestive 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","/Users/Dell/eclipse-workspace/Introduction/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement autoSuggestText = driver.findElement(By.id("autosuggest"));
		autoSuggestText.sendKeys("ind");
		Thread.sleep(10000);
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		int count = options.size();
		System.out.println("Count : "+count);
		for(int i=0;i<count;i++)
		{
			WebElement select = options.get(i);
			String selectedText = select.getText();
			System.out.println("List Of Options : "+selectedText);
			if(selectedText.equalsIgnoreCase("Indonesia"))
			{
				select.click();
			}
		}
		autoSuggestText.clear();
		autoSuggestText.sendKeys("ing");
		Thread.sleep(5000);
		List<WebElement> optionsList2 = driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
		for(WebElement option2 : optionsList2)
		{
			System.out.println("List Of Options2 : "+option2.getText());
			if(option2.getText().equalsIgnoreCase("United Kingdom (UK)"))
			{
				option2.click();
				break;
			}
		}


	}

}
