package tests;

import utils.MyTestWatcher;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

import static utils.Constants.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginTest extends BaseTest {
    @RegisterExtension
    MyTestWatcher testWatcher = new MyTestWatcher(loginPage.getDriver());

    @Test
    public void loginSuccessfully() {
        loginPage.login("standard_user", "secret_sauce");
    }

    @Test
    public void loginIncorrectPassword() throws IOException {
        loginPage.login("standard_user", "incorrect_password");

        assertEquals(INCORRECT_PASSWORD_ERROR_MESSAGE, loginPage.getErrorMessage());
    }

    @Test
    public void loginWithUnregisteredUser() {
        loginPage.login("unregistered_user", "secret_sauce");

        assertEquals(UNREGISTERED_USER_ERROR_MESSAGE, loginPage.getErrorMessage());
    }

    @Test
    public void loginPasswordRequired() {
        loginPage.login("standard_user", "");

        assertEquals(PASSWORD_REQUIRED_ERROR_MESSAGE, loginPage.getErrorMessage());
    }

    @Test
    public void loginLockedOutUser() {
        loginPage.login("locked_out_user", "secret_sauce");

        assertEquals(LOCKED_OUT_USER_ERROR_MESSAGE, loginPage.getErrorMessage());
    }
}
