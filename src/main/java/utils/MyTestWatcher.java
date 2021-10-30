package utils;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class MyTestWatcher implements TestWatcher {
    private WebDriver driver;

    public MyTestWatcher(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public void testFailed(ExtensionContext context, Throwable cause) {
        String testCaseTitle = context.getDisplayName();

        try {
            ScreenshotHelper.takeScreenshot(driver, String.format("evidenceFrom%s", testCaseTitle));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
