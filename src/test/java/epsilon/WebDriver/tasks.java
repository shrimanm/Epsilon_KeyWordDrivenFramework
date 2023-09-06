package epsilon.WebDriver;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tasks {
	
		public static void main(String[] args) throws InterruptedException {
			// setup the edgedriver
			WebDriverManager.edgedriver().setup();
			// create the webdriver object of type edgedriver
			WebDriver driver = new EdgeDriver();
			
			//maximise the browser window
			driver.manage().window().maximize();
			//task
			// 1.load the URL
			driver.get("https://demo.actitime.com/login.do");
			
			// 2.identify the username text field using id or name or classname
			WebElement username = driver.findElement(By.id("username"));
			//enter the username
			username.sendKeys("admin");
			
			// 3.identify and enter the password text field using cssSelector
			driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
			
			// 4.identify and enter the login button
			driver.findElement(By.id("loginButton")).click();
			
			Thread.sleep(5000);
			
			// 5.go to task
			driver.findElement(By.id("container_tasks")).click();
			System.out.println("task opened");
			// 6.select all the checkboxes
			List<WebElement> allcheckbox = driver.findElements(By.xpath("//div[@class='img']"));
			
			for(int i=1;i<allcheckbox.size();i++) {
				for (WebElement ele : allcheckbox) {
					ele.click();
				}
			}
		}
}
