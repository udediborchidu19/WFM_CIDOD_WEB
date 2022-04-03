package com.cicodWFM.testCases;

import com.cicodWFM.pageObjects.CreateTicketPage;
import com.cicodWFM.pageObjects.DeparmentPage;
import com.cicodWFM.pageObjects.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC_CreateDepartment extends BaseClass{

    @Test
    public void CreateDepartment() throws InterruptedException, IOException {
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

        DeparmentPage dp = new DeparmentPage(driver);

        dp.UserMenu();
        logger.info("User menu button is clicked");

        dp.DepartmentUser();
        logger.info("department is selected from the menu");

        dp.DepartmentCreateB();
        logger.info("department create button is clicked");

        dp.NameEntry("Quality Control 1");
        logger.info("Department Name is entered");

        dp.DescriptionEntry("This is for testing purpose");
        logger.info("description is entered");

        WebElement vas = driver.findElement(By.xpath("//*[@id=\"Team_approval_group_id\"]"));
        Select sel = new Select(vas);
        sel.selectByValue("1");
        logger.info("Approval group is selected");

        dp.DepartmentBtn();
        logger.info("Department button is clicked");


        Thread.sleep(5000);

        boolean res=driver.getPageSource().contains("Successful");

        if(res==true)
        {
            Assert.assertTrue(true);
            logger.info("test case passed....");
//            driver.close();

        }
        else
        {
            logger.info("test case failed....");
            captureScreen(driver,"Department captured");
            Assert.assertTrue(false);
        }










    }
}
