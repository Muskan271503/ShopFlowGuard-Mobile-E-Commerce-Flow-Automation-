package pages;  // Package containing page classes for different screens

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class CheckoutPage {

    AndroidDriver driver;  // Driver reference used to perform actions on the checkout screen

    public CheckoutPage(AndroidDriver driver) {
        // Constructor used to connect this page class with driver
        this.driver = driver;
    }

    // Locator used to identify Checkout or Continue button on checkout screen
    By checkoutBtn = By.xpath("//*[contains(@text,'Checkout') or contains(@text,'Continue')]");

    public void proceedToCheckout() {

        // Waiting for checkout button to be clickable before proceeding
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        wait.until(ExpectedConditions.elementToBeClickable(checkoutBtn)).click();
    }
}
