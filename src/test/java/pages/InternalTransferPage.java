package pages;

import io.cucumber.java.eo.Se;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import utilities.ConfigReader;

public class InternalTransferPage extends BasePage{

    @FindBy(xpath="//li[@class='active']")
    WebElement welcomeTestMessage;

    @FindBy(id = "fromAccount")
    WebElement fromAccountDropdown;

    @FindBy(id = "toAccount")
    WebElement toAccountDropdown;

    @FindBy(id = "amount")
    WebElement transferAmount;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm']")
    WebElement submitButton;


    public void verifyInternalTransferPage() {
        Assert.assertTrue("From Account dropdown not displayed", fromAccountDropdown.isDisplayed());
        Assert.assertTrue("To Account dropdown not displayed", toAccountDropdown.isDisplayed());

    }

    public void selectFromAccount(String fromAccount) {
        Select select = new Select(fromAccountDropdown);
        select.selectByVisibleText(ConfigReader.getConfigProperty(fromAccount));
    }

    public void selectToAccount(String toAccount) {
        Select select = new Select(toAccountDropdown);
        select.selectByVisibleText(ConfigReader.getConfigProperty(toAccount));
    }

    public void enterAmount(String amount) {
        transferAmount.sendKeys(ConfigReader.getConfigProperty(amount));
    }

    public void clickOnSubmitBtn() {
        submitButton.click();
    }
}
