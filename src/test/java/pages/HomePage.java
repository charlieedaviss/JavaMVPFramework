package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "  //img[@class=\"user-avatar rounded-circle\"]")
    WebElement userIcon;
    @FindBy(xpath = " //div[@class=\"user-menu dropdown-menu show\"]//a[3]")
    WebElement logOutDropDown;
    @FindBy(xpath="//li[@class='active']")
    WebElement welcomeTestMessage;
    @FindBy(id = "savings-menu")
    WebElement savingsMenu;
    @FindBy(id = "new-savings-menu-item")
    WebElement newSavingsMenuItem;
    @FindBy(id = "deposit-menu-item")
    WebElement depositMenuItem;
    @FindBy(id = "withdraw-menu-item")
    WebElement withdrawMenuItem;
    @FindBy(id = "transfer-menu-item")
    WebElement transferItemMenu;


    public void logOut(){
        userIcon.click();
        logOutDropDown.click();
    }

    public void verifyPage(){
        Assert.assertTrue("Welcome text is not displayed, could be on wrong page", welcomeTestMessage.isDisplayed() );
    }

    public void clickOnTransferBetweenAccounts(){
        transferItemMenu.click();
    }

    public void openNewSavingsPage(){
        savingsMenu.click();
        Assert.assertTrue("New Savings menu item not displayed", newSavingsMenuItem.isDisplayed());
        newSavingsMenuItem.click();
        Assert.assertTrue("New Savings Account Page not open", driver.getCurrentUrl().equalsIgnoreCase("http://18.116.88.132:8080/bank/account/savings-add"));
    }

    public void clickOnMenuItem(String menuItem){
        switch (menuItem) {
            case "deposit":
                depositMenuItem.click();
                break;
            case "withdraw":
                withdrawMenuItem.click();
                break;
        }
    }

}
