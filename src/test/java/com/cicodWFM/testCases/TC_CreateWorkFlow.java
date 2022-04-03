package com.cicodWFM.testCases;

import com.cicodWFM.pageObjects.CreateTicketPage;
import com.cicodWFM.pageObjects.LoginPage;
import com.cicodWFM.pageObjects.WfmApplicationPage;
import com.cicodWFM.pageObjects.WorkFlowPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TC_CreateWorkFlow extends BaseClass {

    @Test(priority = 0)
    public void Create_Ticket() throws InterruptedException, IOException {
        logger.info("URL is opened");

        LoginPage lp = new LoginPage(driver);
        lp.setUserName(username);
        lp.setDomainName(domainename);
        lp.setPassword(password);
        lp.clickSubmit();
        logger.info("submit button is clicked");


        driver.manage().window().maximize();

        Thread.sleep(3000);



        driver.manage().window().maximize();

        Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

        WfmApplicationPage wfm = new WfmApplicationPage(driver);


        // identify element
        WebElement l=driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div[2]/section/div/div/div[1]/div[2]/div[4]/a"));
        // Javascript executor
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", l);
        Thread.sleep(800);



        wfm.setApplicationPg();

        WorkFlowPage wf = new WorkFlowPage(driver);

        Thread.sleep(3000);

        wf.WorkFlowMenuDropdown();

        wf.CreateTicketMenu();

        wf.SelectQueue();

        wf.SelQue();




        Thread.sleep(800);

        wf.SelectQueueOptn();

        // identify element
        WebElement y=driver.findElement(By.xpath("//*[@id=\"queue-types\"]/li[2]"));
        // Javascript executor
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", y);
        Thread.sleep(800);

//        WebElement vas = driver.findElement(By.xpath("//*[@id=\"queue-types\"]/li[2]"));
////        vas.click();
//        Select select = new Select(vas);
//        select.selectByValue("3");


//        new WebDriverWait(driver, 20).until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@id='load']")));

        wf.SelectQueOpps();
        logger.info("options is selected");

        wf.CreateNewStatus();

        wf.StatusesAction();

        String name="Test" + randomeNum();
        wf.CreateStatus(name);
        logger.info("Status tile is entered");

//        wf.CreateStatus("Tester 1");

        wf.Descriptionn("description for testing");

        wf.saveQueTypButton();
        logger.info("button is clicked for queue");

//        wf.saveQueTypButton();
//
//        WebElement c=driver.findElement(By.id("confirm"));
//        // Javascript executor
//        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", c);
       Thread.sleep(3000);


        wf.ConfirmBtn();
        logger.info("confirmed");

        wf.Title("Title for test");

        wf.TextAreaa("Testfiled for testing event");

        WebElement c=driver.findElement(By.id("customize_form_field"));
//        // Javascript executor
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", c);

        Thread.sleep(4000);

        wf.CustomerFormFieldBtn();
        logger.info("form button is pressed");


        Thread.sleep(5000);

        WebElement u=driver.findElement(By.xpath("//*[@id=\"escalation\"]/div/div/div[2]/div[2]/div[2]/a[2]"));
//        // Javascript executor
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", u);

//        JavascriptExecutor jse = (JavascriptExecutor) driver;
////
//        jse.executeScript("scroll(1200, 0)"); // if the element is on top.
//
//        jse.executeScript("scroll(0, 1200)"); // if the element is on bottom.


        Thread.sleep(2000);

        wf.EsacalationBtn();

        Thread.sleep(4000);

        wf.FinishBtnn();

        Thread.sleep(800);

        boolean res=driver.getPageSource().contains(" You have successfully created your workflow ");

        if(res==true)
        {
            Assert.assertTrue(true);
            logger.info("test case passed....");
//            driver.close();

        }
        else
        {
            logger.info("test case failed....");
            captureScreen(driver,"workflow_screenshot");
            Assert.assertTrue(false);
        }

    }
}
