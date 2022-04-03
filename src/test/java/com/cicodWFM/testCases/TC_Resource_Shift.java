package com.cicodWFM.testCases;

import com.cicodWFM.pageObjects.CreateTicketPage;
import com.cicodWFM.pageObjects.LoginPage;
import com.cicodWFM.pageObjects.ResourceLevelPage;
import com.cicodWFM.pageObjects.ResourceShiftPage;
import net.bytebuddy.utility.RandomString;
import org.apache.log4j.Priority;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC_Resource_Shift extends BaseClass {

    @Test(priority = 1)
    public void ResourceShift() throws InterruptedException, IOException {
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

        Thread.sleep(800);


        ct.ApplicationPgf();

        ResourceShiftPage rs = new ResourceShiftPage(driver);

        rs.ResourceMenu();
        rs.ResourceSchedule();
        rs.ResourceShiftBtn();

        String ShiftName = randomestring();
        rs.ResourceShiftName(ShiftName);
        rs.ResourceShiftColor();
        rs.ColorSelection();
        rs.ClickOut();
        rs.StartTime();
        rs.ArrowDown();
        rs.StartTimeSel();
        rs.ClickOut1();

        // identify element
        WebElement a=driver.findElement(By.xpath("//*[@id=\"bank-form\"]/div[6]/div/input"));
        // Javascript executor
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", a);
        Thread.sleep(800);

        rs.ClickUpwards();

        rs.ArrowUpwards();

        rs.ClickOut2();
        rs.ClickCreate();


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
            captureScreen(driver,"Resource Shift snapshot");
            Assert.assertTrue(false);
        }


    }
}
