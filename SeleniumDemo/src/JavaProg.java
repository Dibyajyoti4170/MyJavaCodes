import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaProg {

		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "software\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			   driver.get("https://www.google.com/");
			   Thread.sleep(8000);
			   WebElement a1 = driver.findElement(By.id("fakebox-input"));
				a1.click();
				Thread.sleep(9000);
				driver.findElement(By.name("q")).sendKeys("java",Keys.ENTER);
				Thread.sleep(9000);
				driver.findElement(By.xpath("//a[contains(.,'Images')]")).click();
				Thread.sleep(9000);
				driver.findElement(By.xpath("//img[@id='rT8rqQKh8jt3DM:']")).click();
				Thread.sleep(9000);
				
				
	

	}

}
