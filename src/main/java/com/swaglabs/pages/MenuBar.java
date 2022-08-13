package com.swaglabs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.swaglabs.util.MyWebElement.getText;
import static com.swaglabs.util.MyWebElement.isDisplayed;

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
        return getText(allItems);
    }

    public boolean isDisplayedAllItems(){
        isDisplayed(allItems);
        return true;
    }
}
