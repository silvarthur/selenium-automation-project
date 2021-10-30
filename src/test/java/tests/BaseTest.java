package tests;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import pageobjects.HomePage;
import pageobjects.LoginPage;
import utils.BrowserManager;

public class BaseTest {
    private static WebDriver driver;

    protected static LoginPage loginPage;
    protected static HomePage homePage;

    @BeforeAll
    public static void before() {
        driver = BrowserManager.getDriver(System.getProperty("browser"));

        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
    }

    @BeforeEach
    public void beforeEach() {
        driver.get("https://www.saucedemo.com/");
    }

    @AfterAll
    public static void afterAll() {
        driver.quit();
    }
}
