package com.cicodWFM.testCases;

import com.cicodWFM.pageObjects.CreateTicketPage;
import com.cicodWFM.pageObjects.LoginPage;
import com.cicodWFM.pageObjects.ScheduleResourcePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class Schedule_Resource extends BaseClass{

    @Test
    public void ScheduleResource() throws InterruptedException, IOException {
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

        ScheduleResourcePage sr = new ScheduleResourcePage(driver);

        sr.ResourceMenuSel();

        sr.ResourceScheduleMenu();

        sr.ResourceCreate();

        Thread.sleep(2000);

        sr.FirstNameEntry("Jane");

        sr.LastNameEntry("Denis");

        String Email=randomestring()+"@gmail.com";
        sr.EmailEntry(Email);
        logger.info("Email is entered");

        sr.PhoneNumberEntry("07012367876");

        // identify element
        WebElement o=driver.findElement(By.xpath("//*[@id=\"Engineer_next_of_kin\"]"));
        // Javascript executor
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", o);

        Thread.sleep(800);

        String staffid="Cicod" + randomestring();
        sr.StaffIDEntry(staffid);
        logger.info("StaffID is entered");

        sr.JobTitleEntry("Quality Assurance");

        String projectPath = System.getProperty("user.dir");
        sr.ImageSel(projectPath);

        sr.NOKEntry("Tunde");

        sr.NOKPhoneEntry("09092234455");


        // identify element
        WebElement z=driver.findElement(By.xpath("//*[@id=\"Engineer_city\"]"));
        // Javascript executor
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", z);

        Thread.sleep(800);


        sr.Address1("No2 chief dominic Ajah, Badore");

        sr.Address2("Ilupeju ikorodu. Lagos");

        sr.CityEntry("Ajah");

        // identify element
        WebElement c=driver.findElement(By.xpath("//*[@id=\"Engineer_date_joined\"]"));
        // Javascript executor
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", c);

        Thread.sleep(800);

        WebElement state = driver.findElement(By.xpath("//*[@id=\"Engineer_state\"]"));
        state.click();

        // identify element
        WebElement n=driver.findElement(By.xpath("//*[@id=\"Engineer_state\"]/option[26]"));
        // Javascript executor
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", n);

        WebElement state1 = driver.findElement(By.xpath("//*[@id=\"Engineer_state\"]/option[26]"));
        state1.click();

        Thread.sleep(2000);

        sr.DateJoined();

        sr.DatePicker();

        sr.PageCickOut();

        sr.ResouceType();

        sr.ResouceTypeOpt();

        sr.ResouceLevel();

        sr.ResouceLevelOpt();

        sr.ResouceSchedule();

        sr.ResouceScheduleOPT();

        sr.ResourceDepart();

        sr.ResourceDepartOPT();

        sr.PageCickOut();

        Thread.sleep(3000);

        // identify element
        WebElement cd=driver.findElement(By.xpath("//*[@id=\"bank-form\"]/div[20]/div/input"));
        // Javascript executor
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", cd);

        sr.ResourceDepartcCreateBtn();

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
            captureScreen(driver,"Schedule Resource snapshot");
            Assert.assertTrue(false);
        }







    }
}
