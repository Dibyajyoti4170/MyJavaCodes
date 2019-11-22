import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlueStone {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bluestone.com/");
		driver.manage().window().maximize();
		WebElement a1 = driver.findElement(By.id("login"));
		a1.click();
		Thread.sleep(2000);
	    driver.findElement(By.id("email-id")).sendKeys("pattnaikdibyajyoti883@gmail.com",Keys.ENTER);
	    Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("18915@FA2",Keys.ENTER);
	}

}
