package com.swaglabs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook {
    WebDriver driver;

    public Facebook(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "[aria-label='Primary']")
    public WebElement element;

    public boolean isDisplayedFbLogo1() {
        return element.isDisplayed();
    }
}
