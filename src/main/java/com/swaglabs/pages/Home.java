package com.swaglabs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import static com.swaglabs.util.MyWebElement.click;
import static com.swaglabs.util.MyWebElement.getText;

public class Home{
    private WebDriver driver;

    public Home(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "title")
    private WebElement title;
    @FindBy(name = "add-to-cart-sauce-labs-backpack")
    private WebElement sauceBackpack;
    @FindBy(name = "add-to-cart-sauce-labs-fleece-jacket")
    private WebElement sauceFleeceJacket;
    @FindBy(id = "shopping_cart_container")
    private WebElement shoppingCartLink;             /*stex gorc ka anelu*/
    @FindBy(xpath = "//button[@id = 'react-burger-menu-btn']")
    private WebElement menuBar;                     /*stex gorc ka anelu*/
    @FindBy(id = "logout_sidebar_link")
    private WebElement logout;
    @FindBy(className = "product_sort_container")
    private WebElement sortContainer;

    public void addToCart() {
        click(sauceBackpack);
        click(sauceFleeceJacket);
    }

    public ShopBasket clickBasket() {
        click(shoppingCartLink);
        return new ShopBasket(driver);
    }

    public void logOut() {
        click(menuBar);
        click(logout);
    }

    public void clickMenubar() {
        click(menuBar);
    }

    public String getTitleText() {
        return getText(title);
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
