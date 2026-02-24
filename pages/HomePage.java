package pages;  // Package that contains all page classes following Page Object Model

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class HomePage {

    AndroidDriver driver;  // Driver reference used to perform actions on mobile app

    public HomePage(AndroidDriver driver) {
        // Constructor used to pass driver hookup the driver with this page class
        this.driver = driver;
    }

    // Locators used to identify search bar and search input field on Home Screen
    By searchBar = AppiumBy.androidUIAutomator(
            "new UiSelector().textContains(\"Search\")"
    );

    By searchInput = By.className("android.widget.EditText");

    public void searchProduct(String product) {

        // Using explicit wait to ensure elements are ready before interaction
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        // Clicking search bar and entering product name
        wait.until(ExpectedConditions.elementToBeClickable(searchBar)).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(searchInput))
                .sendKeys(product);

        // Triggering search action from mobile keyboard
        driver.executeScript("mobile: performEditorAction",
                java.util.Map.of("action", "search"));
    }
}
