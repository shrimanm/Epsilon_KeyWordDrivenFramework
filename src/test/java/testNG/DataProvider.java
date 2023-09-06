package testNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepo.LoginPage;

public class DataProvider {

	@Test(dataProvider = "getdata")
	public void sample(String username, String password) {
		System.out.println("username = " + username + "and password = " + password);
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Load the url
		driver.get("https://demo.actitime.com/login.do");
		
		
		//login to application
		LoginPage lp = new LoginPage(driver);
		
		/*
		lp.getUsernameEdt().sendKeys("admin");
		lp.getPasswordEdt().sendKeys("manager");
		lp.getLoginButton().click();
		*/
		
		lp.loginToApp(username, password);
		
		
		
		
	}
	
	@org.testng.annotations.DataProvider
	public Object[][] getdata(){
		Object[][] data = new Object[3][2];
		data[0][0] = "admin";
		data[0][1] = "manager";
		data[1][0] = "trainee";
		data[1][1] = "trainee";
		data[2][0] = "hi";
		data[2][1] = "hlo";
				
		
		return data;
		
	}
	
	
	
}
