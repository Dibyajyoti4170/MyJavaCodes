package assignment1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		//driver.navigate().to("https://www.shaadi.com/");
		driver.get("https://www.shaadi.com/");
		driver.manage().window().maximize();
	}

}
