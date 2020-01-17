package SeleniumWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;


public class HTMLunitDriver {

public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hasnain\\Downloads\\chromedriver_win\\chromedriver.exe");

//WebDriver driver = new ChromeDriver();


// htmlUnitDriver runs only at console. does not open browser to perform a task.
// execution is fast with this
WebDriver driver = new HtmlUnitDriver();		 

driver.manage().window().maximize();
driver.manage().deleteAllCookies();


driver.get("https://gtmetrix.com/");

driver.findElement(By.xpath("//a[contains(text(),'Log In')]")).click();
Thread.sleep(1000);


System.out.println("page title before login." + driver.getTitle());

driver.findElement(By.xpath("//input[@id='li-email']")).sendKeys("hasnain@live.com");

System.out.println("email entered");

driver.findElement(By.xpath("//input[@id='li-password']")).sendKeys("hasnain");

System.out.println("password entered");

System.out.println("page title after login." + driver.getTitle());

}

}


