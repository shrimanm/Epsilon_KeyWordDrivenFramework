package epsilon.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {
	public static void main(String[] args) throws InterruptedException {
		
		
		// setup the edgedriver
		WebDriverManager.edgedriver().setup();
		// create the webdriver object of type edgedriver
		WebDriver driver = new EdgeDriver();
		
		//maximise the browser window
		driver.manage().window().maximize();
		
		
		// agenda
		// 1.load the URL
		// 2.identify and enter the username
		// 3.identify and enter the password
		// 4.1 identify and click the login button
		// 4.2 identify and click the forgot password
		
		
		// load the URL
		driver.get("https://demo.actitime.com/login.do");
		
		
		// identify the username text field using id or name or classname
		WebElement username = driver.findElement(By.id("username"));
		//enter the username
		username.sendKeys("trainee");
		// print the username is identified
		System.out.println("username identified");
		
		
		// identify and enter the password text field using cssSelector
		driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("trainee");
		// print the password is identifed
		System.out.println("password identified");
		
		//returns the text associated with that tag
		String uname = username.getText();
		System.out.println(uname);
		
		//used to get the tagname of the web element
		String utag = username.getTagName();
		System.out.println(utag);
		
		//used to get the value of any attribute of the web element
		Object uatt = username.getAttribute("id");
		System.out.println(uatt);
		
		// returns the css properties value
		String height = username.getCssValue("height");
		System.out.println(height);
		
		Thread.sleep(3000);
		
		//used to clear the text field
		// driver.findElement(By.id("username")).clear();
		
		// identify the login button
		driver.findElement(By.id("loginButton")).click();
		// print login identified
		System.out.println("login successful");
		
		// login using xpath single attribute
		// driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		
		//login using xpath multiple attribute
		// driver.findElement(By.xpath("//a[@id='loginButton' and @class='initial']")).click();
		
		// accessing the visible text using xpath
		// driver.findElement(By.xpath("//div[text()='Logging in ...']"));
		
		//out of this website, use it for reference
		//accessing the element using xpath axis (vivo is the parent and the add to cart is its child)
		// driver.findElement(By.xpath("div[@class='vivo']/child::input[@value='addToCart']"));
		// here vivo and addtocart is the child of same parent
		// driver.findElement(By.xpath("div[@class='vivo']/following-sibling::input[@value='addToCart']");
		
		//identify and click the password using linktext locator
		// driver.findElement(By.linkText("Forgot your password?")).click();
		
		
		//it is used when we dont write the entire full name of the identifier text
		// driver.findElement(By.partialLinkText("Forgot your")).click();
		
		
		
		
		
	}
}
