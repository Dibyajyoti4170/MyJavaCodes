import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(8000);
		driver.findElement(By.name("q")).sendKeys("online");
		Thread.sleep(9000);
		driver.findElement(By.xpath("//span[contains(.,'onlinesbi')]"));
		List<WebElement> menu = driver.findElements(By.xpath("//ul[@class=\"erkvQe\"]/l"));
		for (WebElement name : menu) {
			System.out.println(name.getText());
		}

	}

}
