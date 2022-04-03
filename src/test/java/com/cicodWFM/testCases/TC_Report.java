package com.cicodWFM.testCases;

import com.cicodWFM.pageObjects.CreateTicketPage;
import com.cicodWFM.pageObjects.LoginPage;
import com.cicodWFM.pageObjects.ReportPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC_Report extends BaseClass{

    @Test(priority = 1)
    public void Report() throws InterruptedException, IOException {

        logger.info("URL is opened");

        LoginPage lp = new LoginPage(driver);
        lp.setUserName(username);
        lp.setDomainName(domainename);
        lp.setPassword(password);
        lp.clickSubmit();

        driver.manage().window().maximize();

        Thread.sleep(3000);

        CreateTicketPage ct = new CreateTicketPage(driver);

        Thread.sleep(5000);

        // identify element
        WebElement l=driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div[2]/section/div/div/div[1]/div[2]/div[4]/a"));
        // Javascript executor
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",l);
        Thread.sleep(800);

        ct.ApplicationPgf();

        ReportPage rp = new ReportPage(driver);

        rp.ReportMenu();

        rp.ReportQueue();

        rp.ReportQueueOpt();

        rp.ReportQueueType();

        rp.ReportQueueTypeOpt();

        rp.ReportStatusID();

        rp.ReportStatusIDOpt();

        rp.ReportStatusDateRange();

        rp.ReportStatusBackArr();

        rp.ReportStatusDate();

        rp.ReportStatusfowardArr();

        rp.ReportStatusDatePIck();

        rp.ReportCreateBtn();

        boolean res=driver.getPageSource().contains("Gucci shoe");

        if(res==true)
        {
            Assert.assertTrue(true);
            logger.info("test case passed....");


        }
        else
        {
            logger.info("test case failed....");
            captureScreen(driver,"create user snapshot");
            Assert.assertTrue(false);
        }

    }
}
