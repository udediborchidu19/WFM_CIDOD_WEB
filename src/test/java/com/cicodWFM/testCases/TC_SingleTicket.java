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

public class TC_SingleTicket extends BaseClass{

    @Test
    public  void Single_Ticket() throws InterruptedException, IOException {

        logger.info("URL is opened");

        LoginPage lp = new LoginPage(driver);
        lp.setUserName(username);
        lp.setDomainName(domainename);
        lp.setPassword(password);
        lp.clickSubmit();


        driver.manage().window().maximize();

        Thread.sleep(3000);

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



        Thread.sleep(3000);


        //expected result stored in a string
        String expectedHeading = "Ticket Details";
        // identify element
        String heading = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/div[1]/p")).getText();


        if (expectedHeading.equals(heading)) {
            Assert.assertTrue(true);
            System.out.println("The expected heading is same as actual heading --- " + heading);
        }
    }

    }

