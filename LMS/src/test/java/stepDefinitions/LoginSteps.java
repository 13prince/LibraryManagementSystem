package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;
import pages.LoginPage;

public class LoginSteps {
	
	WebDriver driver;
    LoginPage loginPage;
    
	 @Given("User is on the login page")
	    public void user_is_on_the_login_page() {
		 this.driver = Hooks.getDriver(); // ✅ Static method call
	        this.loginPage = new LoginPage(driver);
	        driver.get("https://library-assignment-zeta.vercel.app");
	        driver.findElement(By.xpath("//button[text()='Login']")).click();
	        
	        // replace with actual login URL
	    }

	    @When("User enters login username {string}")
	    public void user_enters_login_username(String username) {
	        loginPage.enterUsername(username);
	    }

	    @When("User enters login password {string}")
	    public void user_enters_login_password(String password) {
	        loginPage.enterPassword(password);
	    }

	    @When("User clicks on the login button")
	    public void user_clicks_on_the_login_button() {
	        loginPage.clickLogin();
	    }

	    @Then("User should be logged in successfully")
	    public void user_should_be_logged_in_successfully() {
	        String expectedUrl = "https://library-assignment-zeta.vercel.app/login"; // replace with actual URL after login
	        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl, "Login failed!");
	    }
	

}
