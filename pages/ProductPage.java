package pages;  // Package containing page classes that follow Page Object Model

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class ProductPage {

    AndroidDriver driver;  // Driver reference used to perform actions on product screen

    public ProductPage(AndroidDriver driver) {
        // Constructor used to link driver with this page class
        this.driver = driver;
    }

    // Locators used to identify first product and Add to Cart button
    By firstProduct = AppiumBy.androidUIAutomator(
            "new UiSelector().className(\"android.widget.FrameLayout\").instance(0)"
    );

    By addToCartBtn = AppiumBy.androidUIAutomator(
            "new UiSelector().textContains(\"Add\")"
    );

    public void selectFirstProduct() {

        // Waiting for product list to load and selecting the first product
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        wait.until(ExpectedConditions.elementToBeClickable(firstProduct)).click();
    }

    public void addToCart() {

        // Waiting for Add to Cart button and adding product to cart
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        wait.until(ExpectedConditions.elementToBeClickable(addToCartBtn)).click();
    }
}
