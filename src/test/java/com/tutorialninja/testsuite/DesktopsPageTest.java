package com.tutorialninja.testsuite;


import com.tutorialninja.customlisteners.CustomListeners;
import com.tutorialninja.pages.DesktopPage;
import com.tutorialninja.pages.HomePage;
import com.tutorialninja.pages.ProductPage;
import com.tutorialninja.pages.ShoppingCartPage;
import com.tutorialninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class DesktopsPageTest extends BaseTest {
    HomePage homePage;
    DesktopPage desktopPage;
    ProductPage productPage;

    ShoppingCartPage cartPage;

    @BeforeMethod(alwaysRun = true)
    public void InIt() {
        homePage = new HomePage();
        desktopPage = new DesktopPage();
        productPage = new ProductPage();
        cartPage = new ShoppingCartPage();
    }

    @Test(groups = {"sanity","regression"})
    public void verifyProductArrangeInAlphaBaticalOrder() {
        homePage.clickOnDesktops();
        homePage.clickShowAlldeshktops();
        desktopPage.productname();
        desktopPage.NameZToA("Name (Z - A)");
        desktopPage.productnameZtoA();
    }

    @Test(groups = {"smoke","regression"})
    public void verifyProductAddedToShoppingCartSuccessFully() {
        homePage.clickOnDesktops();
        homePage.clickShowAlldeshktops();
        desktopPage.productname();
        homePage.£price();
        desktopPage.NameAToZ();
        desktopPage.Selectproduct();
        Assert.assertEquals(desktopPage.getproductname(), "HP LP3065", "Verify the Product");
        desktopPage.clicklaptop();
        desktopPage.selectdate();
        desktopPage.AddtoCardproduct();
        String expectedText1 = "Success: You have added HP LP3065 to your shopping cart!\n" +
                "×";
        Assert.assertEquals(desktopPage.getText1(), expectedText1, "Product not added to cart");
        desktopPage.clickOnShoppingCard();
        Assert.assertEquals(desktopPage.getText2(), "Shopping Cart", "Verify the Text");
        Assert.assertEquals(desktopPage.VerifyLeptopHP(), "HP LP3065", "Verify the Text");
        Assert.assertEquals(desktopPage.VerifyDeliveryDate(), "Delivery Date: 2023-11-30", "Verify the Text");
        Assert.assertEquals(desktopPage.VerifyModelName(), "Product 21", "Verify the Text");
        Assert.assertEquals(desktopPage.VerifyProductPrice(), "£74.73", "Verify the product Price");

    }
}



