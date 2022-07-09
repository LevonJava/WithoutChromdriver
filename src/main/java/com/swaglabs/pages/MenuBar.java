package com.swaglabs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MenuBar {
    WebDriver driver;
    WebElement allItems;
    WebElement about;
    WebElement logout;
    WebElement resetAppstate;
    WebElement crossButton;

    public MenuBar(WebDriver driver){
        this.driver = driver;
        initElements();
    }
    private void initElements() {
        this.allItems = driver.findElement(By.id("inventory_sidebar_link"));
        this.about = driver.findElement(By.id("about_sidebar_link"));
        this.logout = driver.findElement(By.id("logout_sidebar_link"));
        this.resetAppstate = driver.findElement(By.id("reset_sidebar_link"));
        this.crossButton = driver.findElement(By.id("react-burger-cross-btn"));
    }

    public String getMenuText(){
        return this.allItems.getText();
    }


}
