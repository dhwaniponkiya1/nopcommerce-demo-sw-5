package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ComputerPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Computers']")
    WebElement computerHeadingMsg;

    @CacheLookup
    @FindBy(xpath = "//a[@title='Show products in category Desktops'][normalize-space()='Desktops']")
    WebElement deskTopLink;

    @CacheLookup
    @FindBy(xpath = "//a[@title='Show products in category Notebooks'][normalize-space()='Notebooks']")
    WebElement notebooksLink;

    @CacheLookup
    @FindBy(xpath = "//a[@title='Show products in category Software'][normalize-space()='Software']")
    WebElement softwareLink;


    public String getComputerHeading() {
        Reporter.log("Getting computer heading " + computerHeadingMsg.toString());
        CustomListeners.test.log(Status.PASS, "Getting computer heading " + computerHeadingMsg.toString());
        return getTextFromElement(computerHeadingMsg);
    }

    public void clickOnDesktopLink() {
        Reporter.log("CLicking on desktop link " + deskTopLink.toString());
        CustomListeners.test.log(Status.PASS, "CLicking on desktop link " + deskTopLink.toString());
        clickOnElement(deskTopLink);
    }

    public void clickOnNotebooksLink() {
        Reporter.log("Clicking on notebooks link " + notebooksLink.toString());
        CustomListeners.test.log(Status.PASS, "Clicking on notebooks link " + notebooksLink.toString());
        clickOnElement(notebooksLink);
    }

    public void clickOnSoftwareLink() {
        Reporter.log("Clicking on software link " + softwareLink.toString());
        CustomListeners.test.log(Status.PASS, "Clicking on software link " + softwareLink.toString());
        clickOnElement(softwareLink);
    }


}
