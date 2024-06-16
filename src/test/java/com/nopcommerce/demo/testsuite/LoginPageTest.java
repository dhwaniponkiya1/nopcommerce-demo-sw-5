package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import resources.testdata.TestData;

public class LoginPageTest extends BaseTest {
    LoginPage loginPage;
    HomePage homePage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        loginPage = new LoginPage();
        homePage = new HomePage();
    }

    @Test(groups = {"sanity", "smoke", "regression"})
    public void userShouldNavigateToLoginPageSuccessFully() {
        homePage.clickOnLoginLink();
        String expMsg = "Welcome, Please Sign In!";
        String actMsg = loginPage.getWelcomeText();
        Assert.assertEquals(actMsg, expMsg, "Login page not displayed");
    }

    @Test(groups = {"smoke", "regression"}, dataProvider = "invalidCredentials", dataProviderClass = TestData.class)
    public void verifyTheErrorMessageWithInValidCredentials(String email, String pwd) {
        homePage.clickOnLoginLink();
        loginPage.loginToApp(email, pwd);
        String expMsg = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        String actMsg = loginPage.getErrorMessage();
        Assert.assertEquals(actMsg, expMsg);
    }

    @Test(groups = {"regression"}, dataProvider = "validCredentials", dataProviderClass = TestData.class)
    public void verifyThatUserShouldLogInSuccessFullyWithValidCredentials(String email, String pwd){
        homePage.clickOnLoginLink();
        loginPage.loginToApp(email, pwd);
        String expMsg = "Log out";
        String actMsg = homePage.getLogoutLinkText();
        Assert.assertEquals(actMsg, expMsg);
    }

    /*@Test(groups = {"regression"}, dataProvider = "validCredentials", dataProviderClass = TestData.class)
    public void verifyThatUserShouldLogOutSuccessFully(String email, String pwd) {
        homePage.clickOnLoginLink();
        loginPage.loginToApp(email, pwd);
        homePage.clickOnLogoutLink();
        String expMsg = "Log in";
        String actMsg = homePage.getLoginLinkText();
        Assert.assertEquals(actMsg, expMsg);
    }*/


}
