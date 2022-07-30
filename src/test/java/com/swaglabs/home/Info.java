package com.swaglabs.home;

import com.swaglabs.BaseTest;
import com.swaglabs.pages.Home;
import com.swaglabs.pages.ShopBasket;
import com.swaglabs.pages.YourInfo;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.swaglabs.util.DriverHelper.getDriver;

public class Info extends BaseTest {

    @BeforeMethod
    public void navigateTo() {
        Home home = new Home(getDriver());
        home.addToCart();
        home.clickBasket();
        ShopBasket shopBasket = new ShopBasket(getDriver());
        shopBasket.checkout();
    }

    @Test
    public void testInfo() {
        YourInfo yourInfo = new YourInfo(getDriver());
        yourInfo.enterFirstName("Levon");
        yourInfo.enterLastName("Harutyunyan");
        yourInfo.enterPostalCode("018");
        yourInfo.clickContinueButton();
    }

}
