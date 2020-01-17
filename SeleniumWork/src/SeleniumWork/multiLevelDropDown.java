package SeleniumWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class multiLevelDropDown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hasnain\\Downloads\\chromedriver_win\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // launch chrome
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);	
		/* DYNAMIC LOAD TIME
	    time for web page to load completely.
		After 20 seconds, selenium will start execution. 
		if page is loaded in 5 seconds, remaining 15 seconds will be ignored*/ 
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		String url = "http://www.kbmtr.co.uk/";
		driver.get(url);
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Funded Courses')]"))).build().perform();
		
		Thread.sleep(2000);
		
		action.moveToElement(driver.findElement(By.linkText("Apprenticeship"))).build().perform();
		
		Thread.sleep(1000);
		driver.findElement(By.linkText("Assistant Accountant")).click();
		
		
	}

}
