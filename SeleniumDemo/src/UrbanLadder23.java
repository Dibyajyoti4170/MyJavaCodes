import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UrbanLadder23 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.get("https://www.urbanladder.com/");
		driver.manage().window().maximize();
		WebElement Dining = driver.findElement(By.xpath("//li[contains(@class,''topnav_item diningunit'')]"));
		System.out.println(Dining.getText());
	
	}
}
