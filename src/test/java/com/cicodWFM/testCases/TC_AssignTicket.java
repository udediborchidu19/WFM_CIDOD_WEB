package com.cicodWFM.testCases;

import com.cicodWFM.pageObjects.CreateTicketPage;
import com.cicodWFM.pageObjects.LoginPage;
import com.cicodWFM.pageObjects.ViewAllTicketPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.logging.Logger;

public class TC_AssignTicket extends BaseClass{

    @Test
    public void AssignTicktet() throws InterruptedException, IOException {
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

        // identify element
        WebElement l=driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div[2]/section/div/div/div[1]/div[2]/div[4]/a"));
        // Javascript executor
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", l);

        Thread.sleep(3000);

        ct.ApplicationPgf();

//        ct.CreateTicketsPage();

        ViewAllTicketPage Ticket = new ViewAllTicketPage(driver);
        Ticket.AllTicket();

        Ticket.SingleTicket();

        Ticket.AssignUser();

        Ticket.AssignUserBtn();

        Ticket.ReassignUser();

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
            captureScreen(driver,"Assign ticket");
            Assert.assertTrue(false);
        }

    }
}
