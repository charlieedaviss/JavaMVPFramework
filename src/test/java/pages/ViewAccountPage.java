package pages;

import org.junit.Assert;
import utilities.DatabaseUtils;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ViewAccountPage extends BasePage {


    public String getAccountId(){
     return  driver.getCurrentUrl().substring(driver.getCurrentUrl().lastIndexOf('=')+1);//= is inclusive


    }
    public void verifyAccountPage() {
    }

    public void verifyTransactionHistor() {
    }

    public void verifyDetailsIntoDatabase() {

        ResultSet accNumResultSet =  DatabaseUtils.executeQuery("Select*from account where id = " + getAccountId()+ ";");
        try {
            accNumResultSet.next();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            Assert.assertNotNull("no match inforamtion was found in database ",accNumResultSet.getObject("id"));
        } catch (Exception e) {
          e.printStackTrace();
        }
    }


}
