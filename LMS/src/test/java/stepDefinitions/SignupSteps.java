package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import io.cucumber.java.en.*;
import pages.SignupPage;


public class SignupSteps {
	WebDriver driver;
    SignupPage signupPage;
    
    public SignupSteps() {
        this.driver = Hooks.getDriver(); // ✅ Static method call
        this.signupPage = new SignupPage(driver); // ✅ Initialize LoginPage
    }
	
	

    @Given("User is on the signup page")
    public void user_is_on_the_signup_page() {
    	driver.get("https://library-assignment-zeta.vercel.app");
        driver.findElement(By.xpath("//button[text()='Login']")).click();
        driver.findElement(By.xpath("//span[text()='Sign Up']")).click();
    }

    @When("User enters username {string}")
    public void user_enters_username(String username) {
        signupPage.enterUsername(username);
    }

    @When("User enters email {string}")
    public void user_enters_email(String email) {
        signupPage.enterEmail(email);
    }

    @When("User enters password {string}")
    public void user_enters_password(String password) {
        signupPage.enterPassword(password);
    }

    @When("User selects role {string}")
    public void user_selects_role(String role) {
        signupPage.enterRole(role);
    }

    @When("User clicks on the register button")
    public void user_clicks_on_the_register_button() {
        signupPage.clickRegister();
    }

    @Then("User should be registered successfully")
    public void user_should_be_registered_successfully() {
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("signup") || currentUrl.contains("home"),
                "User is not redirected after signup. Current URL: " + currentUrl);
    }
    
    @When("User leaves the username field empty {string}")
    	public void user_leaves_the_username_field_empty(String username) {
            signupPage.enterUsername(username);
    }
    	
 

    @Then("An error message {string} should be displayed")
    public void an_error_message_should_be_displayed(String string) {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	WebElement errorPopup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='1']")));
    	Assert.assertTrue(errorPopup.isDisplayed(), "Error popup is not displayed");
    }
    
    @When("User leaves the email field empty {string}")
    public void user_leaves_the_email_field_empty(String email) {
    	signupPage.enterEmail(email);
    }

    @When("User leaves the password field empty {string}")
    public void user_leaves_the_password_field_empty(String password) {
    	signupPage.enterPassword(password);
    }
    
    @Then("An error message {string} should be popup")
    public void an_error_message_should_be_popup(String string) {
    	WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
    	WebElement errorPopup = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='1']")));
    	Assert.assertTrue(errorPopup.isDisplayed(), "Error popup is not displayed");
    }


}
