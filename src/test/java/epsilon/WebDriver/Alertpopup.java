package epsilon.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alertpopup {

	public static void main(String[] args) throws InterruptedException {
		//launch the browser
		WebDriverManager.firefoxdriver().setup();
		// create the webdriver object of type edgedriver
		WebDriver driver = new FirefoxDriver();
		
		//maximise the browser window
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/alerts");
		
		// 1. click the alert and press ok
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		Thread.sleep(2000);
		
		// 2. click alert and fetch the text displayed and select ok or cancel
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(2000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		
		Thread.sleep(2000);
		
		// 3.click the prompt and enter something and press ok
		driver.findElement(By.id("promtButton")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("shriman");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		
	}
	
}
