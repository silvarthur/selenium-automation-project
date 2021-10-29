package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    private WebDriver driver;

    private By usernameFieldBy = By.id("user-name");
    private By passwordFieldBy = By.id("password");
    private By confirmLoginButtonBy = By.id("login-button");

    public LoginPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void login(String username, String password) {
        sendKeyToAnElement(usernameFieldBy, username);
        sendKeyToAnElement(passwordFieldBy, password);

        clickOnElement(confirmLoginButtonBy);
    }
}
