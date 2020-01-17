package SeleniumWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleFrames {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hasnain\\Downloads\\chromedriver_win\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // launch chrome
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		String url = "https://www.spicejet.com/";
		driver.get(url);
		
		Thread.sleep(2000);
		//driver.switchTo().frame("mainFrame");
		
		//driver.findElement(By.xpath("//a[contains(text(), 'DEALS']")).click();
		//driver.findElement(By.linkText("SpiceClub")).click();
		driver.findElement(By.id("highlight-gift-card")).click();
		
	}

}
