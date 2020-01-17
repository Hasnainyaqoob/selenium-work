package SeleniumWork;

import java.io.File;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class takeScreenShot {

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
		
		//File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyfile(src, new File("C:\\Users\\hasnain\\Desktop\\123.png"));
		
	}

}
