package epsilon.WebDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChildWindowHandle {
	public static void main(String[] args) throws InterruptedException {
		// 1. load browser
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		// 2.load url
		driver.get("https://demo.automationtesting.in/Windows.html#google_vignette");
		
		// 3.navigate to separate window
		driver.findElement(By.linkText("Open New Seperate Windows")).click();
		
		// 4.click
		driver.findElement(By.xpath("//button[.='click']")).click();

		// 5.capture the mainwinow ID
		String mainWindowID = driver.getWindowHandle();
		System.out.println(mainWindowID);
		
		//6. capture all window ID
		Set<String> allWindowIDs = driver.getWindowHandles();
		System.out.println(allWindowIDs);
		
		//switch to child window
		for(String winID:allWindowIDs) {
			if(!winID.equals(mainWindowID)) {
				driver.switchTo().window(winID);
				System.out.println("control to child window");
				break;
			}
		}
		
		Thread.sleep(4000);
		
		//click on downloads in child window
		driver.findElement(By.xpath("//a[@id='navbarDropdown']")).click();
		
		//switch back to main window
		driver.switchTo().window(mainWindowID);
		
		//click on register
		Thread.sleep(2000);
		driver.findElement(By.linkText("Register")).click();
		
		driver.quit();
	}
}
