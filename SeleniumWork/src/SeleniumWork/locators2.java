package SeleniumWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class locators2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hasnain\\Downloads\\chromedriver_win\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // launch chrome 
		driver.get("https://eportal.hec.gov.pk/hec-portal-web/auth/register.jsf");
		
		//select from Drop down list
		Select select = new Select(driver.findElement(By.id("countryList"))); 
		select.selectByVisibleText("Pakistan");
		
		//Radio button check
		driver.findElement(By.name("cnicType")).click();
		
		driver.findElement(By.id("username1")).sendKeys("3445276755534");
		
		// select from drop down list
		Select select1 = new Select(driver.findElement(By.name("provinceList"))); 
		select1.selectByVisibleText("Punjab");
		
		driver.findElement(By.name("password1")).sendKeys("Qwerty123");
		driver.findElement(By.name("confirmPassword")).sendKeys("Qwerty12");
		
		Select select2 = new Select(driver.findElement(By.id("countryListDialingCode")));
		select2.selectByVisibleText("Pakistan");
		
		driver.findElement(By.id("contactNumber")).sendKeys("3137899102");
		
	}

}
