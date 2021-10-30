package tests;

import utils.DriverManager;
import pageobjects.HomePage;
import pageobjects.LoginPage;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;

public class BaseTest {
    private static WebDriver driver;

    protected static LoginPage loginPage;
    protected static HomePage homePage;

    @BeforeAll
    public static void initAll() {
        driver = DriverManager.getDriver(System.getProperty("browser"));

        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
    }

    @BeforeEach
    public void init() {
        driver.get("https://www.saucedemo.com/");
    }

    @AfterAll
    public static void tearDownAll() {
        driver.quit();
    }
}
