package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ViewAccountPage extends BasePage{

    @FindBy(id = "transactionTable_wrapper")
    WebElement transactionHistory;

    public String getAccountID() {
        // .lastIndexOf() is not inclusive, need to add + 1 to te index
        return driver.getCurrentUrl().substring(driver.getCurrentUrl().lastIndexOf('=')+1);
    }

    public void verifyAccountPage() {
        Assert.assertTrue("View Account Page is not displayed", transactionHistory.isDisplayed());
    }

    public void verifyTransactionHistor() {
    }

    public void verifyDetailsIntoDatabase() {
    }
}
