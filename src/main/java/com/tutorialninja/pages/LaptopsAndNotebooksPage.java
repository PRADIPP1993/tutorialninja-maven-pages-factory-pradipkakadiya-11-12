package com.tutorialninja.pages;


import com.tutorialninja.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Jay Vaghani
 */
public class LaptopsAndNotebooksPage extends Utility {
    //By productmacbook = By.xpath("//a[text()='MacBook']");

    @CacheLookup
    @FindBy(xpath = "//a[text()='MacBook']")
    WebElement productmacbook;
  //  By Verifymacbook1 = By.xpath("//h1[contains(text(),'MacBook')]");
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'MacBook')]")
    WebElement Verifymacbook1;
   // By clickaddtocart = By.id("button-cart");

    @CacheLookup
    @FindBy(id = "button-cart")
    WebElement clickaddtocart;
    //By Verify1Text = By.xpath("//div[@class='alert alert-success alert-dismissible']");
    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    WebElement Verify1Text;
   // By ShoppingCard = By.xpath("//a[contains(text(),'shopping cart')]");

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'shopping cart')]")
    WebElement ShoppingCard;
    //By Verify2Text = By.xpath("//a[contains(text(),'Shopping Cart')]");
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Shopping Cart')]")
    WebElement Verify2Text;
   // By VerifyLeptop = By.linkText("MacBook");
    @CacheLookup
    @FindBy(linkText = "MacBook")
    WebElement VerifyLeptop;
    //By clearqua = By.xpath("//tbody/tr[1]/td[4]/div[1]/input[1]");
    @CacheLookup
    @FindBy(xpath = "//tbody/tr[1]/td[4]/div[1]/input[1]")
    WebElement clearqua;
   // By upadta = By.xpath("//tbody/tr[1]/td[4]/div[1]/span[1]/button[1]");

    @CacheLookup
    @FindBy(xpath = "//tbody/tr[1]/td[4]/div[1]/span[1]/button[1]")
    WebElement upadta;
   // By Verify3Text = By.xpath("//div[@class='alert alert-success alert-dismissible']");
    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    WebElement Verify3Text;
  //  By ProductPrice = By.xpath("//tbody/tr[1]/td[6]");
    @CacheLookup
    @FindBy(xpath = "//tbody/tr[1]/td[6]")
    WebElement  ProductPrice;
   // By clickproduct = By.xpath("//a[contains(text(),'Checkout')]");
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Checkout')]")
    WebElement  clickproduct;
    //By verifycheckout = By.xpath("//h1[contains(text(),'Checkout')]");
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Checkout')]")
    WebElement  verifycheckout;
   // By verfiynewcustomer1 = By.xpath("//h2[contains(text(),'New Customer')]");

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'New Customer')]")
    WebElement  verfiynewcustomer1;
   // By clickguest = By.xpath("//input[@value='guest']");
    @CacheLookup
    @FindBy(xpath = "//input[@value='guest']")
    WebElement  clickguest;
   // By clickbutton = By.xpath("//input[@id='button-account']");

    @CacheLookup
    @FindBy(xpath = "//input[@id='button-account']")
    WebElement  clickbutton;
   // By clickbutton1 = By.id("button-guest");
    @CacheLookup
    @FindBy(id = "button-guest]")
    WebElement   clickbutton1;

    //2.3 Select Sort By "Price (High > Low)"
    public void priceHigtToLow() {
        List<WebElement> products = driver.findElements(By.xpath("//p[@class ='price']"));
        List<Double> originalProductsPrice = new ArrayList<>();
        for (WebElement e : products) {
            System.out.println(e.getText());
            String[] arr = e.getText().split("Ex Tax:");
            originalProductsPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",", "")));
        }
        System.out.println(originalProductsPrice);
        // Sort By Reverse order
        Collections.sort(originalProductsPrice, Collections.reverseOrder());
        System.out.println(originalProductsPrice);
    }

    //1.4 Verify the Product price will arrange in High to Low order.
    public void PriceHighToLow1() {
        selectByVisibleTextFromDropDown(By.id("input-sort"), "Price (High > Low)");
    }

    public void priceHighToLowVerifty() {
        List<WebElement> products = driver.findElements(By.xpath("//p[@class ='price']"));
        ArrayList<Double> afterSortByPrice = new ArrayList<>();
        for (WebElement e : products) {
            String[] arr = e.getText().split("Ex Tax:");
            afterSortByPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",", "")));
        }
        System.out.println(afterSortByPrice);

    }

    //2.4 Select Product “MacBook”
    public void selectproduct() {
        clickOnElement(productmacbook);
    }

    public void clickcheckout() {
        clickOnElement(clickproduct);
    }

    //2.5 Verify the text “MacBook”
    public String verifymacbook() {
        return getTextFromElement(Verifymacbook1);

    }

    //2.6 Click on ‘Add To Cart’ button
    public void clickAddToCart() {
        clickOnElement(clickaddtocart);
    }

    //2.7 Verify the message “Success: You have added MacBook to your shopping cart!”
    public String getText1() {
        return getTextFromElement(Verify1Text);
    }

    //2.8 Click on link “shopping cart” display into success message
    public void clickOnShoppingCard() {
        clickOnElement(ShoppingCard);
    }

    //2.9 Verify the text "Shopping Cart"
    public String getText2() {
        return getTextFromElement(Verify2Text);
    }

    //2.10 Verify the Product name "MacBook"
    public String VerifyLeptopHP() {
        return getTextFromElement(VerifyLeptop);
    }

    //2.11 Change Quantity "2" old quantity clear
    public void ClearOnQuantity() {
        ClearOnElement(clearqua);
    }

    //2.11 Change Quantity "2" old quantity clear
    public void AddQuantity() {
        sendTextToElement(By.xpath("//tbody/tr[1]/td[4]/div[1]/input[1]"), "2");
    }

    //2.12 Click on “Update” Tab
    public void updatabuttonclick() {
        clickOnElement(upadta);
    }

    //2.13 Verify the message “Success: You have modified your shopping cart!”
    public String getText3() {
        return getTextFromElement(Verify3Text);

    }

    //2.14 Verify the Total £737.45
    public String VerifyProductPrice() {
        return getTextFromElement(ProductPrice);
    }

    //2.15 Click on “Checkout” button
//2.16 Verify the text “Checkout”
    public String Verifytextcheckout() {
        return getTextFromElement(verifycheckout);
    }

    //2.17 Verify the Text “New Customer”
    public String Verifytextnewcustomer1() {
        return getTextFromElement(verfiynewcustomer1);
    }

    //2.18 Click on “Guest Checkout” radio button
    public void clickguestCheckout() {
        clickOnElement(clickguest);
    }

    //2.19 Click on “Continue” tab
    public void clickaccoutbutton() {
        clickOnElement(clickbutton);

    }

    //2.20 Fill the mandatory fields
    public void mandatoryfields() {
        sendTextToElement(By.id("input-payment-firstname"), "pradip");
        sendTextToElement(By.id("input-payment-lastname"), "patel");
        sendTextToElement(By.id("input-payment-email"), "prpradipraidpp@gmail.com");
        sendTextToElement(By.id("input-payment-telephone"), "8653502411");
        sendTextToElement(By.id("input-payment-address-1"), "puna");
        sendTextToElement(By.id("input-payment-city"), "London");
        sendTextToElement(By.id("input-payment-postcode"), "HA8 5QL");
        selectByVisibleTextFromDropDown(By.id("input-payment-country"), "Armenia");
        selectByVisibleTextFromDropDown(By.id("input-payment-zone"), "Kotayk'");

    }


    public void clickaccoutbutton1() {
        Reporter.log("click accout button" + clickbutton1.toString());
        clickOnElement(clickbutton1);
    }


    public void clickaccoutbutton2() {
        Reporter.log("click accout button agree");
        clickOnElement(By.name("agree"));
    }


    public String paymentreq() {
        Reporter.log("paymentreq");
        return getTextFromElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
    }


    public void clickaccoutbutton3() {
        Reporter.log("click accout button payment method");
        clickOnElement(By.id("button-payment-method"));
    }


    public void commentmMass() {
        Reporter.log("comment Mass");
        sendTextToElement(By.name("comment"), "Please consider my order ASAP");
    }
}