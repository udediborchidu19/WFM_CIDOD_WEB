package com.cicodWFM.testCases;

import com.cicodWFM.pageObjects.CreateTicketPage;
import com.cicodWFM.pageObjects.LoginPage;
import com.cicodWFM.pageObjects.ViewAllTicketPage;
import com.cicodWFM.pageObjects.WfmApplicationPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TC_CreateTicket extends BaseClass{

    @Test (priority=1)
    public void Create_Ticket() throws InterruptedException, IOException {
        logger.info("URL is opened");

        LoginPage lp = new LoginPage(driver);
        lp.setUserName(username);
        lp.setDomainName(domainename);
        lp.setPassword(password);
        lp.clickSubmit();

        driver.manage().window().maximize();

//        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

        CreateTicketPage ct = new CreateTicketPage(driver);

        // identify element
        WebElement l=driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div[2]/section/div/div/div[1]/div[2]/div[4]/a"));
        // Javascript executor
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", l);

        Thread.sleep(800);


        ct.ApplicationPgf();

        ct.CreateTicketsPage();
        logger.info("create ticket button is pressed");

        ct.SelQueueType();

        ct.QueueTypeOpt();

        ct.QueueTypeOpt1();

        ct.QueueTypeOpt2();



//        ct.Value();
//        logger.info("QueueType2 is selected");
        Thread.sleep(2000);



        // identify element
        WebElement ci=driver.findElement(By.xpath("//*[@id=\"additionalField\"]/div/div/div/div[1]/input"));
        // Javascript executor
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", ci);
        Thread.sleep(800);


        ct.Tile("This is just a Title");
        logger.info("Title is entered");

        ct.Description("This is just for test");
        logger.info("Description is entered");

        ct.CustomerTitle("Mr");

        ct.FirstName("John");
        logger.info("firstname is entered");

        Thread.sleep(800);

        // identify element
        WebElement t=driver.findElement(By.xpath("//*[@id=\"additionalField\"]/div/div/div/div[5]/input"));
        // Javascript executor
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", t);
        Thread.sleep(800);



        ct.LatName("Doe");
        logger.info("Last name is entered");

        ct.PhoneNumber("07012898788");
        logger.info("phone number is entered");

        Thread.sleep(800);


        String email=randomestring()+"@gmail.com";
        ct.Emailid(email);
        logger.info("Email is entered");

        ct.CreateBtn();
        logger.info("Ticket create button is clicked");

//        String res = driver.findElement(By.xpath("//*[@id=\"message-body\"]/p"));

        boolean res=driver.getPageSource().contains("Ticket Created Sucessfully -  Ticket ID: ");

        if(res==true)
        {
            Assert.assertTrue(true);
            logger.info("test case passed....");
//            driver.close();

        }
        else
        {
            logger.info("test case failed....");
            captureScreen(driver,"addticket");
            Assert.assertTrue(false);
        }

//        Thread.sleep(3000);
    }


}
