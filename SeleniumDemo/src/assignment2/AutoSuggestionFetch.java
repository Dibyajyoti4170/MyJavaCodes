package assignment2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionFetch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement search =driver.findElement(By.name("q"));
		search.sendKeys("java",Keys.ENTER);
		List<WebElement> names=driver.findElements(By.xpath("//span[@class=\"S3Uucc\"]/parent::h3"));
		for(WebElement name:names)
		{
			System.out.println(name.getText());
		}

		driver.findElement(By.xpath("//span[contans(.,'Introduction to Java - W3Schools')]")).click();

	}

}