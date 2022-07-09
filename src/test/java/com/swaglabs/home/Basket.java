package com.swaglabs.home;

import com.swaglabs.login.BaseTest;
import com.swaglabs.pages.Home;
import com.swaglabs.pages.ShopBasket;
import com.swaglabs.pages.YourInfo;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Basket extends BaseTest {
    ShopBasket shopBasket;

    @Test
    public void testBasket() {
        Home home = new Home(driver);
        home.addToCart();
        home.clickBasket();
        shopBasket = new ShopBasket(driver);
        Assert.assertEquals(shopBasket.getBasketText(), "YOUR CART", "Text is incorrect");
        Assert.assertTrue(shopBasket.isCardItemDisplayed(3));


//        shopBasket.cartItem.get(0).click();


    }

}
