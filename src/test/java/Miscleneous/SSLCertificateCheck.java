package Miscleneous;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SSLCertificateCheck {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions chOpt = new ChromeOptions();
		chOpt.setAcceptInsecureCerts(true);
		WebDriver driver = new ChromeDriver(chOpt);
		driver.manage().window().maximize();
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());
	}

}
