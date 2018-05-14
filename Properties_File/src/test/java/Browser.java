import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {

	public static void main(String[] args) {
				
		System.setProperty("webdriver.chrome.driver", "/Users/macbookpro/eclipse-workspace/SeleniumWebDriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver", "/Users/macbookpro/eclipse-workspace/SeleniumWebDriver/geckodriver");	
		//WebDriver driver = new FirefoxDriver(); 
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.freecrm.com/");
		
		

	}

}
