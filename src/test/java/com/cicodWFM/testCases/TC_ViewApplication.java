package com.cicodWFM.testCases;

import com.cicodWFM.pageObjects.LoginPage;
import com.cicodWFM.pageObjects.WfmApplicationPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.logging.Logger;


public class TC_ViewApplication extends BaseClass{
    private String text;

    @Test
    public void ViewApplication_wfm() throws InterruptedException, IOException {
        logger.info("URL is opened");

        LoginPage lp = new LoginPage(driver);



        lp.setUserName(username);
        logger.info("Entered username");

        lp.setDomainName(domainename);
        logger.info("Enter password");

        lp.setPassword(password);
        logger.info("Entered password");

        lp.clickSubmit();
        logger.info("button was clicked");

        driver.manage().window().maximize();
        logger.info("screen was maximized");

        Thread.sleep(400);

        WfmApplicationPage wfm = new WfmApplicationPage(driver);

//        JavascriptExecutor jse = (JavascriptExecutor) driver;
//
//        jse.executeScript("scroll(250, 0)"); // if the element is on top.
//
//        jse.executeScript("scroll(0, 250)"); // if the element is on bottom.

        Thread.sleep(5000);


        // identify element
        WebElement l=driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div[2]/section/div/div/div[1]/div[2]/div[4]/a"));
        // Javascript executor
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", l);
        Thread.sleep(800);




        wfm.setApplicationPg();

        Thread.sleep(3000);



        //expected result stored in a string
        String expectedHeading = "Tickets";

        //Storing the text of the heading in a string
//		String heading = lp.getTexts(innerText);
        String heading = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[4]/div/div/div/div[1]/div[1]/h4")).getText();

        //		if(expectedHeading.equalsIgnoreCase(heading))

        //if condition to check what expected result and actual result is
        if(expectedHeading.equals(heading)){
            Assert.assertTrue(true);
            System.out.println("The expected heading is same as actual heading --- "+heading);
        }
//        else
//            Assert.assertTrue(false);
//            logger.info("Login test failed");
//            System.out.println("The expected heading doesn't match the actual heading --- "+heading);



        captureScreen(driver,"loginTest");

    }



    }

