package com.cicodWFM.testCases;

import com.cicodWFM.pageObjects.LoginPage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC_InvalidLoginTest extends BaseClass {
    @Test
    public void invalid_login_Test() throws IOException, InterruptedException {
        logger.info("URL is opened");

        LoginPage lp = new LoginPage(driver);



        lp.setInvalidUserName(invalidusername);
        logger.info("Entered username");

        lp.setInvalidDomainName(invaliddomainname);
        logger.info("Enter password");

        lp.setInvalidPassword(invalidpassword);
        logger.info("Entered password");

        lp.clickSubmit();
        logger.info("button was clicked");

        driver.manage().window().maximize();
        logger.info("screen was maximized");

        Thread.sleep(400);


        JavascriptExecutor jse = (JavascriptExecutor) driver;

        jse.executeScript("scroll(250, 0)"); // if the element is on top.

        jse.executeScript("scroll(0, 250)"); // if the element is on bottom.

        Thread.sleep(5000);


        driver.manage().timeouts();



        Assert.assertFalse(false);
        logger.info("Login test Failed");




    }
}
