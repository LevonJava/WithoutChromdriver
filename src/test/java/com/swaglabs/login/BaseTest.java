package com.swaglabs.login;

import com.swaglabs.BaseDriver;
import com.swaglabs.pages.Login;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends BaseDriver {
    @BeforeMethod
    public void logIn() {
        Login login = new Login(driver);
        login.enterUsername("standard_user");
        login.enterPassword("secret_sauce");
        login.login();
    }
}

