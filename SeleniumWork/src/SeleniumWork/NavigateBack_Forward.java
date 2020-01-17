package SeleniumWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateBack_Forward {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hasnain\\Downloads\\chromedriver_win\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // launch chrome
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);	
		/* DYNAMIC LOAD TIME
	    time for web page to load completely.
		After 20 seconds, selenium will start execution. 
		if page is loaded in 5 seconds, remaining 15 seconds will be ignored*/ 
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		String url = "https://www.tutorialspoint.com/python3/python3_whatisnew.htm";
		// first will load tutorialspoint
		driver.get(url);
		
		//get() VS navigate().to()		: both are used to launch the url but navigate().to() is used to launch some external url 
		
		String link = "https://www.google.com";
		// will navigate from tutorials point to google
		driver.navigate().to(link);		// navigate method controls the behavior of Browser's Back and Forward Button
		// comes back to tutorials point
		driver.navigate().back();
		driver.navigate().refresh(); // refresh current page
		
	}

}
