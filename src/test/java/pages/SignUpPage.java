package pages;

import com.github.javafaker.Faker;
import io.cucumber.java.eo.Se;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

public class SignUpPage extends BasePage{
    @FindBy (id = "title")
    WebElement titleBox;

    @FindBy (id = "firstName")
    WebElement firstNameBox;

    @FindBy (id = "lastName")
    WebElement lastNameBox;

    @FindBy (id = "gender")
    WebElement maleGenderBox;

    @FindBy (id = "dob")
    WebElement dateOfBirthBox;

    @FindBy (id = "ssn")
    WebElement socialSecurityNumberBox;

    @FindBy (id = "emailAddress")
    WebElement emailAddressBox;

    @FindBy (id = "password")
    WebElement passwordBox;

    @FindBy (id = "confirmPassword")
    WebElement confirmPasswordBox;

    @FindBy (xpath = "//button")
    WebElement nextButton;

    @FindBy (id = "address")
    WebElement addressBox;

    @FindBy (id = "locality")
    WebElement localityBox;

    @FindBy (id = "region")
    WebElement regionBox;

    @FindBy (id = "postalCode")
    WebElement postalCodeBox;

    @FindBy (id = "country")
    WebElement countryBox;

    @FindBy (id = "homePhone")
    WebElement homePhoneBox;

    @FindBy (id = "mobilePhone")
    WebElement mobilePhoneBox;

    @FindBy (id = "workPhone")
    WebElement workPhoneBox;

    @FindBy (id = "agree-terms")
    WebElement agreeTermsCheckBox;

    @FindBy (xpath = "//button")
    WebElement registerButton;

    @FindBy (xpath = "//span[contains(text(),'Registration Successful')]")
    WebElement registrationSuccessMessage;


    public void selectTitle(){
        Select select = new Select(titleBox);
        select.selectByVisibleText("Mr.");
    }

    public void enterFirstName(){
        firstNameBox.sendKeys("Charlie");
    }

    public void enterLastName(){
        lastNameBox.sendKeys("Davis");
    }

    public void selectMaleGender(){
        maleGenderBox.click();
    }

    public void enterDOB(){
        dateOfBirthBox.sendKeys("07/10/1997");
    }

    public void enterSSN(){
        socialSecurityNumberBox.sendKeys(faker.idNumber().ssnValid());
    }

    public void enterEmailAddress(){
        emailAddressBox.sendKeys(faker.internet().emailAddress());
    }

    public void enterPassword(){
        passwordBox.sendKeys("12321Asdfgh!");
    }

    public void confirmPassword(){
        confirmPasswordBox.sendKeys("12321Asdfgh!");
    }

    public void clickNextBtn(){
        nextButton.click();
    }

    public void enterAddress(){
        addressBox.sendKeys("12345 Digidigi Lane");
    }

    public void enterLocality(){
        localityBox.sendKeys("BigBoiCity");
    }

    public void enterRegion(){
        regionBox.sendKeys("CA");
    }

    public void enterPostalCode(){
        postalCodeBox.sendKeys("94087");
    }

    public void enterCountry(){
        countryBox.sendKeys("US");
    }

    public void enterHomePhone(){
        homePhoneBox.sendKeys("409 725-8366");
    }

    public void enterMobilePhone(){
        mobilePhoneBox.sendKeys("864 826-9174");
    }

    public void enterWorkPhone(){
        workPhoneBox.sendKeys("");
    }

    public void agreeToTermsAndPolicy(){
        agreeTermsCheckBox.click();
    }

    public void clickRegisterButton(){
        registerButton.click();
    }

    public void verifyRegistrationSuccess(){
        Assert.assertTrue("Registration success message not seen", registrationSuccessMessage.isDisplayed());
    }

    //  Java use of the Random class
//    public static int generate9DigitRandomNumber() {
//        Random random = new Random();
//        return 100000000 + random.nextInt(900000000);
//    }
}
