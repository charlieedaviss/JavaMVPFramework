package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BasePage;
import pages.HomePage;
import pages.LoginPage;

public class LogoutSteps {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Given("user is logged in")
    public void user_is_logged_in() {
        loginPage.enterValidLoginInfo();
        loginPage.clickSignInButton();
        homePage.verifyPage();

    }

    @When("user clicks on the profile icon and the log out button")
    public void user_clicks_on_the_profile_icon_and_the_log_out_button() {
        homePage.logOut();

    }

    @Then("verify user is back on log in page")
    public void verify_user_is_back_on_log_in_page() throws InterruptedException {
        loginPage.verifyLogOut();

    }
}