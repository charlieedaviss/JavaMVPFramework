package pages;

import com.github.javafaker.Faker;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.DriverUtilities;

import java.awt.print.PageFormat;

public class BasePage {
    WebDriver driver = DriverUtilities.getDriver();
    static Faker faker = new Faker();
    // This is the BasePage Constructor below
    public BasePage(){
        //The page factory class essentially makes Page Object Model easy and worthwhile to implement.
        //It will dynamically initialize the WebElements on the page
        //The .initElements() method is used to initialize the elements and we need to pass the driver and the object
        //page that we want to initialize the elements on.
        PageFactory.initElements(driver, this);
    }

    public void verifyUserIsOnPage(String url){
        Assert.assertTrue("User is not on the correct page", driver.getCurrentUrl().contains(url));
    }
}
