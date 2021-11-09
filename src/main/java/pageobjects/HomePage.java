package pageobjects;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {
    WebDriver driver;

    private By burgerMenuButtonBy = By.id("react-burger-menu-btn");
    private By logoutSidebarButtonBy = By.id("logout_sidebar_link");
    private By shoppingCartButtonBy = By.cssSelector(".shopping_cart_link");
    private By listOfItemsBy = By.cssSelector(".inventory_item");

    public HomePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void addItemToTheShoppingCartAndProceedToCheckout(int[] listOfItemIndex) {
        List<WebElement> listOfItems = driver.findElements(listOfItemsBy);

        for (int itemIndex : listOfItemIndex) {
            WebElement itemAddToCartButton = listOfItems.get(itemIndex).findElement(By.tagName("button"));
            clickOnElement(itemAddToCartButton);
        }

        clickOnElement(shoppingCartButtonBy);
    }

    public void logout() {
        clickOnElement(burgerMenuButtonBy);
        clickOnElement(logoutSidebarButtonBy);
    }
}
