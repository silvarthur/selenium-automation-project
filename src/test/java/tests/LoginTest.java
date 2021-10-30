package tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static utils.Constants.*;

public class LoginTest extends BaseTest {
    @Test
    public void loginSuccessfully() {
        loginPage.login("standard_user", "secret_sauce");
    }

    @Test
    public void loginIncorrectPassword() {
        loginPage.login("standard_user", "incorrect_password");

        assertEquals(INCORRECT_PASSWORD_ERROR_MESSAGE, homePage.getErrorMessage());
    }

    @Test
    public void loginPasswordRequired() {
        loginPage.login("standard_user", "");

        assertEquals(PASSWORD_REQUIRED_ERROR_MESSAGE, homePage.getErrorMessage());
    }

    @Test
    public void loginLockedOutUser() {
        loginPage.login("locked_out_user", "secret_sauce");

        assertEquals(LOCKED_OUT_USER_ERROR_MESSAGE, homePage.getErrorMessage());
    }
}
