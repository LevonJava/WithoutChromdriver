package com.swaglabs.login;

import com.swaglabs.pages.Login;
import com.swaglabs.pages.ProblemHome;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

import static com.swaglabs.util.DriverHelper.getDriver;

public class LogedOutAndProblemUser {
    WebDriver driver;
    Login login;
    ProblemHome problemHome;

    @BeforeMethod
    public void setUpFor() {
        driver = getDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        login = new Login(driver);
        login.enterUsername("locked_out_user");
        login.enterPassword("secret_sauce");
        login.login();
    }

    @Test(description = "Testing login for locked_out_user")
    public void lockedOutUserLogin() {
        Assert.assertEquals(login.getLoginErrorText(), "Epic sadface: Sorry, this user has been locked out.", "Error message is incorrect");
    }

    @Test
    public void problemUser() {
        login.enterUsername("problem_user");
        login.enterPassword("secret_sauce");
        login.login();
        problemHome = new ProblemHome(driver);
        problemHome.clicksauceLabsBackpack();
        Assert.assertNotEquals(problemHome.getsauceLabsBackpackText(), "$29.99", "Item price is incorrect");
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }

}
