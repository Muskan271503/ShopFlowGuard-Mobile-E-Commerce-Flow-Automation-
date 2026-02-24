package tests;  // Package containing test classes

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import utils.ScreenshotUtil;

public class E2EOrderTest extends BaseTest {

    @Test
    public void orderFlowTest() throws InterruptedException {

        // Initializing all page objects to perform actions using Page Object Model
        HomePage home = new HomePage(driver);
        ProductPage product = new ProductPage(driver);
        CartPage cart = new CartPage(driver);
        CheckoutPage checkout = new CheckoutPage(driver);

        // Capturing screenshot of application home screen
        ScreenshotUtil.capture(driver, "01_HomeScreen");

        // Searching for a product in the application
        home.searchProduct("kurti");
        Thread.sleep(6000);
        ScreenshotUtil.capture(driver, "02_SearchResults");

        // Selecting a product and adding it to cart
        product.selectFirstProduct();
        Thread.sleep(4000);
        ScreenshotUtil.capture(driver, "03_ProductOpened");

        product.addToCart();
        Thread.sleep(4000);
        ScreenshotUtil.capture(driver, "04_AddToCart");

        // Opening cart and verifying total price
        cart.openCart();
        Thread.sleep(4000);
        ScreenshotUtil.capture(driver, "05_CartPage");

        String price = cart.getTotalPrice();
        System.out.println("Total Price: " + price);

        // Validating that price is displayed correctly
        Assert.assertTrue(price.contains("₹"));

        // Proceeding to checkout page
        checkout.proceedToCheckout();
        Thread.sleep(4000);
        ScreenshotUtil.capture(driver, "06_CheckoutPage");
    }
}
