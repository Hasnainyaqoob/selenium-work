package SeleniumWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class elementVisiblityTest {

public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hasnain\\Downloads\\chromedriver_win\\chromedriver.exe");

WebDriver driver = new ChromeDriver();

driver.manage().window().maximize();
driver.manage().deleteAllCookies();


driver.get("https://www.atlassian.com/software/jira/comparison/jira-vs-bugzilla");

// 1. isDisabled() method:  is applicable to all elements.

boolean b1 = driver.findElement(By.xpath("//button[@id='signup_submit']")).isDisplayed();
System.out.println(b1);	// true

// 2. isEnabled() method :

boolean b2 = driver.findElement(By.xpath("//button[@id='signup_submit']")).isEnabled();
System.out.println(b2);	// false

// enter data in required fields

driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("hasnain");
driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("hasnain");
driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("yaqoob");
driver.findElement(By.xpath("//input[@id='email']")).sendKeys("hasnainyaqoob1993@gmail.com");
driver.findElement(By.xpath("//input[@id='aod-password']")).sendKeys("Qwerty123");

// 3. isSelected() method : is applicable for only checkbox, dropdown and radio button

boolean b3 = driver.findElement(By.xpath("//input[@id='show-password-checkbox']")).isSelected();
System.out.println(b3); // false

driver.findElement(By.xpath("//input[@id='show-password-checkbox']")).click();
Thread.sleep(2000);
boolean b4 = driver.findElement(By.xpath("//input[@id='show-password-checkbox']")).isSelected();
System.out.println(b4); //true


// Again will check the button state. disabled or enabled
//1. isDisabled() method:  is applicable to all elements.

boolean b5 = driver.findElement(By.xpath("//button[@id='signup_submit']")).isDisplayed();
System.out.println(b5);	// false

//2. isEnabled() method :

boolean b6 = driver.findElement(By.xpath("//button[@id='signup_submit']")).isEnabled();
System.out.println(b6);	// true


}

}
