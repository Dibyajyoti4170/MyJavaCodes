package mouseoveraction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class BlueStone {
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.bluestone.com/");
		WebElement jew = driver.findElement(By.xpath("//a[contains(.,'All Jewellery')]"));
		Actions a=new Actions(driver);
		a.moveToElement(jew).build().perform();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='Kadas']")).click();
		driver.findElement(By.xpath("//img[@alt='The Arjun Kada For Him']")).click();
		driver.findElement(By.xpath("//input[@onclick=\'createEventLogInBatches('buyNow','ProductId','005675-3220438');trackGA( 'BsUI',  'Buy-button-clicked',  'Buy-button');logCustomizationAttemptedEvent(this)\']")).click();

	
	
}
}