package com.swaglabs.home;

import com.swaglabs.BaseTest;
import com.swaglabs.headerfooter.Footer;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FooterTst extends BaseTest {
    private Footer footer;

    @BeforeMethod
    private void setFooter() {
        footer = new Footer(driver);
    }


    @Test(description = "Testing footerRobot for Footer")
    public void tstRobot() {
        Assert.assertTrue(footer.isDisplayedSwagRobot());
    }

    @Test(description = "Testing terms&privecy text for Footer")
    public void tstTerms() {
        Assert.assertTrue(footer.isDisplayedTermsPrivecy());
    }

    @Test(description = "Testing Facebook for Footer")
    public void facebook() {
        footer.clickFacebook();
        Assert.assertTrue(footer.isDisplayedFbLogo());
    }

    @Test(description = "Testing Twitter for Footer")
    public void twitter() {
        footer.clickTwiiter();
        Assert.assertTrue(footer.isDisplayedTwitterLogo());
    }

    @Test(description = "Testing Twitter for Footer")
    public void twit() {
        Assert.assertEquals(footer.getTwiiterLinkText(), "mi ban");
    }


    @Test(description = "Testing Linkedin for Footer")
    public void linkedin() {
        footer.clickLinkedin();
        Assert.assertTrue(footer.isDisplayedLinkedinLogo());
    }
}
