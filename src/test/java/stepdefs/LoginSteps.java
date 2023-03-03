package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import pages.HomePage;
import pages.LoginPage;

public class LoginSteps {

    //Create objects of both Page Classes in order to implement
    // the page's methods into the steps.

    LoginPage loginPage = new LoginPage();

    @Given("user enters valid {string} and {string}")
    public void user_enters_valid_username_and_password(String username, String password) {
        loginPage.enterValidLoginInfo("valid.username", "valid.password");
    }
    @When("user clicks on sign in button")
    public void user_clicks_on_sign_in_button() {
        loginPage.clickSignInButton();
    }



}
