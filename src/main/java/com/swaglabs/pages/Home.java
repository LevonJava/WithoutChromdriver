package com.swaglabs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Home {
    private WebDriver driver;
    private WebElement title;
    private WebElement sauceBackpack;
    private WebElement sauceFleeceJacket;
    private WebElement shoppingCartLink;
    public WebElement menuBar;
    private WebElement sortContainer;
    private WebDriverWait wait;


    public Home(WebDriver driver) {
        this.driver = driver;
        initElements();
    }

    private void initElements() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        this.title = driver.findElement(By.className("title"));
        this.sauceBackpack = driver.findElement(By.name("add-to-cart-sauce-labs-backpack"));
        this.sauceFleeceJacket = driver.findElement(By.name("add-to-cart-sauce-labs-fleece-jacket"));
        this.shoppingCartLink = driver.findElement(By.id("shopping_cart_container"));
        this.menuBar = driver.findElement(By.xpath("//button[@id = 'react-burger-menu-btn']"));
        this.sortContainer = driver.findElement(By.className("product_sort_container"));
    }

    public void addToCart() {
        wait.until(ExpectedConditions.visibilityOf(sauceBackpack));
        wait.until(ExpectedConditions.elementToBeClickable(sauceBackpack));
        this.sauceBackpack.click();
        wait.until(ExpectedConditions.visibilityOf(sauceBackpack));
        wait.until(ExpectedConditions.elementToBeClickable(sauceBackpack));
        this.sauceFleeceJacket.click();
    }

    public ShopBasket clickBasket() {
        wait.until(ExpectedConditions.visibilityOf(shoppingCartLink));
        wait.until(ExpectedConditions.elementToBeClickable(shoppingCartLink));
        shoppingCartLink.click();
        return new ShopBasket(driver);
    }

    public String getTitleText() {
        return this.title.getText();
    }

    public void sortLow() {
        Select swag = new Select(sortContainer);
        swag.selectByValue("lohi");
    }
    public void sortHigh() {
        Select swag1 = new Select(sortContainer);
        swag1.selectByValue("hilo");
    }
}
