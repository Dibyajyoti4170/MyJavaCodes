package mouseoveraction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		   driver.get("https://www.flipkart.com/");
		   Thread.sleep(8000);
		   driver.findElement(By.xpath("//button[@class ='_2AkmmA _29YdH8' ]")).click();
		   List<WebElement> menu=driver.findElements(By.xpath("//ul[@class='_114Zhd']/li"));
		   Actions a = new Actions(driver);
		   for (WebElement name : menu) {
			   System.out.println(name.getText());
			   a.moveToElement(name).build().perform();
			   Thread.sleep(8000);
			   List<WebElement> sub=driver.findElements(By.xpath("//div[@class='taxontype']/a[@class='inverted']"));
			   for (WebElement name1 : menu) {
				   
				   System.err.println(name1.getText());
				   a.moveToElement(name).build().perform();
				   Thread.sleep(8000);
			   
		   

}
}
}
}
