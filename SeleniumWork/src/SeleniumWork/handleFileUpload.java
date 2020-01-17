package SeleniumWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleFileUpload {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hasnain\\Downloads\\chromedriver_win\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // launch chrome 
		driver.get("https://html.com/input-type-file/");
		
		driver.findElement(By.name("fileupload")).sendKeys("C:\\Users\\hasnain\\Desktop\\reading.png");
		
		
		
		
	}

}
