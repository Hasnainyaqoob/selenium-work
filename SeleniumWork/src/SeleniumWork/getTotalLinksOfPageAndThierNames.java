package SeleniumWork;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTotalLinksOfPageAndThierNames {

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
		driver.get(url);
		
		// get the total count of links on a page
		// get the text of each link
		// write Tag name to know the total count of it on a page.	
		
		List <WebElement> linklist =  driver.findElements(By.tagName("a"));
		System.out.println(linklist.size());
		
		for(int i = 0; i<linklist.size(); i++)
		{
			System.out.println(linklist.get(i).getText());
		}
		
		
	}

}
