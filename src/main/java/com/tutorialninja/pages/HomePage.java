package com.tutorialninja.pages;

import com.aventstack.extentreports.Status;
import com.tutorialninja.customlisteners.CustomListeners;
import com.tutorialninja.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import org.testng.annotations.Listeners;

import java.util.List;

@Listeners(CustomListeners.class)
public class HomePage extends Utility {

    @CacheLookup
    @FindBy(linkText = "Desktops")
    WebElement desktoclick;

    @CacheLookup
    @FindBy(linkText = "Show All Desktops")
    WebElement showalldesktops;



    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Desktops')]")
    WebElement verifytext;


    @CacheLookup
    @FindBy(linkText = "Laptops & Notebooks")
    WebElement LaptopsNotebooksclick;


    @CacheLookup
    @FindBy(linkText = "Show All Laptops & Notebooks")
    WebElement showallLaptopsNotebooks;



    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Laptops & Notebooks')]")
    WebElement verifytext1;


    @CacheLookup
    @FindBy(linkText = "Components")
    WebElement Componentsclick;


    @CacheLookup
    @FindBy(linkText = "Show All Components")
    WebElement showallComponents;



    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Components')]")
    WebElement verifytext2;

    @CacheLookup
    @FindBy(linkText="Show All Desktops")
    WebElement clickShowAlldeshktops1;



    public void clickOnDesktops() {
        Reporter.log("clickOn Desktops" + desktoclick.toString());
        clickOnElement(desktoclick);
        CustomListeners.test.log(Status.PASS, "clickOn Desktops");

    }

    public void clickShowAlldeshktops(){
        Reporter.log("click Show All deshktops" + clickShowAlldeshktops1.toString());
        clickOnElement(clickShowAlldeshktops1);
        CustomListeners.test.log(Status.PASS, "click Show All deshktops");
    }
    public void clickOnShowAllDesktops() {
        Reporter.log("click On Show All Desktops" + showalldesktops.toString());
        clickOnElement(showalldesktops);
        CustomListeners.test.log(Status.PASS, "click On Show All Desktops");
    }

    public String VerifyText() {
        Reporter.log("Verify Text" + verifytext.toString());
        return getTextFromElement(verifytext);

    }


    public void mouseHoverOnlaptop1() {
        Reporter.log("mouse Hover On laptop " + LaptopsNotebooksclick.toString());
        clickOnElement(LaptopsNotebooksclick);
        CustomListeners.test.log(Status.PASS, "mouse Hover On laptop ");
    }


    public void clickOnShowAlllaptop1() {
        Reporter.log("click On Show All laptop " + showallLaptopsNotebooks.toString());
        clickOnElement(showallLaptopsNotebooks);
        CustomListeners.test.log(Status.PASS, "click On Show All laptop ");
    }

    public void clickOnShowAllComponents() {
        Reporter.log("click On Show All Components " + showallComponents.toString());
        clickOnElement(showallComponents);
        CustomListeners.test.log(Status.PASS, "click On Show All Components");
    }

    public String VerifyText1() {
        Reporter.log("Verify Text " + verifytext1.toString());
        return getTextFromElement(verifytext1);
    }

    public void mouseHoverOnComponents() {
        Reporter.log("mouseHover On Components " + Componentsclick.toString());
        clickOnElement(Componentsclick);
        CustomListeners.test.log(Status.PASS, "mouseHover On Components ");
    }

    public void mouseHoverOnComponents1() {
        clickOnElement(By.xpath("//a[contains(text(),'Show All Desktops')]"));

    }

    public String VerifyText2() {
        Reporter.log("VerifyText " + verifytext2.toString());
        return getTextFromElement(verifytext2);
    }

    public void £price() {
        Reporter.log(" £ price select");
        clickOnElement(By.xpath("//span[contains(text(),'Currency')]"));
        List<WebElement> currencyList = driver.findElements(By.xpath("//ul[@class = 'dropdown-menu']/li"));
        for (WebElement e : currencyList) {
            if (e.getText().equalsIgnoreCase("£ Pound Sterling")) {
                e.click();
                break;
            }
        }
    }

}
