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

public class TC_ViewTicket extends BaseClass{

    @Test
    public void ViewAll_Ticket() throws InterruptedException, IOException {
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

//        JavascriptExecutor jse = (JavascriptExecutor)driver;
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



        ct.ApplicationPgf();

//        ct.CreateTicketsPage();

        ViewAllTicketPage Ticket = new ViewAllTicketPage(driver);
        Ticket.AllTicket();
        logger.info("All ticket tab is selected");

        boolean res=driver.getPageSource().contains(" TOTAL TICKETS ");

        if(res==true)
        {
            Assert.assertTrue(true);
            logger.info("test case passed....");

        }
        else
        {
            logger.info("test case failed....");
            captureScreen(driver,"addticket");
            Assert.assertTrue(false);
        }
    }
}
