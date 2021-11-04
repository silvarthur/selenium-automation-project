package tests;

import utils.DriverManager;
import pageobjects.HomePage;
import pageobjects.LoginPage;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;

import static utils.Constants.*;

public class BaseTest {
    private static WebDriver driver;

    protected static LoginPage loginPage;
    protected static HomePage homePage;

    @BeforeAll
    public static void initAll() {
        DriverManager driverManager = new DriverManager(System.getProperty("browser"));
        driver = driverManager.getDriver();

        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
    }

    @BeforeEach
    public void init() {
        driver.get(LOGIN_PAGE_URL);
    }

    @AfterAll
    public static void tearDownAll() {
        driver.quit();
    }
}
