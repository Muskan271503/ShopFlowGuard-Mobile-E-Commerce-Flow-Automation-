package utils;  // Package containing utility/helper classes

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ScreenshotUtil {

    public static void capture(AndroidDriver driver, String name) {

        // Capturing screenshot from the mobile device
        try {

            File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

            // Creating screenshots folder in project directory if it does not exist
            String path = System.getProperty("user.dir") + "/screenshots/";
            Files.createDirectories(Paths.get(path));

            // Saving screenshot with given name
            File dest = new File(path + name + ".png");
            Files.copy(src.toPath(), dest.toPath());

            System.out.println("Screenshot saved: " + dest.getAbsolutePath());

        } catch (Exception e) {

            // Handling errors if screenshot capture fails
            System.out.println("Screenshot failed: " + e.getMessage());
        }
    }
}
