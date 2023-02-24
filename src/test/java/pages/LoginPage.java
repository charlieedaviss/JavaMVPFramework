package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import utilities.ConfigReader;

public class LoginPage extends BasePage {

    // Website is http://18.116.88.132:8080/bank/login
    // @FindBy() annotation takes in Type of locator and the locator itself
    // in order to find & initialize the WebElement variable created below it

    @FindBy (id = "username")
    WebElement usernameInput;

    @FindBy (id = "password")
    WebElement passwordInput;

    @FindBy (id = "submit")
    WebElement submitBtn;

    @FindBy(xpath = "//*[@class='badge badge-pill badge-success']")
    WebElement successfulLogOutMsg;

    @FindBy (xpath = "//a[@href='/bank/signup']")
    public WebElement signUpHereBox;

    public void verifyOnLoginPage() {
    Assert.assertTrue("User is not on login page", driver.getCurrentUrl().equalsIgnoreCase("http://18.116.88.132:8080/bank/login"));
    }

    public void enterValidLoginInfo(){
        usernameInput.sendKeys("charliee.daviss@gmail.com");
        passwordInput.sendKeys("Beefstewme1@");
    }

    public void enterValidLoginInfo(String username, String password){
        usernameInput.sendKeys(ConfigReader.getConfigProperty(username));
        passwordInput.sendKeys(ConfigReader.getConfigProperty(password));
    }

    public void clickSignInButton(){
        submitBtn.click();
    }

    public void verifyLogOut(){
        Assert.assertTrue("Successful massage is not present", successfulLogOutMsg.isDisplayed());
    }

    public void clickSignupHereBtn(){
        signUpHereBox.click();
    }
}
