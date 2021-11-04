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
    public void logoutSuccessfully() {
        loginPage.login("standard_user", "secret_sauce");

        homePage.logout();

        assertEquals(LOGIN_PAGE_URL, loginPage.getDriver().getCurrentUrl());
    }
}
