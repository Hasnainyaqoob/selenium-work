package SeleniumWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverBasics {

	public static void main(String[] args) {
		
		// FF browser
		// GeckoDriver
		
	//WebDriver driver =	new FirefoxDriver();
		
		// chrome Browser
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hasnain\\Downloads\\chromedriver_win\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // launch chrome 
		driver.get("https://www.careerz360.com/pakistan");  // enter URL in search field
		
		
		String url = driver.getCurrentUrl();	//get current URL
		
		System.out.println(url);
		
		String title = driver.getTitle();	//get page title
		
		System.out.println(title);
		
		if(title.equals("Forms")) 
		{
			System.out.println("correct");
		}
		else
		{
			System.out.println("incorrect");
		}
		
		driver.quit();
		
	}

}
