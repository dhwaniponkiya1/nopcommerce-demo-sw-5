package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.List;

public class HomePage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Register']")
    WebElement registerLink;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Log in']")
    WebElement loginLink;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Log out']")
    WebElement logoutLink;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li")
    List<WebElement> topMenu;

    public void clickOnRegisterLink() {
        clickOnElement(registerLink);
    }

    public void clickOnLoginLink() {
        clickOnElement(loginLink);
        Reporter.log("Click on loginButton " + loginLink.toString());
        CustomListeners.test.log(Status.PASS, "Click on loginButton");
    }

    public String getLoginLinkText() {
        Reporter.log("Get login link text " + loginLink.toString());
        CustomListeners.test.log(Status.PASS, "Get login link text " + loginLink.toString());

        System.out.println("-----text login link" + getTextFromElement(loginLink));
        return getTextFromElement(loginLink);
    }

    public void clickOnLogoutLink() {
        Reporter.log("Click on logout link " + logoutLink.toString());
        CustomListeners.test.log(Status.PASS, "Click on logout link " + logoutLink.toString());
        clickOnElement(logoutLink);
    }

    public String getLogoutLinkText() {
        Reporter.log("Get logout link text " + logoutLink.toString());
        CustomListeners.test.log(Status.PASS, "Get logout link text " + logoutLink.toString());
        return getTextFromElement(logoutLink);
    }

    public void selectMenu(String menu) {
        List<WebElement> topMenuElements = topMenu;

        for (WebElement e : topMenuElements) {
            if (e.getText().equalsIgnoreCase(menu)) {
                e.click();
                break;
            }
        }
    }

}
