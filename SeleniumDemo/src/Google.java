import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {


		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();	
			//driver.get("https://www.facebook.com/");
			driver.get("https://www.google.com/");
			driver.manage().window().maximize();
			//driver.findElement(By.id("btnK")).sendKeys("java",Keys.ENTER);
			WebElement we = driver.findElement(By.name("q"));
			we.sendKeys("java",Keys.ENTER);
			Thread.sleep(3000);
			WebElement we1 = driver.findElement(By.name("q"));
			Thread.sleep(3000);
			we1.clear();
			Thread.sleep(3000);
			we1.sendKeys("selenium",Keys.ENTER);
			Thread.sleep(3000);
			driver.navigate().back();
			
			
			
			

	}

}
