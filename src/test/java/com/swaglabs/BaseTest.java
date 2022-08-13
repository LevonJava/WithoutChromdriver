package com.swaglabs;

import com.swaglabs.pages.Login;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import static com.swaglabs.util.DriverHelper.getDriver;
import static com.swaglabs.util.DriverHelper.setDriver;

public class BaseTest {
    protected WebDriver driver;
    protected Login login;

    @BeforeMethod
    public void setUp() {
        driver = getDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        login = new Login(driver);
        login.enterUsername("standard_user");
        login.enterPassword("secret_sauce");
        login.login();
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            setDriver(null);
        }
    }

}

