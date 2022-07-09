package com.swaglabs.home;

import com.swaglabs.login.BaseTest;
import com.swaglabs.pages.Home;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Sort extends BaseTest {
    Home home;
    @Test
    public void priceLowToHigh() {
        home = new Home(driver);
        home.sortLow();
        List<WebElement> itemPrice = driver.findElements(By.className("inventory_item_price"));
        Assert.assertEquals(itemPrice.get(0).getText(), "$7.99", "Sorting faild");
        Assert.assertEquals(itemPrice.get(1).getText(), "$9.99", "Sorting faild");
        Assert.assertEquals(itemPrice.get(2).getText(), "$15.99", "Sorting faild");
        Assert.assertEquals(itemPrice.get(3).getText(), "$15.99", "Sorting faild");
        Assert.assertEquals(itemPrice.get(4).getText(), "$29.99", "Sorting faild");
        Assert.assertEquals(itemPrice.get(5).getText(), "$49.99", "Sorting faild");
    }

    @Test
    public void priceHighToLow() {
        home = new Home(driver);
        home.sortHigh();
        List<WebElement> itemPrice = driver.findElements(By.className("inventory_item_price"));
        Assert.assertEquals(itemPrice.get(0).getText(), "$49.99", "Sorting faild");
        Assert.assertEquals(itemPrice.get(5).getText(), "$7.99", "Sorting faild");
    }

}
