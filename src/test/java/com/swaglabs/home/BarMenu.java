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
        home.menuBar.click();                /* menuBar-@ sarqel private */
        MenuBar menuBar1 = new MenuBar(getDriver());
        Assert.assertEquals(menuBar1.getMenuText(), "ALL ITEMS", "Text is incorrect");
    }

}
