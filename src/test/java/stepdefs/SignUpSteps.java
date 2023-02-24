package stepdefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;
import pages.SignUpPage;

public class SignUpSteps {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    SignUpPage signUpPage = new SignUpPage();

    @When("user is on login page")
    public void user_is_on_login_page() {
        loginPage.verifyOnLoginPage();
    }
    @Then("user clicks on Sign Up Here button")
    public void user_clicks_on_sign_up_here_button() {
        loginPage.clickSignupHereBtn();
    }
    @Then("user chooses Title")
    public void user_chooses_title() {
        signUpPage.selectTitle();
    }
    @Then("user enters First Name")
    public void user_enters_first_name() {
        signUpPage.enterFirstName();
    }
    @Then("user enters Last Name")
    public void user_enters_last_name() {
        signUpPage.enterLastName();
    }
    @Then("user chooses Gender")
    public void user_chooses_gender() {
        signUpPage.selectMaleGender();
    }
    @Then("user enters Date of Birth")
    public void user_enters_date_of_birth() {
        signUpPage.enterDOB();
    }
    @Then("user enters SSN")
    public void user_enters_ssn() {
        signUpPage.enterSSN();
    }
    @Then("User enters Email Address")
    public void user_enters_email_address() {
        signUpPage.enterEmailAddress();
    }
    @Then("user enters Password")
    public void user_enters_password() {
        signUpPage.enterPassword();
    }
    @Then("user confirms Password")
    public void user_confirms_password() {
        signUpPage.confirmPassword();
    }
    @Then("user clicks Next button")
    public void user_clicks_next_button() {
        signUpPage.clickNextBtn();
    }

    // User should be taken to second page of the signup here
    @Then("user enters Address")
    public void user_enters_address() {
        signUpPage.enterAddress();
    }
    @Then("user enters Locality")
    public void user_enters_locality() {
        signUpPage.enterLocality();
    }
    @Then("user enters Region")
    public void user_enters_region() {
        signUpPage.enterRegion();
    }
    @Then("user enters Postal Code")
    public void user_enters_postal_code() {
        signUpPage.enterPostalCode();
    }
    @Then("user enters Country")
    public void user_enters_country() {
        signUpPage.enterCountry();
    }
    @Then("user enters Home Phone")
    public void user_enters_home_phone() {
        signUpPage.enterHomePhone();
    }
    @Then("user enters Mobile Phone")
    public void user_enters_mobile_phone() {
        signUpPage.enterMobilePhone();
    }
    @Then("user enters Work Phone")
    public void user_enters_work_phone() {
        signUpPage.enterWorkPhone();
    }
    @Then("user Agrees to Terms and Policy")
    public void user_agrees_to_terms_and_policy() {
        signUpPage.agreeToTermsAndPolicy();
    }
    @Then("user clicks Register Button")
    public void user_clicks_register_button() {
        signUpPage.clickRegisterButton();
    }

    @Then("registration success message is displayed")
    public void registration_success_message_is_displayed() {
        signUpPage.verifyRegistrationSuccess();
    }
}
