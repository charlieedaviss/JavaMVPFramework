package stepdefs;

import io.cucumber.java.en.Then;
import pages.ViewAccountPage;
import utilities.DatabaseUtils;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ViewAccountSteps {

    ViewAccountPage viewAccountPage = new ViewAccountPage();

    @Then("verify user is on View Accounts Page")
    public void verify_user_is_on_view_accounts_page() {
        viewAccountPage.verifyAccountPage();


    }

    @Then("verify transaction history displayed for the new transaction")
    public void verify_transaction_history_displayed_for_the_new_transaction() {
        viewAccountPage.verifyTransactionHistor();

    }

    @Then("verify transaction details getting updated into the database")
    public void verify_transaction_details_getting_updated_into_the_database() {
        viewAccountPage.verifyDetailsIntoDatabase();

    }

    @Then("verify account has been stored in database")
    public void verifyAccountHasBeenStoredInDatabase() {
       viewAccountPage.verifyDetailsIntoDatabase();
        }
    }

