package com.cicodWFM.testCases;

import com.cicodWFM.pageObjects.CreateTicketPage;
import com.cicodWFM.pageObjects.LoginPage;
import com.cicodWFM.pageObjects.ResourceTypePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC_ResourceType extends BaseClass{

    @Test
    public void ResourceType() throws InterruptedException, IOException {
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

        Thread.sleep(800);


        ct.ApplicationPgf();
        logger.info("Screen is scrolled");

        ResourceTypePage rt = new ResourceTypePage(driver);

        rt.ResourceMenu();
        logger.info("Resource Menu is clicked");

        rt.ResourceTypeMenu();
        logger.info("Resource Type button is clicked");

        rt.ResourceTypeCreateBtn();
        logger.info("Resource create button is clicked");

        String rescrcTypeDesc="Resource " + randomeNum();
        rt.ResourceTypeName(rescrcTypeDesc);
        logger.info("Resource Name is entered");


        rt.ResourceTypeDescp("This is for test purposes");
        logger.info("Resource description is entered");

        rt.QueueTypee();
        logger.info("Queue type field is clicked");

        rt.QueueTypeOption();
        logger.info("Queue type option is selected");

        // identify element
        WebElement b=driver.findElement(By.xpath("//*[@id=\"bank-form\"]/div[5]/div/input"));
        // Javascript executor
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", b);

        rt.ResourceTypCreateBtn();
        logger.info("Resource Type Create button is clicked");


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
            captureScreen(driver,"ResourceType snapshot");
            Assert.assertTrue(false);
        }



    }
}
