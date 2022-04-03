package com.cicodWFM.testCases;

import com.cicodWFM.pageObjects.CreateTicketPage;
import com.cicodWFM.pageObjects.LoginPage;
import com.cicodWFM.pageObjects.ViewAllTicketPage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC_AssignResource extends BaseClass{

    @Test
    public void AssignResource() throws IOException, InterruptedException {

        logger.info("URL is opened");

        LoginPage lp = new LoginPage(driver);
        lp.setUserName(username);
        lp.setDomainName(domainename);
        lp.setPassword(password);
        lp.clickSubmit();


        driver.manage().window().maximize();

        Thread.sleep(3000);
//        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

        CreateTicketPage ct = new CreateTicketPage(driver);

        JavascriptExecutor jse = (JavascriptExecutor)driver;

        jse.executeScript("scroll(250, 0)"); // if the element is on top.

        jse.executeScript("scroll(0, 250)"); // if the element is on bottom.

        Thread.sleep(5000);

        ct.ApplicationPgf();

//        ct.CreateTicketsPage();

        ViewAllTicketPage Ticket = new ViewAllTicketPage(driver);
        Ticket.AllTicket();
        logger.info("All ticket tab is selected");

        Ticket.SingleTicket();
        logger.info("Single ticket is selected");

        Ticket.AssignUser();
        logger.info("Assign to button is clicked");

        Ticket.AssignResourceBtn();
        logger.info("Assign to Resource login button is clicked");



        Thread.sleep(3000);

        boolean res=driver.getPageSource().contains("Success");

        if(res==true)
        {
            Assert.assertTrue(true);
            logger.info("test case passed....");
//            driver.close();

        }
        else
        {
            logger.info("test case failed....");
            captureScreen(driver,"Assign Resource");
            Assert.assertTrue(false);
        }

    }
    }

