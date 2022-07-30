package com.swaglabs.login;

import com.swaglabs.BaseTest;
import com.swaglabs.pages.Home;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.swaglabs.util.DriverHelper.getDriver;

public class TstLogin extends BaseTest {
    @Test
    public void standartUserLogin() {
        Home homePage = new Home(getDriver());
        Assert.assertEquals(homePage.getTitleText(), "PRODUCTS", "Title is incorrect");
    }


}
