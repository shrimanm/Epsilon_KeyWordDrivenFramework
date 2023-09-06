package epsilon.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HiddenPopup {
	public static void main(String[] args) throws InterruptedException {
		//launch the browser
		WebDriverManager.firefoxdriver().setup();
		// create the webdriver object of type edgedriver
		WebDriver driver = new FirefoxDriver();
		
		//maximise the browser window
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		
		// 2.login
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("admin");
		driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");					driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.id("loginButton")).click();

		Thread.sleep(5000);
		
		// 3.navigate to task
		driver.findElement(By.id("container_tasks")).click();
		Thread.sleep(2000);
		
		// 4.check on checkbox
		driver.findElement(By.xpath("(//div[@class = 'img'])[2]")).click();
		
		// 5.click on copyto
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='copyTo button']")).click();
		
		// 6.click on cancel in Hidden division popup
		Thread.sleep(2000);
		 driver.findElement(By.xpath("(//div[@class=\"ok button\"]/following-sibling::div[@class=\"cancel button\"])[5]")).click();
			
					
					
	}
}
