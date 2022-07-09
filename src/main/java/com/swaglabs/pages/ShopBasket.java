package com.swaglabs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ShopBasket {
    private WebDriver driver;
    private WebElement title;
    private WebElement checkout;
    private WebElement continueShopping;
    private List<WebElement> cardItem;


//    Assert.assertTrue(shopBasket.cartItem.get(0).isDisplayed());

    public ShopBasket(WebDriver driver) {
        this.driver = driver;
        initElements();
    }

    private void initElements() {
        this.title = driver.findElement(By.className("title"));
        this.cardItem = driver.findElements(By.className("cart_item"));
        this.checkout = driver.findElement(By.id("checkout"));
        this.continueShopping = driver.findElement(By.id("continue-shopping"));
    }

    public String getBasketText() {
        return this.title.getText();
    }

    public YourInfo checkout() {
        checkout.click();
        return new YourInfo(driver);
    }
    public boolean isCardItemDisplayed(int index){
       try {
           return cardItem.get(index).isDisplayed();
       }
       catch (IndexOutOfBoundsException e){
           e.printStackTrace();
           return false;
       }
    }
}
