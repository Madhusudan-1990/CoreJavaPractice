package Miscleneous;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLink {

	public static void main(String[] args) throws MalformedURLException, IOException, URISyntaxException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		List<WebElement> allUrls = driver.findElements(By.tagName("a"));
		
		for(int i = 0; i< allUrls.size();i++)
		{
			String allUrlText = allUrls.get(i).getDomAttribute("href");
			System.out.println(allUrlText);
			URL home = new URI(allUrlText).toURL();
			HttpURLConnection conn = (HttpURLConnection) home.openConnection();
			 conn.setRequestMethod("HEAD");
			 conn.connect();
			 
			 int responseCode = conn.getResponseCode();
			 if(responseCode>=400)
			 {
				 System.out.println("Broken Url :"+allUrlText);
			 }
		}

	}

}
