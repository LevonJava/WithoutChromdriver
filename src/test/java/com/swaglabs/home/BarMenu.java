package com.swaglabs.home;

import com.swaglabs.BaseTest;
import com.swaglabs.pages.Home;
import com.swaglabs.pages.MenuBar;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.swaglabs.util.DriverHelper.getDriver;

public class BarMenu extends BaseTest {
    @Test
    public void testMenuBar() {
        Home home = new Home(getDriver());
        home.clickMenubar();
        MenuBar menuBar = new MenuBar(getDriver());
        Assert.assertTrue(menuBar.isDisplayedAllItems());
        Assert.assertEquals(menuBar.getMenuText(), "ALL ITEMS", "Text is incorrect");
    }

}
