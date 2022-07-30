package com.swaglabs.home;

import com.swaglabs.BaseTest;
import com.swaglabs.pages.Home;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static com.swaglabs.util.DriverHelper.getDriver;

public class Sort extends BaseTest {
    Home home;
    @Test
    public void priceLowToHigh() {
        home = new Home(getDriver());
        home.sortLow();
        List<WebElement> itemPrice = getDriver().findElements(By.className("inventory_item_price"));
        Assert.assertEquals(itemPrice.get(0).getText(), "$7.99", "Sorting faild");
        Assert.assertEquals(itemPrice.get(1).getText(), "$9.99", "Sorting faild");
        Assert.assertEquals(itemPrice.get(2).getText(), "$15.99", "Sorting faild");
        Assert.assertEquals(itemPrice.get(3).getText(), "$15.99", "Sorting faild");
        Assert.assertEquals(itemPrice.get(4).getText(), "$29.99", "Sorting faild");
        Assert.assertEquals(itemPrice.get(5).getText(), "$49.99", "Sorting faild");
    }

    @Test
    public void priceHighToLow() {
        home = new Home(getDriver());
        home.sortHigh();
        List<WebElement> itemPrice = getDriver().findElements(By.className("inventory_item_price"));
        Assert.assertEquals(itemPrice.get(0).getText(), "$49.99", "Sorting faild");
        Assert.assertEquals(itemPrice.get(5).getText(), "$7.99", "Sorting faild");
    }

}
