package stepdefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BasePage;
import pages.DepositPage;
import pages.HomePage;

public class DepositSteps {

    HomePage homePage = new HomePage();
    DepositPage depositPage = new DepositPage();
    @When("user clicks on {string} menu item")
    public void user_clicks_on_menu_item(String menuItem) {
       homePage.clickOnMenuItem(menuItem);
    }
    @Then("verify user is on the {string} page")
    public void verify_user_is_on_the_page(String url) {
        homePage.verifyUserIsOnPage(url);
    }
    @Then("user selects {string} for deposit from dropdown")
    public void user_selects_account_for_deposit_from_dropdown(String account) {
        depositPage.selectAccountForDeposit(account);
    }
    @Then("user enters deposit {string} and clicks on submit button")
    public void user_enters_deposit_info_and_clicks_on_submit_button(String amount) {
        depositPage.enterDepositAMount(amount);
        depositPage.clickSubmitButton();
    }


}
