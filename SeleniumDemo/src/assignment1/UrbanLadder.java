package assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UrbanLadder {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.get("https://www.urbanladder.com/");
		driver.manage().window().maximize();
		WebElement we = driver.findElement(By.className("google-auth"));
		Thread.sleep(3000);
		we.click();
		
		
	}

}
