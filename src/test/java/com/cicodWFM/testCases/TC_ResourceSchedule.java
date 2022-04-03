package com.cicodWFM.testCases;

import com.cicodWFM.pageObjects.CreateTicketPage;
import com.cicodWFM.pageObjects.LoginPage;
import com.cicodWFM.pageObjects.ResourceLevelPage;
import com.cicodWFM.pageObjects.ResourceSchedulePage;
import net.bytebuddy.utility.RandomString;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC_ResourceSchedule extends BaseClass{

    @Test(priority = 1)
    public void ResourceSchedule() throws InterruptedException, IOException {
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

        ResourceSchedulePage rq = new ResourceSchedulePage(driver);

        rq.ResourceMenu();

        rq.ResourceSenu();

        rq.ResourceCreatBtn();

        String resourcename = randomestring();
        rq.ResourceName(resourcename);

        rq.ResourceMondayClick();

        rq.ScheduleMonday();

        rq.ScheduleTuesday();

        rq.ScheduleTuesdayOpt();

        rq.ScheduleWednesday();

        rq.ScheduleWednesdayOpt();

        // identify element
        WebElement b=driver.findElement(By.xpath("//*[@id=\"EngineerSchedule_sunday\"]"));
        // Javascript executor
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", b);

        rq.ScheduleThursday();

        rq.ScheduleThursdayOpt();

        rq.ScheduleFriday(); rq.ScheduleFridayOpt();

        rq.ScheduleSaturday(); rq.ScheduleSaturdayOpt();


        rq.ScheduleSunday(); rq.ScheduleSundayOpt(); rq.ScheduleCreate();



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
            captureScreen(driver,"resource Level snapshot");
            Assert.assertTrue(false);
        }







    }
}
