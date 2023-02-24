package pages;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewSavingsPage extends BasePage{
    @FindBy(id = "Savings")
    WebElement savingsRadioBtn;
    @FindBy(id = "Joint")
    WebElement jointRadioBtn;
    @FindBy(id = "name")
    WebElement accountNameBox;
    @FindBy(id = "openingBalance")
    WebElement initialDeposit;
    @FindBy(xpath = "//button[@id='newSavingsSubmit']")
    WebElement submitButton;


    public void enterNewSavingsData(){
        savingsRadioBtn.click();
        jointRadioBtn.click();
        accountNameBox.sendKeys("AutomationTest10");
        initialDeposit.sendKeys("250000");
        submitButton.click();
    }

}
