package epsilon.WebDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClass {
	 public static void main(String[] args) throws InterruptedException {
		 
		// 1.open the browser
			WebDriverManager.firefoxdriver().setup();
			// create the webdriver object of type edgedriver
			WebDriver driver = new FirefoxDriver();
			
			//maximise the browser window
			driver.manage().window().maximize();
			/*
			// 2.load the URL
			// driver.get("https://amazon.com");
			
			// WebElement ele = driver.findElement(By.xpath("//div[test()='EN']"));
			
			// Actions act = new Actions(driver);
			// act.moveToElement(ele).perform();
			
			
			//mouse hovaring
			driver.get("https://demoqa.com/buttons");
			
			WebElement ele = driver.findElement(By.id("doubleClickBtn"));
			
			// double clicking
			Actions act = new Actions(driver);
			act.doubleClick(ele).perform();
			
			//right click
			WebElement rbtn = driver.findElement(By.id("rightClickBtn"));
			act.contextClick(rbtn).perform();
			
			
			// drag and drop
			driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
			WebElement srcele = driver.findElement(By.xpath("(//div[text() = 'Washington'])[2]"));
			WebElement destele = driver.findElement(By.xpath("//div[text() = 'United States']"));
			
			Actions act = new Actions(driver);
			act.dragAndDrop(srcele, destele).perform();
			
			*/
			
			driver.get("https://www.makemytrip.com/");
			
			Thread.sleep(3000);
			
			Actions act = new Actions(driver);
			act.moveByOffset(10,10).click().perform();
			System.out.println("popup called");
			
			Thread.sleep(3000);
			act.moveByOffset(10,10).click().perform();
			System.out.println("popup called");

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.titleContains("hi")); //it gives timeoutException since Hi is not there in title of the page
			System.out.println("condition satisfied");
	 }
}
