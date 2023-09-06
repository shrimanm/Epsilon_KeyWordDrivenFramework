package epsilon.WebDriver;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertion {

	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Load the url
		driver.get("https://demo.actitime.com/login.do");
		
		
		// validate for home page title
				String expTitle = "actiTIME - Login";
				String actTitle = driver.getTitle();
				
			 	Assert.assertEquals(expTitle, actTitle);
			 	System.out.println("passed");
				
	}
}
