package com.swaglabs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YourInfo {
    WebDriver driver;
    private WebDriverWait wait;
    private WebElement firstName;
    private WebElement lastName;
    private WebElement postalCode;
    private WebElement title;
    private WebElement cancleButton;
    private WebElement continueButton;
    public YourInfo(WebDriver driver) {
        this.driver = driver;
        initElements();
    }

    private void initElements() {
        this.title = driver.findElement(By.className("title"));
        this.firstName = driver.findElement(By.id("first-name"));
        this.lastName = driver.findElement(By.id("last-name"));
        this.postalCode = driver.findElement(By.id("postal-code"));
        this.cancleButton = driver.findElement(By.id("cancel"));
        this.continueButton = driver.findElement(By.id("continue"));
    }

    public void enterFirstName(String name) {
//        wait.until(ExpectedConditions.visibilityOf(firstName));
        firstName.sendKeys(name);
    }
    public void enterLastName(String lastname) {
//        wait.until(ExpectedConditions.visibilityOf(lastName));
        lastName.sendKeys(lastname);
    }
    public void enterPostalCode(String zip) {
//        wait.until(ExpectedConditions.visibilityOf(postalCode));
        postalCode.sendKeys(zip);
    }

    public void clickContinueButton(){
//        wait.until(ExpectedConditions.elementToBeClickable(continueButton));
        continueButton.click();
    }
}
