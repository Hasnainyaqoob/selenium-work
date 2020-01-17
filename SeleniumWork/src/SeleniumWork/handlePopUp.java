package SeleniumWork;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlePopUp {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hasnain\\Downloads\\chromedriver_win\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // launch chrome 
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click();
		
		Alert alert = driver.switchTo().alert();
		 System.out.println(alert.getText());
		 	
		String text = alert.getText(); 
		 
		if(text.equals("Please enter a valid user name"))
		{
			System.out.println("same text-----Pass");
		}
		else
		{
			System.out.println("Not same text----Fail");
		}
		 
		 alert.accept(); // click OK button
		 
		 // alert.dismiss();  // click Cancel button
		
		
		
	}

}
