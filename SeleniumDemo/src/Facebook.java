import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement email = driver.findElement(By.xpath("//input[@type=\\\"email\\\"]\""));
		System.out.println(email.getText());
		//driver.findElement(By.xpath("//input[@type=\\\"email\\\"]\"")).sendKeys(email.getText());
		//WebElement pass = driver.findElement(By.xpath("//label[@for=\\\"pass\\\"]\""));
		//System.out.println(pass.getText());
		//driver.findElement(By.xpath("//input[@type=\\\"pass\\\"]\"")).sendKeys(pass.getText());
		email.sendKeys("email.gettext()");
        
	}

}
