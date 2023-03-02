package stepdefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

public class HomeSteps {
    HomePage homePage = new HomePage();
    @Then("verify user is successfully logged into the account")
    public void verify_user_is_successfully_logged_into_the_account() {
        homePage.verifyPage();
    }
    @When("user clicks on transfer between accounts")
    public void user_clicks_on_transfer_between_accounts() {
        
    }


}
