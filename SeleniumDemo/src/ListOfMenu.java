import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListOfMenu {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "software\\chromedriver.exe");
		   WebDriver driver =new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://www.urbanladder.com/");
		   Thread.sleep(8000);
		   driver.findElement(By.xpath("//a[@data-gaaction ='popup.auth.close']")).click();
		  // WebElement sale = driver.findElement(By.xpath("//span[contains(.,'sale')]"));
		   //System.out.println(sale.getText());
		/*
		 * WebElement dining = driver.findElement(By.
		 * xpath("//li[@class='topnav_item diningunit']/span[@class='topnav_itemname']")
		 * ); System.out.println(dining.getText()); WebElement sale =
		 * driver.findElement(By.
		 * xpath(" //li[@class='topnav_item saleunit']/span[@class='topnav_itemname']"))
		 * ; System.out.println(sale.getText());
		 * driver.findElement(By.xpath("//input[@name='keywords']")).sendKeys(dining.
		 * getText(),Keys.ENTER);
		 * driver.findElement(By.xpath("//li/a[contains(.,'Stores')]"));
		 * driver.findElement(By.xpath("//a[contains(.,'Track Order')]")).click();
		 */
		   List<WebElement> menu=driver.findElements(By.xpath("//ul[@class='topnav bodytext']/li"));
		   for (WebElement name : menu) {
			   System.out.println(name.getText());
			   
			   
			
		}
			
		}
		}

