package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	
	@FindBy(xpath = "//input[@placeholder='Enter your Username']")
	WebElement usernameInput;
	
	@FindBy(xpath = "//input[@placeholder='Enter your password']")
	WebElement passwordInput;
	
	@FindBy(xpath = "//button[@type=\'submit\']")
    WebElement loginButton;
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	public void enterUsername(String username) {
		usernameInput.sendKeys(username);
	}
	
	public void enterPassword(String password){
	        passwordInput.sendKeys(password);
	}

	public void clickLogin(){
	        loginButton.click();
	}
}
