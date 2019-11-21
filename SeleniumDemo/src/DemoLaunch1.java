import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLaunch1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		//driver.get("https://www.facebook.com/");
		driver.get("https://www.gmail.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("identifierId")).sendKeys("8895550303",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("Divyarupa",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.id("forgotPassword")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("om sai ram",Keys.ENTER);
		Thread.sleep(2000);
		//WebElement pas = driver.findElement(By.id("pas"));
		//email.sendKeys("disha patani");
		//WebElement log = driver.findElement(By.id("loginbutton"));
		//log.click();
		//pas.sendKeys("tiger shroff",Keys.ENTER);
		


	}

}
