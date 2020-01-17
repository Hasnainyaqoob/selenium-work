package SeleniumWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class customAndDymanicXpath {

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
		
		String url = "http://www.kbmtr.co.uk/";
		driver.get(url);
		
		// use "class", if HTML input tag has a class property
		driver.findElement(By.xpath("//input[@class='textbox']")).sendKeys("currency");	 
		// use "name", if HTML input tag has a name property
		driver.findElement(By.xpath("//input[@name='textbox']")).sendKeys("currency");	 
		
		//contains function with class property of HTML tag
		driver.findElement(By.xpath("//input[contains(@class,'textbox')]")).sendKeys("qwerty");
		
		
		//Dynamic ID: input tag
		//id = test_123
		// By.id("test_123");
		
		//Starts-with
		//id = test_123
		//id = test_456
		//id = test_789
		driver.findElement(By.xpath("//input[contains(@id , 'test_')]")).sendKeys("test");
		driver.findElement(By.xpath("//input[starts-with(@id , test_)]")).sendKeys("test");
		
		//Ends-with
		//id = 123_test_t
		//id = 456_test_t
		//id = 789_test_t
		driver.findElement(By.xpath("//input[ends-with(@id , _test_t)]")).sendKeys("test");
		
		//custom xpath for links
		driver.findElement(By.xpath("//a[contains(text() , 'sign in')]")).click();
	}

}
