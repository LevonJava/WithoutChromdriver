package com.swaglabs.headerfooter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;

import static com.swaglabs.util.MyWebElement.click;
import static com.swaglabs.util.MyWebElement.isDisplayed;

public class Footer {
    private WebDriver driver;

    public Footer(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "social_twitter")
    private WebElement twitter;
    @FindBy(css = "[aria-label='Twitter']")
    private WebElement twitterLogo;

    @FindBy(linkText = "Twitter")
    private WebElement twitterPage;
    @FindBy(className = "social_facebook")
    private WebElement facebook;
    @FindBy(css = "[aria-label='Facebook']")
    private WebElement facebookLogo;
    @FindBy(className = "social_linkedin")
    private WebElement linkedin;
    @FindBy(css = "[aria-label='Primary']")
    private WebElement linkedinLogo;
    @FindBy(className = "footer_robot")
    private WebElement footerRobot;
    @FindBy(className = "footer_copy")
    private WebElement termsPrivecy;


    private void switchTabs() {
        String oldTab = driver.getWindowHandle();
        ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
        newTab.remove(oldTab);
        driver.switchTo().window(newTab.get(0));
    }

    public void clickTwiiter() {
        click(twitter);
        switchTabs();
    }

    public String getTwiiterLinkText() {
        click(twitter);
        return twitterPage.getText();
    }

    public void clickFacebook() {
        click(facebook);
        switchTabs();
    }

    public void clickLinkedin() {
        click(linkedin);
        switchTabs();
    }

    public boolean isDisplayedFbLogo() {
        return isDisplayed(facebookLogo);
    }

    public boolean isDisplayedTwitterLogo() {
        return isDisplayed(twitterLogo);
    }


    public boolean isDisplayedLinkedinLogo() {
        return isDisplayed(linkedinLogo);
    }

    public boolean isDisplayedSwagRobot() {
        return isDisplayed(footerRobot);
    }

    public boolean isDisplayedTermsPrivecy() {
        return isDisplayed(termsPrivecy);
    }


}
