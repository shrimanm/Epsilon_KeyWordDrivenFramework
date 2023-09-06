package epsilon.WebDriver;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {
	
	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup(); //it will download the updated driver executed
		WebDriver driver = new EdgeDriver();
		
		//Load the application - get()
		driver.get("https://flipkart.com");
		System.out.println("flipkart loaded");
		
		//to  get the title of the website
		String title = driver.getTitle();
		System.out.println(title);
		
		//to get the url of the website
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		//to get the page source
		// String pgsource = driver.getPageSource();
		// System.out.println(pgsource);
		
		String winhandle = driver.getWindowHandle();
		System.out.println(winhandle);
		
		Set<String> winhandles = driver.getWindowHandles();
		System.out.println(winhandles);

		// to load the browser in a maximized or minimized format
		// driver.manage().window().minimize();
		driver.manage().window().maximize();
		
		
		
		//close all the existing tabs and the browser
		// driver.close(); //close only the current window
		// driver.quit(); //close all the window and the browser
	}

}
