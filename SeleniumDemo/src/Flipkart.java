import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		   driver.get("https://www.flipkart.com/");
		   Thread.sleep(8000);
		   driver.findElement(By.xpath("//button[@class ='_2AkmmA _29YdH8' ]")).click();
		   List<WebElement> menu=driver.findElements(By.xpath("//ul[@class='_114Zhd']/li"));
		   for (WebElement name : menu) {
			   System.out.println(name.getText());
			   //driver.findElement(By.xpath("//span[contains(.,'Electronics')]/parent::li/descendant::ul[@class='_2OZ78M _1fj2FQ']"));
			   driver.findElement(By.xpath("//span[contains(.,'Electronics')]/parent::li/descendant::ul[@class='_2OZ78M _1fj2FQ']/li"));
			   
			
		}
			
		}

		
	}
