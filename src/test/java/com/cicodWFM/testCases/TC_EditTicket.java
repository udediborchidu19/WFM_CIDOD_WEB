package com.cicodWFM.testCases;

import com.cicodWFM.pageObjects.CreateTicketPage;
import com.cicodWFM.pageObjects.EditTicketPage;
import com.cicodWFM.pageObjects.LoginPage;
import com.cicodWFM.pageObjects.ViewAllTicketPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC_EditTicket extends BaseClass{

    @Test
    public void EditTicket() throws InterruptedException, IOException {



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

        JavascriptExecutor jse = (JavascriptExecutor) driver;

        jse.executeScript("scroll(250, 0)"); // if the element is on top.

        jse.executeScript("scroll(0, 250)"); // if the element is on bottom.

        Thread.sleep(5000);


        ct.ApplicationPgf();

//        ct.CreateTicketsPage();

        ViewAllTicketPage Ticket = new ViewAllTicketPage(driver);
        Ticket.AllTicket();
        logger.info("All ticket tab is selected");

        Thread.sleep(2000);

        EditTicketPage EP = new EditTicketPage(driver);
        EP.MenuButtonn();
        Thread.sleep(2000);

//        EP.UpdateTicket();




    }
}
