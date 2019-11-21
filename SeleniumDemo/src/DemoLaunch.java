import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLaunch {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.get("https://www.facebook.com/");
		//driver.navigate().to("https://www.facebook.com/");
		//driver.navigate().to("https://www.google.com/");
		driver.navigate().to("https://www.naukri.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.close();//close the current tab.
		//driver.quit();//close the entire browser
		String title = driver.getTitle();
		System.out.println(title);
		System.out.println(driver.getCurrentUrl());
		String parent = driver.getWindowHandle();//display reference of one parent only
		System.out.println(parent);
		Thread.sleep(2000);
		System.out.println("********************************************************************************");
		Set<String> wins = driver.getWindowHandles();//display reference of one parent and 3 child
		//wins.remove(parent);//removing the common parent
		//for (String win : wins) {
		//driver.switchTo().window(win).close();
		driver.getPageSource();
		
		
ArrayList<String> st = new ArrayList<>(wins);
//ArrayList<String> 1st = new ArrayList<>();
for(int i = st.size()-1;i>=0;i--)
{
	st.addAll(wins);
	driver.switchTo().window(st.get(i)).close();
}
	}
}



//set property is a static method of system class which has two argument key and value, key ask for which 
//browser we want to launch and value ask for where the driver executable is present.
//. represents anywhere in my project.
//get is a non-static method to load the url, return type is void and argument is string.
//close-->void--->close the browser.
//driver.manage().window().maximize()-method chaining
//manage-options--->manage the browser window
//navigate--->navigation--->to navigate
