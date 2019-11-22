import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UrbanLadder1 {

	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();	
			driver.get("https://www.urbanladder.com/");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[@data-gaaction ='popup.auth.close']")).click();
			WebElement sale = driver.findElement(By.xpath("//li[@class=\'topnav_item saleunit\"]/span[contains(.,'sale')"));
			System.out.println(sale.getText());
			WebElement Living = driver.findElement(By.xpath("//li[@class=\'topnav_item livingunit\"]/span[contains(.,'Living')"));
			System.out.println(Living.getText());
			WebElement Dining = driver.findElement(By.xpath("//li[@class=\"topnav_item diningunit\"]/span[contains(.,'Dining')]"));
			System.out.println(Dining.getText());
			WebElement Stores = driver.findElement(By.xpath("//li/a[contains(.,'Stores')]"));
			System.out.println(Stores.getText());
			WebElement TrackOrder = driver.findElement(By.xpath("//li/a[contains(.,'Track Order')]"));
			System.out.println(TrackOrder.getText());
			
			
			

	}

}
