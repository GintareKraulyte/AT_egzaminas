package tests;

import org.testng.annotations.Test;
import pages.LoginPage;
import pages.VisibilityPage;

/**
 * Testuojamas https://demo.opencart.com/
 * MyAccount login.
 */

public class LoginTest extends BaseTest {

    @Test
    public void Login(){

        LoginPage loginPage = new LoginPage(driver);
        VisibilityPage visibilityPage = new VisibilityPage(driver);

        loginPage.openMyAccountLink();

        loginPage.loginToMyAccount();

        visibilityPage.newCustomerBlock();

        visibilityPage.returningCustomerBlock();

        visibilityPage.showingError();
    }
}
