package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class DepositPage extends BasePage{
    @FindBy(css = "#selectedAccount")
    WebElement accountForDepositDropDown;
    @FindBy(css = "#amount")
    WebElement depositAmountBox;
    @FindBy(xpath = "//button[contains(@class,'btn-primary')]")
    WebElement depositSubmitButton;

    public void selectAccountForDeposit(String account){
        Select select = new Select(accountForDepositDropDown);
        select.selectByVisibleText(account);
    }

    public void enterDepositAMount(String amount){
        depositAmountBox.sendKeys(amount);
    }

    public void clickSubmitButton(){
        depositSubmitButton.click();
    }

}
