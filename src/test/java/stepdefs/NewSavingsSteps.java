package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.HomePage;
import pages.NewSavingsPage;
import pages.SavingsPage;
import utilities.DatabaseUtils;

public class NewSavingsSteps {

    HomePage homePage = new HomePage();
    SavingsPage savingsPage = new SavingsPage();
    NewSavingsPage newSavingsPage = new NewSavingsPage();
    @Then("user opens new savings page")
    public void user_opens_new_savings_page() {
       homePage.openNewSavingsPage();
    }
    @Then("user submits new savings account data")
    public void user_submits_new_savings_account_data() {
       newSavingsPage.enterNewSavingsData();
    }
    @Then("correct savings account information is displayed")
    public void correct_savings_account_information_is_displayed() throws InterruptedException {
        savingsPage.verifyOnSavingsPage();
        savingsPage.verifyNewAccountMsg();
        savingsPage.verifyNewAccountName();
        savingsPage.verifyNewAccountOwnershipType();
        savingsPage.verifyNewAccountBalance();
        Thread.sleep(6000);
    }

    @Then("verify account has been stored in database")
    public void verify_account_has_been_stored_in_database() {
        DatabaseUtils.executeQuery("Select * from digitalbank.account where id =4715");

    }
}
