package com.swaglabs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.swaglabs.util.MyWebElement.click;

public class ShopBasket {
    private WebDriver driver;
    @FindBy(className = "title")
    private WebElement title;
    @FindBy(id = "checkout")
    private WebElement checkout;

    @FindBy(id = "continue-shopping")
    private WebElement continueShopping;
    @FindBy(className = "cart_item")
    private List<WebElement> cartItem;


//    Assert.assertTrue(shopBasket.cartItem.get(0).isDisplayed());

    public ShopBasket(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
//    private void initElements() {
//        this.title = driver.findElement(By.className("title"));
//        this.cartItem = driver.findElements(By.className("cart_item"));
//        this.checkout = driver.findElement(By.id("checkout"));                          OLD STYLE
//        this.continueShopping = driver.findElement(By.id("continue-shopping"));
//    }

    public String getBasketText() {
        return this.title.getText();
    }

    public YourInfo checkout() {
        checkout.click();
        return new YourInfo(driver);
    }

    public boolean isCardItemDisplayed(int index) {
        try {
            return cartItem.get(index).isDisplayed();
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            return false;
        }
    }
}
