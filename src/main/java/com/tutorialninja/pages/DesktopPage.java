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


public class DesktopPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'HP LP3065')]")
    WebElement VerifyProduct;



    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'HP LP3065')]")
    WebElement clickproduct;


    @CacheLookup
    @FindBy(xpath = "//button[@id='button-cart']")
    WebElement AddtoCard;


    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    WebElement Verify1Text;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'shopping cart')]")
    WebElement ShoppingCard;



    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Shopping Cart')]")
    WebElement Verify2Text;

    @CacheLookup
    @FindBy(linkText = "HP LP3065")
    WebElement VerifyLeptop;


    @CacheLookup
    @FindBy(xpath = "//small[contains(text(),'Delivery Date: 2023-11-30')]")
    WebElement VerifyDeliveryDate1;


    @CacheLookup
    @FindBy(xpath = "//td[contains(text(),'Product 21')]")
    WebElement ModelName;

    @CacheLookup
    @FindBy(xpath = "//tbody/tr[1]/td[6]")
    WebElement ProductPrice;
    @CacheLookup
    @FindBy(id = "input-sort")
    WebElement clickmastedcard;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'HP LP3065')]")
    WebElement product;



    public void productname() {
        Reporter.log("productname");
        List<WebElement> products = driver.findElements(By.xpath("//h4/a"));
        ArrayList<String> originalProductsName = new ArrayList<>();
        for (WebElement e : products) {
            originalProductsName.add(e.getText());
        }
        System.out.println(originalProductsName);
        Collections.reverse(originalProductsName);
        System.out.println(originalProductsName);
    }

    public void NameZToA(String text) {
        Reporter.log("click on mastercard type button" + clickmastedcard.toString());
        selectByVisibleTextFromDropDown(clickmastedcard, text);
    }

    public void productnameZtoA() {
        Reporter.log("productname Z to A");
        List<WebElement> products = driver.findElements(By.xpath("//h4/a"));
        ArrayList<String> afterSortByZToAProductsName = new ArrayList<>();
        for (WebElement e : products) {
            afterSortByZToAProductsName.add(e.getText());
        }

        System.out.println(afterSortByZToAProductsName);
    }


    public void NameAToZ() {
        Reporter.log("NameAToZ");
        selectByVisibleTextFromDropDown(By.id("input-sort"), "Name (A - Z)");
    }


    public void Selectproduct() {
        Reporter.log("Select product" + product.toString());
        clickOnElement(product);
    }


    public String getproductname() {
        Reporter.log("get product name" + VerifyProduct.toString());
        return getTextFromElement(VerifyProduct);
    }

    public void clicklaptop() {
        Reporter.log("click laptop" + clickproduct.toString());
        clickOnElement(clickproduct);
    }


    public void selectdate() {
        Reporter.log("select date");
        clickOnElement(By.xpath("//input[@id='input-option225']"));
        String year = "2023";
        String month = "November";
        String date = "30";
        clickOnElement(By.xpath("//div[@class = 'input-group date']//button"));
        while (true) {
            String monthAndYear = driver.findElement(By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='picker-switch']")).getText();
            String[] arr = monthAndYear.split(" ");
            String mon = arr[0];
            String yer = arr[1];
            if (mon.equalsIgnoreCase(month) && yer.equalsIgnoreCase(year)) {
                break;
            } else {
                clickOnElement(By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='next']"));
            }
        }
        List<WebElement> allDates = driver.findElements(By.xpath("//div[@class = 'datepicker']/div[1]//tbody/tr/td[@class = 'day']"));
        for (WebElement e : allDates) {
            if (e.getText().equalsIgnoreCase(date)) {
                e.click();
                break;
            }
        }
    }


    public void AddtoCardproduct() {
        Reporter.log("Add to Card product" + AddtoCard.toString());
        clickOnElement(AddtoCard);
    }


    public String getText1() {
        Reporter.log("get Text " + Verify1Text.toString());
        return getTextFromElement(Verify1Text);
    }

    public void clickOnShoppingCard() {
        Reporter.log("click On Shopping Card " + ShoppingCard.toString());
        clickOnElement(ShoppingCard);
    }


    public String getText2() {
        Reporter.log("get Text " + Verify2Text.toString());
        return getTextFromElement(Verify2Text);
    }


    public String VerifyLeptopHP() {
        Reporter.log("get Tex" + VerifyLeptop.toString());
        return getTextFromElement(VerifyLeptop);
    }


    public String VerifyDeliveryDate() {
        Reporter.log("Verify Delivery Date" + VerifyDeliveryDate1.toString());
        return getTextFromElement(VerifyDeliveryDate1);
    }


    public String VerifyModelName() {
        Reporter.log("Verify Model Name" + ModelName.toString());
        return getTextFromElement(ModelName);
    }


    public String VerifyProductPrice() {
        Reporter.log("Verify Product Price" + ProductPrice.toString());
        return getTextFromElement(ProductPrice);
    }

}
