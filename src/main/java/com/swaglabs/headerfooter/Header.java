//package com.swaglabs.headerfooter;
//
//import com.swaglabs.pages.ShopBasket;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//
//import static com.swaglabs.util.MyWebElement.click;
//import static com.swaglabs.util.MyWebElement.isDisplayed;
//
//public class Header {
//    WebDriver driver;
//    public Header(WebDriver driver) {
//    }
//    @FindBy(className = "app_logo")
//    private WebElement swagLogo;
//    @FindBy(xpath = "//button[@id = 'react-burger-menu-btn']")
//    private WebElement menuBar;
//    @FindBy(id = "shopping_cart_container")
//    private WebElement shoppingCartLink;
//
//    public boolean isDisplayedSwagLogo(){
//        return isDisplayed(swagLogo);
//    }
//
//    public ShopBasket clickBasket() {
//        click(shoppingCartLink);
//        return new ShopBasket(driver);
//    }
//}
