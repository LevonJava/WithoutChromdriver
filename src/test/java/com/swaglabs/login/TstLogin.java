package com.swaglabs.login;

import com.swaglabs.BaseDriver;
import com.swaglabs.pages.Home;
import com.swaglabs.pages.Login;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TstLogin extends BaseDriver {
    @Test
    public void testLogin() {
        Login login = new Login(driver);
        login.enterUsername("standard_user");
        login.enterPassword("secret_sauce");
        Home homePage = login.login();
        Assert.assertEquals(homePage.getTitleText(), "PRODUCTS", "Title is incorrect");
    }
}
