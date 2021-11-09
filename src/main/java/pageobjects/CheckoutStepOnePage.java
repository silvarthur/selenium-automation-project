package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutStepOnePage extends BasePage {
    private By firstNameFieldBy = By.id("first-name");
    private By lastNameFieldBy = By.id("last-name");
    private By postalCodeFieldBy = By.id("postal-code");
    private By continueButtonBy = By.id("continue");

    public CheckoutStepOnePage(WebDriver driver) {
        super(driver);
    }

    public void completeFirstStepOfCheckout(String firstName, String lastName, String postalCode) {
        sendKeyToAnElement(firstNameFieldBy, firstName);
        sendKeyToAnElement(lastNameFieldBy, lastName);
        sendKeyToAnElement(postalCodeFieldBy, postalCode);

        clickOnElement(continueButtonBy);
    }
}
