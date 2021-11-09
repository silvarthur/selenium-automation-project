package tests;

import utils.MyTestWatcher;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

import static utils.Constants.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomePageTests extends BaseTest {
    @RegisterExtension
    MyTestWatcher testWatcher = new MyTestWatcher(homePage.getDriver());

    @Test
    public void checkoutSuccessfully() {
        loginPage.login("standard_user", "secret_sauce");

        homePage.addItemToTheShoppingCartAndProceedToCheckout(new int[] {0, 2});

        shoppingCartPage.goToCheckoutPage();

        checkoutStepOnePage.completeFirstStepOfCheckout("test", "test", "00000000 ");

        checkoutStepTwoPage.finishCheckoutProcess();

        assertEquals(CHECKOUT_COMPLETE_URL, checkoutStepTwoPage.getDriver().getCurrentUrl());
    }

    @Test
    public void logoutSuccessfully() {
        loginPage.login("standard_user", "secret_sauce");

        homePage.logout();

        assertEquals(LOGIN_PAGE_URL, loginPage.getDriver().getCurrentUrl());
    }
}
