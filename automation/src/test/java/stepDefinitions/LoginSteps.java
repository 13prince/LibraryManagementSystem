package stepDefinitions;

import base.BaseTest;
import pages.LoginPage;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.*;
import org.testng.Assert;

public class LoginSteps {
    WebDriver driver;
    LoginPage loginPage;

    @Given("user is on the Login page")
    public void user_on_login_page() {
        driver = BaseTest.driver;
        loginPage = new LoginPage(driver);
        driver.get("https://library-assignment-zeta.vercel.app/login");
    }

    @When("user enters valid email and password")
    public void user_enters_credentials() {
        loginPage.login("test@example.com", "Test1234");
    }

    @Then("user should be redirected to homepage")
    public void redirected_to_homepage() {
        Assert.assertTrue(driver.getCurrentUrl().contains("home"));
    }
}