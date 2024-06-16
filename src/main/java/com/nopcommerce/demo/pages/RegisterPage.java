package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class RegisterPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Register']")
    WebElement registerHeading;

    @CacheLookup
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement registerButton;

    @CacheLookup
    @FindBy(id = "FirstName-error")
    WebElement firstNameError;

    @CacheLookup
    @FindBy(id = "LastName-error")
    WebElement lastNameError;

    @CacheLookup
    @FindBy(id = "Email-error")
    WebElement emailError;

    @CacheLookup
    @FindBy(id = "ConfirmPassword-error")
    WebElement confirmPasswordError;

    @CacheLookup
    @FindBy(id = "gender-male")
    WebElement maleRadio;

    @CacheLookup
    @FindBy(id = "gender-female")
    WebElement femaleRadio;

    @CacheLookup
    @FindBy(id = "FirstName")
    WebElement firstNameField;

    @CacheLookup
    @FindBy(id = "LastName")
    WebElement lastNameField;

    @CacheLookup
    @FindBy(name = "DateOfBirthDay")
    WebElement dateDropdown;

    @CacheLookup
    @FindBy(name = "DateOfBirthMonth")
    WebElement monthDropdown;

    @CacheLookup
    @FindBy(name = "DateOfBirthYear")
    WebElement yearDropdown;

    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;

    @CacheLookup
    @FindBy(id = "Password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(id = "ConfirmPassword")
    WebElement confirmPasswordField;

    @CacheLookup
    @FindBy(className = "result")
    WebElement registrationSuccessMsg;


    public String getRegisterHeading() {
        Reporter.log("Get registration heading " + registerHeading.toString());
        CustomListeners.test.log(Status.PASS, "Get registration heading " + registerHeading.toString());
        return getTextFromElement(registerHeading);
    }

    public void clickOnRegisterButton() {
        clickOnElement(registerButton);
        Reporter.log("Click on registration button " + registerButton.toString());
        CustomListeners.test.log(Status.PASS, "Click on registration button " + registerButton.toString());
    }

    public String getFirstNameError() {
        Reporter.log("Get First Name Error " + firstNameError.toString());
        CustomListeners.test.log(Status.PASS, "Get First Name Error " + firstNameError.toString());
        return getTextFromElement(firstNameError);
    }

    public String getLastNameError() {
        Reporter.log("Get Last Name Error " + lastNameError.toString());
        CustomListeners.test.log(Status.PASS, "Get Last Name Error " + lastNameError.toString());
        return getTextFromElement(lastNameError);
    }

    public String getEmailError() {
        Reporter.log("Get email error " + emailError.toString());
        CustomListeners.test.log(Status.PASS, "Get email error  " + emailError.toString());
        return getTextFromElement(emailError);
    }

    public String getConfirmPasswordError() {
        Reporter.log("Get confirm password error " + confirmPasswordError.toString());
        CustomListeners.test.log(Status.PASS, "Get confirm password error " + confirmPasswordError.toString());

        return getTextFromElement(confirmPasswordError);
    }

    public void clickOnMaleRadio() {
        clickOnElement(maleRadio);
        Reporter.log("Click on male radio button " + maleRadio.toString());
        CustomListeners.test.log(Status.PASS, "Click on male radio button " + maleRadio.toString());
    }

    public void clickOnFemaleRadio() {
        clickOnElement(femaleRadio);
        Reporter.log("Click on female radio button " + femaleRadio.toString());
        CustomListeners.test.log(Status.PASS, "Click on female radio button " + femaleRadio.toString());
    }

    public void enterFirstName(String fName) {
        sendTextToElement(firstNameField, fName);
        Reporter.log("Enter first name " + fName);
        CustomListeners.test.log(Status.PASS, "Enter first name " + fName);
    }

    public void enterLastName(String lName) {
        sendTextToElement(lastNameField, lName);
        Reporter.log("Enter last name " + lName);
        CustomListeners.test.log(Status.PASS, "Enter last name " + lName);
    }

    public void selectValueFromDateDropdown(String date) {
        selectByValueFromDropDown(dateDropdown, "15");
        Reporter.log("Select date from dropdown " + dateDropdown.toString());
        CustomListeners.test.log(Status.PASS, "Select date from dropdown " + date);
    }

    public void selectValueFromMonthDropdown(String month) {
        selectByValueFromDropDown(monthDropdown, "4");
        Reporter.log("Select month from dropdown " + month);
        CustomListeners.test.log(Status.PASS, "Select month from dropdown " + month);
    }

    public void selectValueFromYearDropdown(String year) {
        selectByValueFromDropDown(yearDropdown, "2001");
        Reporter.log("Select year from dropdown " + year);
        CustomListeners.test.log(Status.PASS, "Select year from dropdown " + year);
    }

    public void enterEmail(String email) {
        sendTextToElement(emailField, email);
        Reporter.log("Enter email " + email);
        CustomListeners.test.log(Status.PASS, "Enter email " + email);
    }

    public void enterPassword(String pwd) {
        sendTextToElement(passwordField, pwd);
        Reporter.log("Enter password " + pwd);
        CustomListeners.test.log(Status.PASS, "Enter password " + pwd);
    }

    public void enterConfirmPassword(String cpwd) {
        sendTextToElement(confirmPasswordField, cpwd);
        Reporter.log("Enter confirm password " + cpwd);
        CustomListeners.test.log(Status.PASS, "Enter confirm password " + cpwd);
    }

    public void registerToApp(String gender, String fName, String lName, String date, String month, String year, String email, String pwd, String cpwd) {
        if (gender.equalsIgnoreCase("female"))
            clickOnFemaleRadio();
        else
            clickOnMaleRadio();
        enterFirstName(fName);
        enterLastName(lName);
        selectValueFromDateDropdown(date);
        selectValueFromMonthDropdown(month);
        selectValueFromYearDropdown(year);
        enterEmail(email);
        enterPassword(pwd);
        enterConfirmPassword(cpwd);
        clickOnRegisterButton();
    }

    public String getRegistrationSuccessMsg() {
        Reporter.log("Get reg success msg " + registerButton.toString());
        CustomListeners.test.log(Status.PASS, "Click on registration button " + registerButton.toString());
        return getTextFromElement(registrationSuccessMsg);
    }

}
