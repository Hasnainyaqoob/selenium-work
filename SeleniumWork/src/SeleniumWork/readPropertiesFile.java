package SeleniumWork;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class readPropertiesFile {

	static WebDriver driver;
	
	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		
		
		
		
		Properties properties = new Properties();
		
		FileInputStream ip = new FileInputStream("C:\\Users\\hasnain\\eclipse-workspace\\SeleniumWork\\src\\SeleniumWork\\config.properties");
		
		properties.load(ip);
		
		//properties are case sensitive. means "name" is not equal to "Name" 
		// if the property is available or commented in properties file, the output will be NULL for that property.
		
		System.out.println(properties.getProperty("name"));
		System.out.println(properties.getProperty("age"));
		
		String browsername = properties.getProperty("browser");
		
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\hasnain\\Downloads\\chromedriver_win\\chromedriver.exe");
			driver = new ChromeDriver(); // launch chrome
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
		}
		else if (browsername.equals("firefox")) 
		{
			System.setProperty("webdriver.firefox.driver", "C:\\Users\\hasnain\\Downloads\\chromedriver_win\\geckodriver.exe");
			 driver = new FirefoxDriver(); // launch firefox
		}
		else if (browsername.equals("InternetExplorer"))
		{
			System.setProperty("webdriver.internetexplorer.driver", "C:\\Users\\hasnain\\Downloads\\chromedriver_win\\internetexplorerdriver.exe");
			 driver = new InternetExplorerDriver(); // launch internet explorer
		}
		driver.get(properties.getProperty("URL"));
		
		driver.findElement(By.name(properties.getProperty("Name_name"))).sendKeys(properties.getProperty("Name"));
		driver.findElement(By.name(properties.getProperty("email_name"))).sendKeys(properties.getProperty("email"));
		driver.findElement(By.name(properties.getProperty("number_name"))).sendKeys(properties.getProperty("number"));
		
	}

}
