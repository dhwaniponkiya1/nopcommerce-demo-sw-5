package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage extends Utility {

    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;

    @CacheLookup
    @FindBy(id = "Password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeText;

    @CacheLookup
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement errorMessage;

    public void enterEmailId(String email) {
        sendTextToElement(emailField, email);
        Reporter.log("Enter EmailId " + email);
        CustomListeners.test.log(Status.PASS, "Enter EmailId " + email);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
        Reporter.log("Enter Password " + password);
        CustomListeners.test.log(Status.PASS, "Enter Password " + password);
    }

    public void loginToApp(String email, String pwd) {
        enterEmailId(email);
        enterPassword(pwd);
        clickOnLoginButton();
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
        Reporter.log("Click on login " + loginButton.toString());
        CustomListeners.test.log(Status.PASS, "Click on login " + loginButton.toString());
    }

    public String getErrorMessage() {
        String message = getTextFromElement(errorMessage);
        Reporter.log("Get error message " + errorMessage.toString());
        CustomListeners.test.log(Status.PASS, "Get error message");
        return message;
    }

    public String getWelcomeText() {
        String message = getTextFromElement(welcomeText);
        Reporter.log("Get welcome message " + welcomeText.toString());
        CustomListeners.test.log(Status.PASS, "Get welcome message");
        return message;
    }


}
