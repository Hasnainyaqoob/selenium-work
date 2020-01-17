package SeleniumWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hasnain\\Downloads\\chromedriver_win\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // launch chrome 
		driver.get("https://www.careerz360.com/pakistan/Register");
		
		//ID locator
		driver.findElement(By.id("il-emp-fn")).sendKeys("Hasnain");
		//name locator
		driver.findElement(By.name("il-emp-ln")).sendKeys("Yaqoob");
		driver.findElement(By.id("il-emp-ph")).sendKeys("031337899102");
		//CSS locator
		driver.findElement(By.cssSelector("#il-emp-email")).sendKeys("hasnainyaqoobhotmail.com");
		driver.findElement(By.id("il-emp-pwd")).sendKeys("123456");
		driver.findElement(By.id("il-emp-conf-pwd")).sendKeys("123456");
		
		driver.findElement(By.name("checkbox")).click();
		
		driver.findElement(By.id("submit-jobseeker")).click();
		
		//driver.findElement(By.linkText("Register")).click(); 
		
		
		
	}

}
