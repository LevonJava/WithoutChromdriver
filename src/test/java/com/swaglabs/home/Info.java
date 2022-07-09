package com.swaglabs.home;

import com.swaglabs.login.BaseTest;
import com.swaglabs.pages.Home;
import com.swaglabs.pages.ShopBasket;
import com.swaglabs.pages.YourInfo;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Info extends BaseTest {

    @BeforeMethod
    public void navigateTo() {
        Home home = new Home(driver);
        home.addToCart();
        home.clickBasket();
        ShopBasket shopBasket = new ShopBasket(driver);
        shopBasket.checkout();
    }

    @Test
    public void testInfo() {
        YourInfo yourInfo = new YourInfo(driver);
        yourInfo.enterFirstName("Levon");
        yourInfo.enterLastName("Harutyunyan");
        yourInfo.enterPostalCode("018");
        yourInfo.clickContinueButton();
    }

}
