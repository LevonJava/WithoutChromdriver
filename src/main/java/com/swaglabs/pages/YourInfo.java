package com.swaglabs.pages;

import com.swaglabs.util.WaitHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.swaglabs.util.MyWebElement.click;
import static com.swaglabs.util.MyWebElement.waitHelper;

public class YourInfo {
    private WebDriver driver;
    private WebDriverWait wait;
    @FindBy(id = "first-name")
    private WebElement firstName;
    @FindBy(id = "last-name")
    private WebElement lastName;
    @FindBy(id = "postal-code")
    private WebElement postalCode;
    @FindBy(className = "title")
    private WebElement title;
    @FindBy(id = "cancel")
    private WebElement cancleButton;
    @FindBy(id = "continue")
    private WebElement continueButton;
    public YourInfo(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterFirstName(String name) {
        waitHelper.toBeVisible(firstName);
        firstName.sendKeys(name);
    }
    public void enterLastName(String lastname) {
        lastName.sendKeys(lastname);
    }
    public void enterPostalCode(String zip) {
        postalCode.sendKeys(zip);
    }

    public void clickContinueButton(){
        click(continueButton);
    }
}
