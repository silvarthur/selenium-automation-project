package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutCompletePage extends BasePage {
    private By backHomeButtonBy = By.id("back-to-products");

    public CheckoutCompletePage(WebDriver driver) {
        super(driver);
    }
}
