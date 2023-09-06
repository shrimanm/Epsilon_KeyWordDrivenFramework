package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	// rule 1 : create a separate POM class
		// rule 2 : find the web element by @FindBy annotation
			@FindBy(name="username") private WebElement usernameEdt;
			
			@FindBy(name="pwd") private WebElement passwordEdt;
			
			@FindBy(id="loginButton") private WebElement loginButton;
			
		// rule 3 : create a construstor for initialization of element
			public LoginPage(WebDriver driver) {
				PageFactory.initElements(driver, this);
			}

			
			
		// rule 4: provide the getters to access the web element
			
			public WebElement getUsernameEdt() {
				return usernameEdt;
			}

			public WebElement getPasswordEdt() {
				return passwordEdt;
			}

			public WebElement getLoginButton() {
				return loginButton;
			}
			
			// Bussiness library
			public void loginToApp(String USERNAME,String PASSWORD) {
				usernameEdt.sendKeys(USERNAME);
				passwordEdt.sendKeys(PASSWORD);
				loginButton.click();
			}
			
			
}
