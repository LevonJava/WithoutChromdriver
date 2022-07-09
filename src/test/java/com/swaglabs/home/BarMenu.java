package com.swaglabs.home;

import com.swaglabs.login.BaseTest;
import com.swaglabs.pages.Home;
import com.swaglabs.pages.MenuBar;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BarMenu extends BaseTest {
    @Test
    public void testMenuBar() {
        Home home = new Home(driver);
        home.menuBar.click();
        MenuBar menuBar1 = new MenuBar(driver);
        Assert.assertEquals(menuBar1.getMenuText(), "ALL ITEMS", "Text is incorrect");
    }

}
