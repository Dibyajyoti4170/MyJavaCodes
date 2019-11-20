package assignment1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		//driver.navigate().to("https://www.linkedin.com/");
		driver.get("https://www.linkedin.com/");
		driver.manage().window().maximize();

	}

}
