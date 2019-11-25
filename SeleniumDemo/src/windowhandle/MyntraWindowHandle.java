package windowhandle;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class MyntraWindowHandle {
		public static void main(String[] args) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to("https://www.myntra.com/");
			driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("premium perfumes",Keys.ENTER);
			WebElement search = driver.findElement(By.xpath("//img[@src='https://assets.myntassets.com/dpr_2,q_60,w_210,c_limit,fl_progressive/assets/images/7276065/2018/9/27/c723213c-2763-4e44-bf6a-61e16f64531b1538046901510-Emporio-Armani-Men-Watches-9021538046901402-1.jpg']"));
			search.click();
			Set<String> tabs=driver.getWindowHandles();
			for(String tab:tabs)
			driver.switchTo().window(tab);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//img[@alt='SHAMA Unisex Chrome Premium Vintage Collection Alcohol Free Perfume 100 ml']")).click();
			Thread.sleep(3000);
			WebElement we = driver.findElement(By.xpath("//h4[@class='size-buttons-select-size']"));
			System.out.println(we.getText());
		}
	}



