package com.tutorialninja.pages;


import com.aventstack.extentreports.Status;
import com.tutorialninja.customlisteners.CustomListeners;
import com.tutorialninja.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

/**
 * Created by Jay Vaghani
 */
public class MyAccountPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'My Account')]")
    WebElement myAccount;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Register')]")
    WebElement register;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register Account')]")
    WebElement registerText;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Login')]")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Returning Customer')]")
    WebElement returningCustomerText;

    @CacheLookup
    @FindBy(id = "input-firstname")
    WebElement firstNameRegister;

    @CacheLookup
    @FindBy(id = "input-lastname")
    WebElement lastNameRegister;
    // By emailIdRegister = By.id("input-email");
    @CacheLookup
    @FindBy(id = "input-email")
    WebElement emailIdRegister;

    //By telephoneNumberRegister = By.id("input-telephone");
    @CacheLookup
    @FindBy(id = "input-telephone")
    WebElement telephoneNumberRegister;
    // By passwordRegister = By.id("input-password");
    @CacheLookup
    @FindBy(id = "input-password")
    WebElement passwordRegister;
    //By confirmPasswordRegister = By.id("input-confirm");
    @CacheLookup
    @FindBy(id = "input-confirm")
    WebElement confirmPasswordRegister;

    //By radioButtonYes = By.xpath("//body/div[@id='account-register']/div[1]/div[1]/form[1]/fieldset[3]/div[1]/div[1]/label[1]/input[1]");
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='account-register']/div[1]/div[1]/form[1]/fieldset[3]/div[1]/div[1]/label[1]/input[1]")
    WebElement radioButtonYes;
    //By privacyPolicyChekcBox = By.xpath("//body/div[@id='account-register']/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]");

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='account-register']/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")
    WebElement privacyPolicyChekcBox;

    //By continueButtonclick = By.xpath("//body/div[@id='account-register']/div[1]/div[1]/form[1]/div[1]/div[1]/input[2]");
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='account-register']/div[1]/div[1]/form[1]/div[1]/div[1]/input[2]")
    WebElement continueButtonclick;

    //By accontCreatedText = By.xpath("//h1[contains(text(),'Your Account Has Been Created!')]");
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Your Account Has Been Created!')]")
    WebElement accontCreatedText;
    //By continueButton3 = By.xpath("//a[contains(text(),'Continue')]");
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continueButton3;
    //By MyAccountLink = By.xpath("//body/div[@id='account-account']/div[1]/aside[1]/div[1]/a[1]");
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='account-account']/div[1]/aside[1]/div[1]/a[1]")
    WebElement MyAccountLink;
    //By logoutButton = By.xpath("//body/div[@id='account-account']/div[1]/aside[1]/div[1]/a[13]");

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='account-account']/div[1]/aside[1]/div[1]/a[13]")
    WebElement logoutButton;
    //By accountLogoutText = By.xpath("//h1[contains(text(),'Account Logout')]");
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Account Logout')]")
    WebElement accountLogoutText;
    //By continueButton4 = By.xpath("//a[contains(text(),'Continue')]");
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continueButton4;
    // By clearEmailField = By.id("input-email");
    @CacheLookup
    @FindBy(id = "input-email")
    WebElement clearEmailField;

    // By yourPassword = By.id("input-password");
    @CacheLookup
    @FindBy(id = "input-password")
    WebElement yourPassword;
    // By loginButton16 = By.xpath("//body/div[@id='account-login']/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/input[1]");

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='account-login']/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/input[1]")
    WebElement loginButton16;
    // By myAccountText1 = By.xpath("//h2[contains(text(),'My Account')]");
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'My Account')]")
    WebElement myAccountText1;
    // By myAccountLinkClick1 = By.xpath("//body/div[@id='account-account']/div[1]/aside[1]/div[1]/a[1]");
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='account-account']/div[1]/aside[1]/div[1]/a[1]")
    WebElement myAccountLinkClick1;
    // By accountLogout1 = By.xpath("//body/div[@id='account-account']/div[1]/aside[1]/div[1]/a[13]");
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='account-account']/div[1]/aside[1]/div[1]/a[13]")
    WebElement accountLogout1;

    // By accountLogoutText1 = By.xpath("//h1[contains(text(),'Account Logout')]");
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Account Logout')]")
    WebElement accountLogoutText1;
    // By continueButtonLast = By.xpath("//a[contains(text(),'Continue')]");

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continueButtonLast;


    public void clickOnMyAccount1() {
        Reporter.log(" clickOn My Account" + myAccount.toString());
        clickOnElement(myAccount);
        CustomListeners.test.log(Status.PASS, "clickOn My Account");
    }

    public void clikcOnRegister() {
        Reporter.log(" clikcOn Register" + register.toString());
        clickOnElement(register);
        CustomListeners.test.log(Status.PASS, "clikcOn Register");
    }


    public String verifyTextRegisterAccount() {
        Reporter.log(" verify Text Register Account" + registerText.toString());
        return getTextFromElement(registerText);
    }

    public void clikOnLoginButton() {
        Reporter.log(" clikOn Login Button" + loginButton.toString());
        clickOnElement(loginButton);
        CustomListeners.test.log(Status.PASS, "clikOn Login Button");
    }


    public String verifyTextReturningCustomer() {
        Reporter.log(" verify  Text Returning Customer" + returningCustomerText.toString());
        return getTextFromElement(returningCustomerText);
    }


    public void EnterYourFirstName() {
        Reporter.log(" Enter Your First Name" + firstNameRegister.toString());
        sendTextToElement(firstNameRegister, "pradip");
        CustomListeners.test.log(Status.PASS, "Enter Your First Name");
    }


    public void EnterYourLastName() {
        Reporter.log(" Enter Your Last Name" + lastNameRegister.toString());
        sendTextToElement(lastNameRegister, "kakakdd");
        CustomListeners.test.log(Status.PASS, "Enter Your Last Name");
    }


    public void EnterYourEmailId() {
        Reporter.log(" Enter Your Email Id" + emailIdRegister.toString());
        sendTextToElement(emailIdRegister, "pradipkaka123@gmail.com");
        CustomListeners.test.log(Status.PASS, "Enter Your Email Id");
    }


    public void EnterYourTelephoneNumber() {
        Reporter.log("Enter Your Telephone Number" + telephoneNumberRegister.toString());
        sendTextToElement(telephoneNumberRegister, "0774252502");
        CustomListeners.test.log(Status.PASS, "Enter Your Telephone Number");
    }


    public void EnterYourPassword() {
        Reporter.log("Enter Your Password" + passwordRegister.toString());
        sendTextToElement(passwordRegister, "Xyz123456");
        CustomListeners.test.log(Status.PASS, "Enter Your Password");
    }


    public void EnterYourConfirmPassword() {
        Reporter.log("Enter Your Confirm Password" + confirmPasswordRegister.toString());
        sendTextToElement(confirmPasswordRegister, "Xyz123456");
        CustomListeners.test.log(Status.PASS, "Enter Your Confirm Passwordn");
    }


    public void clikOnYesRadioButton() {
        Reporter.log("clik On Yes Radio Button" + radioButtonYes.toString());
        clickOnElement(radioButtonYes);
        CustomListeners.test.log(Status.PASS, "clik On Yes Radio Button");
    }


    public void clickOnPrivacyPolicy() {
        Reporter.log("click On Privacy Policy" + privacyPolicyChekcBox.toString());
        clickOnElement(privacyPolicyChekcBox);
        CustomListeners.test.log(Status.PASS, "click On Privacy Policy");
    }

    public void clickOnButtonContine() {
        Reporter.log("click On Button Contine" + continueButtonclick.toString());
        clickOnElement(continueButtonclick);
    }


    public String verifyYourAccountCreatedText() {
        Reporter.log("verify Your Account Created Text" + accontCreatedText.toString());
        return getTextFromElement(accontCreatedText);
    }


    public void clickTheButtonContine3() {
        Reporter.log("click The Button Contine" + continueButton3.toString());
        clickOnElement(continueButton3);
    }


    public void clickOnMyAccountLink() {
        Reporter.log("click On My Account Link" + MyAccountLink.toString());
        clickOnElement(MyAccountLink);
    }


    public void clickOnLogout() {
        Reporter.log("click On Logout" + logoutButton.toString());
        clickOnElement(logoutButton);
    }


    public String verifyAccountLogoutText() {
        Reporter.log("verify Account Logout Text" + accountLogoutText.toString());
        return getTextFromElement(accountLogoutText);
    }


    public void clickOnContinueButton4() {
        Reporter.log("click On ontinue Button" + continueButton4.toString());
        clickOnElement(continueButton4);
    }

    public void clearemailAddress() {
        Reporter.log("clear email Address" + clearEmailField.toString());
        WebElement emailaddress = (clearEmailField);
        emailaddress.clear();
        emailaddress.sendKeys("pradipkaka123@gmail.com");


    }


    public void enterYourRegisterPassword() {
        Reporter.log("Enter Your Register Password" + yourPassword.toString());
        sendTextToElement(yourPassword, "Xyz123456");
    }


    public void clickOnAccountLoginButton() {
        Reporter.log("click On Account Login Button" + loginButton16.toString());
        clickOnElement(loginButton16);
    }

    public String verifyMyaccountText1() {
        Reporter.log("verify Myaccount Text" + myAccountText1.toString());
        return getTextFromElement(myAccountText1);
    }


    public void clickOnMyAccountLink1() {
        Reporter.log("click On My Account Link" + myAccountLinkClick1.toString());
        clickOnElement(myAccountLinkClick1);
    }


    public void clickOnParameterLogout() {
        Reporter.log("clickOnParameterLogout" + accountLogout1.toString());
        clickOnElement(accountLogout1);
    }


    public String verifyMyaccountLogoutText1() {
        Reporter.log("verify My account Logout Text" + accountLogoutText1.toString());
        return getTextFromElement(accountLogoutText1);
    }


    public void clickOnContinueButtonInEnd() {
        Reporter.log("click On Continue Button In End" + continueButtonLast.toString());
        clickOnElement(continueButtonLast);
    }

}
