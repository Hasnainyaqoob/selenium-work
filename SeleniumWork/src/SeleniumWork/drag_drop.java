package SeleniumWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag_drop {

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
		
		String url = "https://jqueryui.com/droppable/";
		driver.get(url);
		
		driver.switchTo().frame(0);
		
		Actions action = new Actions(driver);
		action.clickAndHold(driver.findElement(By.id("draggable")))
		.moveToElement(driver.findElement(By.id("droppable")))
		.release()
		.build().perform();
		
		
	}

}
