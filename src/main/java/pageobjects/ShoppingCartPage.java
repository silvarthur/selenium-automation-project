package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCartPage extends BasePage {
    private By checkoutButtonBy = By.id("checkout");

    public ShoppingCartPage(WebDriver driver) {
        super(driver);
    }

    public void goToCheckoutPage() {
        clickOnElement(checkoutButtonBy);
    }
}
