package com.swaglabs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuBar {
    WebDriver driver;
    @FindBy(id = "inventory_sidebar_link")
    private WebElement allItems;
    @FindBy(id = "about_sidebar_link")
    private WebElement about;
    @FindBy(id = "logout_sidebar_link")
    private WebElement logout;
    @FindBy(id = "reset_sidebar_link")
    private WebElement resetAppstate;
    @FindBy(id = "react-burger-cross-btn")
    private WebElement crossButton;

    public MenuBar(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getMenuText() {
        return this.allItems.getText();
    }
}
