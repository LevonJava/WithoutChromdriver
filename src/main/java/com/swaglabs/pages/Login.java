package com.swaglabs.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
public class Login {
    private WebDriver driver;
    private WebElement userName;
    private WebElement pswName;
    private WebElement loginButton;
    private WebDriverWait wait;
    public Login (WebDriver driver) {
        this.driver = driver;
        initElements();
        this.wait= new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    private void initElements() {
        this.userName = driver.findElement(By.name("user-name"));
        this.pswName = driver.findElement(By.name("password"));
        this.loginButton = driver.findElement(By.name("login-button"));
    }
    public void enterUsername(String user) {
        wait.until(ExpectedConditions.visibilityOf(userName));
        userName.sendKeys(user);
    }
    public void enterPassword(String pass) {
        wait.until(ExpectedConditions.visibilityOf(pswName));
        pswName.sendKeys(pass);
    }
    public Home login() {
        wait.until(ExpectedConditions.elementToBeClickable(loginButton));
        loginButton.click();
        return new Home(driver);
    }
}

