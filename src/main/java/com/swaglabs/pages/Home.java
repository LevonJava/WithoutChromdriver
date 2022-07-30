package com.swaglabs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.swaglabs.util.MyWebElement.click;

public class Home {
    private WebDriver driver;
    private WebDriverWait wait;

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
    private WebElement shoppingCartLink;
    @FindBy(xpath = "//button[@id = 'react-burger-menu-btn']")
    public WebElement menuBar;                                       /* menuBar-@ sarqel private  u grel metod*/
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
