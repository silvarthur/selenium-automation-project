package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {
    private String os;
    private String browserName;

    public DriverManager(String browserName) {
        if (!browserName.equals("chrome") && !browserName.equals("firefox")) {
            throw new IllegalArgumentException("The browser must be either Chrome or Firefox!");
        }

        this.os = System.getProperty("os.name").toLowerCase();
        this.browserName = browserName;
    }

    public WebDriver getDriver() {
        if (browserName.equals("chrome")) {
            if (os.equals("mac os x")) {
                System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chrome/chromedriver");
            } else {
                System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chrome/chromedriver.exe");
            }
            return new ChromeDriver();
        } else {
            if (os.equals("mac os x")) {
                System.setProperty("webdriver.gecko.driver", "src/main/resources/drivers/firefox/geckodriver");
            } else {
                System.setProperty("webdriver.gecko.driver", "src/main/resources/drivers/firefox/geckodriver.exe");
            }

            return new FirefoxDriver();
        }
    }
}