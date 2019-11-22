package assignment2;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AutoSuggestion1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",".\\software\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement search =driver.findElement(By.name("q"));
		search.sendKeys("java");
		search.click();
	    List<WebElement>menu = driver.findElements(By.xpath("//ul[@class=\"erkvQe\"]"));
		for(WebElement name:menu)
		{
			System.out.println(name.getText());
		}
	}

	}


