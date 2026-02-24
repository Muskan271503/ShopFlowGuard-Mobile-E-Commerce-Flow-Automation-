package pages;  // Package containing page classes following Page Object Model

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class CartPage {

    AndroidDriver driver;  // Driver reference used to interact with the mobile app

    public CartPage(AndroidDriver driver) {
        // Constructor used to link driver with this page class
        this.driver = driver;
    }

    // Locators used to identify cart icon and total price on Cart screen
    By cartIcon = By.xpath("//*[contains(@text,'Cart')]");
    By totalPrice = By.xpath("//*[contains(@text,'₹')]");

    public void openCart() {

        // Using explicit wait to ensure cart icon is clickable before opening cart
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        wait.until(ExpectedConditions.elementToBeClickable(cartIcon)).click();
    }

    public String getTotalPrice() {

        // Fetching total price displayed in cart after waiting for visibility
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        return wait.until(ExpectedConditions.visibilityOfElementLocated(totalPrice)).getText();
    }
}
