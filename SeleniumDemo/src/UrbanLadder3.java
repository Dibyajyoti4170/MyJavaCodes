import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UrbanLadder3 {
		
		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "software\\chromedriver.exe");
			   WebDriver driver =new ChromeDriver();
			   driver.manage().window().maximize();
			   driver.get("https://www.urbanladder.com/");
			   Thread.sleep(8000);
			   driver.findElement(By.xpath("//a[@data-gaaction ='popup.auth.close']")).click();
               driver.findElement(By.xpath("//span[contains(.,'Bedroom')]/parent::li/descendant::ul[@class=\"taxonslist\"]/li"));
	}

}
