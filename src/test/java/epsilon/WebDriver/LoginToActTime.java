package epsilon.WebDriver;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepo.LoginPage;

public class LoginToActTime {

	
	@Test
	public void loginToApp() {
		// TODO Auto-generated method stub
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
					
					lp.loginToApp("admin", "manager");
					
					
	}

}
