package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SignupPage extends BasePage {
	
	public SignupPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//input[@placeholder=\"Enter your username\"]")
	WebElement usernameInput;
	
	@FindBy(xpath = "//input[@placeholder=\"Enter your email\"]")
	WebElement emailInput;
	
	@FindBy(xpath = "//input[@placeholder=\"Enter your password\"]")
	WebElement passwordInput;
	
	@FindBy(xpath = "//select[@class=\"w-full px-4 py-2 border rounded-md focus:outline-none focus:ring-2 focus:ring-blue-400\"]")
	WebElement roleDropDown;
	
	@FindBy(xpath = "//button[@type=\"submit\"]")
	WebElement registerButton;
	
	public void enterUsername(String username) {
		usernameInput.sendKeys(username);
	}
	
	public void enterEmail(String email) {
		emailInput.sendKeys(email);
	}
	
	public void enterPassword(String password){
	        passwordInput.sendKeys(password);
	}
	
	public void enterRole(String role) { //role = Select Role, User, Admin
		Select drp = new Select(roleDropDown);
		drp.selectByVisibleText(role);
	}
	
	public void clickRegister(){
	        registerButton.click();
	}
}
