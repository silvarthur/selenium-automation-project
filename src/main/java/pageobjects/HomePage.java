package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    WebDriver driver;

    private By burgerMenuButtonBy = By.id("react-burger-menu-btn");
    private By logoutSidebarButtonBy = By.id("logout_sidebar_link");

    public HomePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void logout() {
        clickOnElement(burgerMenuButtonBy);
        clickOnElement(logoutSidebarButtonBy);
    }
}
