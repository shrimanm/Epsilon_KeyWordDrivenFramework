package epsilon.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class selectmenu {
	public static void main(String[] args) throws InterruptedException {
		
		//task
		
		// 1.open the browser
		WebDriverManager.firefoxdriver().setup();
		// create the webdriver object of type edgedriver
		WebDriver driver = new FirefoxDriver();
		
		//maximise the browser window
		driver.manage().window().maximize();
		
		// 2.load the URL
		driver.get("https://demoqa.com/select-menu");
			
					
		// 3.create an object of select class
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)","");
		
		// single select dropdown
		WebElement selectmenu = driver.findElement(By.xpath("//select[@id='oldSelectMenu']"));
		
		Select sel = new Select(selectmenu);
		sel.selectByIndex(6);
		Thread.sleep(1000);
		sel.selectByValue("7");
		Thread.sleep(1000);
		sel.selectByVisibleText("Aqua");
		System.out.println("data selected");
		
		//multi select dropdown
		WebElement multi = driver.findElement(By.id("cars"));
		
		Select se = new Select(multi);
		se.selectByValue("Volvo");
		
		Thread.sleep(2000);
		
		se.selectByValue("Audi");
		
		
					
	}
}
