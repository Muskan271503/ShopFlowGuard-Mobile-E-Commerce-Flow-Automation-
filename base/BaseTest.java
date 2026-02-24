package base;  // Package for base classes like driver setup

import io.appium.java_client.android.AndroidDriver;  
import io.appium.java_client.remote.MobileCapabilityType;  
import org.openqa.selenium.remote.DesiredCapabilities;  
import org.testng.annotations.AfterTest;  
import org.testng.annotations.BeforeTest;

import java.net.URL;

public class BaseTest {

    public static AndroidDriver driver;  // Driver declared globally so all test classes can use it

    @BeforeTest
    public void setup() throws Exception {

        // Creating DesiredCapabilities to define device details, automation engine and app configuration
        DesiredCapabilities cap = new DesiredCapabilities();

        // Basic device configuration required to start Appium session
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");

        // Connecting to a specific real device using UDID
        cap.setCapability(MobileCapabilityType.UDID, "RZ8M90JH0YV");

        // Providing application package name to launch the app
        cap.setCapability("appPackage", "com.meesho.supply");

        // Preventing app reset so data remains between sessions
        cap.setCapability(MobileCapabilityType.NO_RESET, true);

        // Starting Appium session and initializing Android driver
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), cap);
    }

    @AfterTest
    public void tearDown() {

        // Closing driver and ending session after test execution
        if (driver != null) driver.quit();
    }
}
