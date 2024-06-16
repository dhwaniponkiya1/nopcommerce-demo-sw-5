package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class DesktopPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Desktops']")
    WebElement desktopHeadingMsg;

    @CacheLookup
    @FindBy(xpath = "//h2[@class='product-title']//a[normalize-space()='Build your own computer']")
    WebElement buildYourOwnCompProductLink;

    @CacheLookup
    @FindBy(id = "products-orderby")
    WebElement sortByDropdown;

    @CacheLookup
    @FindBy(xpath = "products-pagesize")
    WebElement displayDropdown;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='List']")
    WebElement listViewButton;

    public String getDesktopHeading() {
        Reporter.log("Getting desktop title " + desktopHeadingMsg.toString());
        CustomListeners.test.log(Status.PASS, "Getting desktop title " + desktopHeadingMsg.toString());
        return getTextFromElement(desktopHeadingMsg);
    }

    public void clickOnSortByDropdown(String value) {
        Reporter.log("Clicking on sort by dropdown" + value);
        CustomListeners.test.log(Status.PASS, "Clicking on sort by " + value);
        selectByVisibleTextFromDropDown(sortByDropdown, value);
    }

    public void clickOnDisplayDropdown(String value) {
        Reporter.log("Clicking on display dropdown " + value);
        CustomListeners.test.log(Status.PASS, "Clicking on display dropdown" + value);
        selectByVisibleTextFromDropDown(displayDropdown, value);
    }

    public void clickOnListViewButton() {
        Reporter.log("Clicking on list tab" + listViewButton.toString());
        CustomListeners.test.log(Status.PASS, "CLicking on list tab " + listViewButton.toString());
        clickOnElement(listViewButton);
    }

    public void clickOnBuildYourOwnCompLink(){
        clickOnElement(buildYourOwnCompProductLink);
    }



}
