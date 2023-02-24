package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SavingsPage extends BasePage{
    @FindBy(id = "new-account-msg")
    WebElement newAccountMsg;
    @FindBy(xpath = "//div[contains(text(), 'AutomationTest10')]")
    WebElement newSavingsAccountName;
    @FindBy(xpath = "//div[contains(text(),'AutomationTest10')]/ancestor::form//small[contains(text(),'Account: ')]")
    WebElement newSavingsAccountType;
    @FindBy(xpath = "//div[contains(text(),'AutomationTest10')]/ancestor::form//small[contains(text(),'Ownership: ')]")
    WebElement newSavingsAccountOwnershipType;
    @FindBy(xpath = "//div[contains(text(),'AutomationTest10')]/ancestor::form//div[contains(text(),'Balance: ')]")
    WebElement newSavingsAccountBalance;

    public void verifyOnSavingsPage(){
        Assert.assertTrue("Savings page is not displayed", driver.getCurrentUrl().contains("http://18.116.88.132:8080/bank/account/savings-view"));
    }

    public void verifyNewAccountMsg(){
        Assert.assertTrue("New Account message is displaying incorrect text", newAccountMsg.getText().equalsIgnoreCase("successfully created new savings account named automationtest10"));
    }

    public void verifyNewAccountName(){
        Assert.assertTrue("New Account name is displaying incorrect text", newSavingsAccountName.getText().equalsIgnoreCase("automationtest10"));
    }

    public void verifyNewAccountType(){
        Assert.assertTrue("New Account type is displaying incorrect text", newSavingsAccountType.getText().equalsIgnoreCase("Account: Savings"));
    }

    public void verifyNewAccountOwnershipType(){
        Assert.assertTrue("New Account ownership type is displaying incorrect text", newSavingsAccountOwnershipType.getText().equalsIgnoreCase("Ownership: Joint"));
    }

    public void verifyNewAccountBalance(){
        Assert.assertTrue("New Account balance is displaying incorrect text", newSavingsAccountBalance.getText().equalsIgnoreCase("Balance: $250000.00"));
    }
}
