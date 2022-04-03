package com.cicodWFM.testCases;

import com.cicodWFM.pageObjects.CreateTicketPage;
import com.cicodWFM.pageObjects.LoginPage;
import com.cicodWFM.pageObjects.ViewResource_ContentPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC_Resource_Content extends BaseClass{

    @Test(priority = 1)
    public void Schedule_Resource_View() throws InterruptedException, IOException {
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
        WebElement l = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div[2]/section/div/div/div[1]/div[2]/div[4]/a"));
        // Javascript executor
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", l);

        Thread.sleep(800);


        ct.ApplicationPgf();

        ViewResource_ContentPage vr = new ViewResource_ContentPage(driver);

        vr.ResourceMenuClick();

        vr.ResourceSchedule();

        vr.ResourceMenuclick();

        vr.ResourceViewBtn();


        Assert.assertTrue(vr.ElementIsPresent());
        captureScreen(driver, "Schedule Resource Content");
//        Assert.assertTrue(vr.address2IsPresent());
//        Assert.assertTrue(vr.cityIsPresent());
//        Assert.assertTrue(vr.cityIsPresent());
//        Assert.assertTrue(vr.stateIscontent());
//        captureScreen(driver, "Schedule Resource Content");

    }
}
