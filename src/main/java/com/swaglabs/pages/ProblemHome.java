package com.swaglabs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.swaglabs.util.MyWebElement.click;
import static com.swaglabs.util.MyWebElement.getText;

public class ProblemHome {
    private WebDriver driver;
    private WebDriverWait wait;

    public ProblemHome(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "item_4_title_link")
    private WebElement sauceLabsBackpack;
    @FindBy(className = "inventory_details_price")
    private WebElement sauceLabsBackpackInfo;

    public void clicksauceLabsBackpack() {
        click(sauceLabsBackpack);
    }

    public String getsauceLabsBackpackText() {
        return getText(sauceLabsBackpackInfo);
    }


}
