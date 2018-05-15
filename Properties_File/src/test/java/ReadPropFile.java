import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadPropFile {
	static WebDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException {
		
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("/Users/macbookpro/git/Properties/Properties_File/src/test/java/config.properties");
		
		prop.load(ip);
		
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("age"));
		
		String url = prop.getProperty("url");
		System.out.println(url);

		String browserName = prop.getProperty("browser");
		System.out.println(browserName);
		
		
		if(browserName.equals("chrome")) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/macbookpro/eclipse-workspace/SeleniumWebDriver/chromedriver");
		driver = new ChromeDriver();

		} else if(browserName.equals("FF")) {
			System.setProperty("webdriver.gecko.driver", "/Users/macbookpro/eclipse-workspace/SeleniumWebDriver/geckodriver");
			driver = new FirefoxDriver();
		}
		
		driver.get(url);
		driver.findElement(By.xpath(prop.getProperty("username_xpath"))).sendKeys(prop.getProperty("username"));
		driver.findElement(By.xpath(prop.getProperty("password_xpath"))).sendKeys("password");
		driver.findElement(By.xpath("login_btn_xpath")).click();
		
	}

}
