package com.tutorialninja.testsuite;


import com.tutorialninja.customlisteners.CustomListeners;
import com.tutorialninja.pages.MyAccountPage;
import com.tutorialninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class MyAccountTest extends BaseTest {


    MyAccountPage accountPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        accountPage = new MyAccountPage();


    }

    @Test(groups = {"sanity","regression"})
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() {
        accountPage.clickOnMyAccount1();
        accountPage.clikcOnRegister();
        Assert.assertEquals(accountPage.verifyTextRegisterAccount(),"Register Account","Error message not displayed");

    }
    @Test(groups = {"smoke","regression"})
    public void  verifyUserShouldNavigateToLoginPageSuccessfully(){
        accountPage.clickOnMyAccount1();
        accountPage.clikOnLoginButton();
        Assert.assertEquals(accountPage.verifyTextReturningCustomer(),"Returning Customer","Error message not displayed");
    }
    @Test(groups = {"regression"})
    public void verifyThatUserRegisterAccountSuccessfully(){
        accountPage.clickOnMyAccount1();
        accountPage.clikcOnRegister();
        accountPage.EnterYourFirstName();
        accountPage.EnterYourLastName();
        accountPage.EnterYourEmailId();
        accountPage.EnterYourTelephoneNumber();
        accountPage.EnterYourPassword();
        accountPage.EnterYourConfirmPassword();
        accountPage.clikOnYesRadioButton();
        accountPage.clickOnPrivacyPolicy();
        accountPage.clickOnButtonContine();
        Assert.assertEquals(accountPage.verifyYourAccountCreatedText(),"Your Account Has Been Created!","Error message not displayed");
        accountPage.clickTheButtonContine3();
        accountPage.clickOnMyAccountLink();
        accountPage.clickOnLogout();
        Assert.assertEquals(accountPage.verifyAccountLogoutText(),"Account Logout","Error message not displayed");
        accountPage.clickOnContinueButton4();

    }
    @Test(groups = {"regression"})
    public void verifyThatUserShouldLoginAndLogoutSuccessfully(){
        accountPage.clickOnMyAccount1();
        accountPage.clikOnLoginButton();
        accountPage.clearemailAddress();
        accountPage.enterYourRegisterPassword();
        accountPage.clickOnAccountLoginButton();
        Assert.assertEquals(accountPage.verifyMyaccountText1(),"My Account","Error message not displayed");
        accountPage.clickOnMyAccountLink1();
        accountPage.clickOnParameterLogout();
        Assert.assertEquals(accountPage.verifyMyaccountLogoutText1(),"Account Logout","Error message not displayed");
        accountPage.clickOnContinueButtonInEnd();
    }

}
