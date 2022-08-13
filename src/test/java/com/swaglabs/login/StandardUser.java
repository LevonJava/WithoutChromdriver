package com.swaglabs.login;

import com.swaglabs.BaseTest;
import com.swaglabs.pages.Home;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.swaglabs.util.DriverHelper.getDriver;

public class StandardUser extends BaseTest {
    Home homePage;

    @Test(description = "Testing login for standard user")
    public void standartUserLogin() {
        homePage = new Home(getDriver());
        Assert.assertEquals(homePage.getTitleText(), "PRODUCTS", "Title is incorrect");
    }

}
