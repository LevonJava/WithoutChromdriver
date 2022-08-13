package com.swaglabs.pages;

import com.swaglabs.util.WaitHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.swaglabs.util.MyWebElement.click;
import static com.swaglabs.util.MyWebElement.getText;

public class Login {
    private WebDriver driver;

    public Login(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "user-name")
    private WebElement userName;
    @FindBy(name = "password")
    private WebElement pswName;
    @FindBy(name = "login-button")
    private WebElement loginButton;
    @FindBy(css = "[data-test = error]")
    private WebElement errorMessage;


    public void enterUsername(String user) {
        new WaitHelper().toBeVisible(userName);
        userName.clear();
        userName.sendKeys(user);
    }

    public void enterPassword(String pass) {
        new WaitHelper().toBeVisible(pswName);
        pswName.clear();
        pswName.sendKeys(pass);
    }

    public Home login() {
        click(loginButton);
        return new Home(driver);
    }

    public String getLoginErrorText(){
        return getText(errorMessage);
    }

//    @Override
//    protected void load() {
//        driver.get();
//
//    }
//
//    @Override
//    protected void isLoaded() throws Error {
//
//    }
}

