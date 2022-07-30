package com.swaglabs.home;

import com.swaglabs.BaseTest;
import com.swaglabs.pages.Home;
import com.swaglabs.pages.ShopBasket;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.swaglabs.util.DriverHelper.getDriver;

public class Basket extends BaseTest {

    @Test
    public void testBasket() {
        Home home = new Home(getDriver());
        home.addToCart();
        ShopBasket shopBasket = home.clickBasket();
        Assert.assertEquals(shopBasket.getBasketText(), "YOUR CART", "Text is incorrect");
        Assert.assertTrue(shopBasket.isCardItemDisplayed(0));

//        shopBasket.cartItem.get(0).click();
    }

}
