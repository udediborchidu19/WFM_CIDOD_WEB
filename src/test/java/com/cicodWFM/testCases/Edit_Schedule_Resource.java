package com.cicodWFM.testCases;

import com.cicodWFM.pageObjects.CreateTicketPage;
import com.cicodWFM.pageObjects.Edit_Schedule_ResourcePage;
import com.cicodWFM.pageObjects.LoginPage;
import com.cicodWFM.pageObjects.ViewAllTicketPage;
import jdk.jfr.Description;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Edit_Schedule_Resource extends BaseClass {

    @Description("Editing schedule resource")
    @Test
    public void Edit_Schedule_Resource() throws InterruptedException {


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

        JavascriptExecutor jse = (JavascriptExecutor) driver;

        jse.executeScript("scroll(250, 0)"); // if the element is on top.

        jse.executeScript("scroll(0, 250)"); // if the element is on bottom.

        Thread.sleep(5000);

        ct.ApplicationPgf();

//        ct.CreateTicketsPage();

        Edit_Schedule_ResourcePage Esr = new Edit_Schedule_ResourcePage(driver);
        Esr.ResourceMenuSel();

        Esr.ResourceScheduleMenu();

        Esr.ClickMoreBtn();

        Esr.ResourceUPdate();

        Esr.FirstNameUpdate();

        Esr.LastNameUpdate();

        Esr.EmailUpdate();

        Esr.Scrollview2();

        Thread.sleep(2000);

        Esr.PhoneNumberUpdate();

        Esr.StaffIDUpdate();

        Esr.JobTitleUpdate();

        Esr.ImageSel();

        Esr.NOKUpdate();

        Esr.NOKPhoneUpdate();

        Esr.Scrollview3();

        Esr.AddressUpdate();

        Esr.Address2();

        Esr.CityUpdate();

        Esr.Scrollview4();

        Esr.DateJoined();

        Esr.DatePicker();

        Esr.PageCickOut();

        Esr.ResouceType();

        Esr.ResouceTypeOpt();

        Esr.ResouceLevel();

        Esr.ResouceTypeOpt();

        Esr.ResouceLevel();

        Esr.ResouceLevelOpt();

        Esr.ResouceSchedule();

        Esr.ResouceScheduleOPT();

        Esr.ResourceDepart();

        Esr.ResourceDepartOPT();

        Esr.PageCickOut1();

        Thread.sleep(3000);

        Esr.ResourceDepartcUpdateBtn();

        Assert.assertTrue(Esr.SuccessMessagee());


    }
}