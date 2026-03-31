package Miscleneous;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ArrayListAddToCart {
	static {
		System.setProperty("webdriver.chrome.driver", "/Users/Dell/eclipse-workspace/Introduction/chromedriver.exe");
	}
	public void addToCart(WebDriver driver)
	{
	// Using Array List	
		ArrayList vegetableList = new ArrayList();
		vegetableList.add("Beetroot");
		vegetableList.add("Capsicum");
		vegetableList.add("Mango");
		
		for (Object list : vegetableList) {
			List<WebElement> vegetablesList = driver.findElements(By.xpath("//h4[@class='product-name']"));
			for (int i = 0; i < vegetablesList.size(); i++) {
				String vegetableText = vegetablesList.get(i).getText();
				if (vegetableText.contains(list.toString())) {
					driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				}
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		ArrayListAddToCart addToCart = new ArrayListAddToCart();
		addToCart.addToCart(driver);

	}

}
