package com.swaglabs.util;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverHelper {
    private static WebDriver driver = null;
    private static ChromeOptions options;

    private DriverHelper() {

    }

    private static ChromeOptions setOptions() {
        WebDriverManager.chromedriver().setup();
        options = new ChromeOptions();
        options.addArguments("start-maximized");             //options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});  Chrome is being controlled by automated test software dont work
        return options;
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            driver = new ChromeDriver(setOptions());
        }

        return driver;
    }

}
