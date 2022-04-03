package com.cicodWFM.testCases;

import com.cicodWFM.pageObjects.CreateTicketPage;
import com.cicodWFM.pageObjects.InventoryApprovalRegionPage;
import com.cicodWFM.pageObjects.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_InventoryApprovalRegion extends BaseClass{

    @Test
    public void InventoryApprovalRegion() throws InterruptedException {

        LoginPage lp = new LoginPage(driver);

        lp.setUserName(username);

        lp.setDomainName(domainename);

        lp.setPassword(password);

        lp.clickSubmit();

        driver.manage().window().maximize();

        Thread.sleep(5000);

        CreateTicketPage ct = new CreateTicketPage(driver);

        Thread.sleep(5000);

        ct.SCrollView2();
        Thread.sleep(800);

        ct.ApplicationPgf();

        InventoryApprovalRegionPage Ip = new InventoryApprovalRegionPage(driver);

        Thread.sleep(800);

        Ip.Scrollview2();
        Ip.Settings();
        Ip.ApprovalRegion();
        Ip.ApprovalRegionCreate();
        Ip.Wait();
        Ip.ClickApprovalRegionField();
        Ip.SelectApprovalOpt();
        Ip.ClicOutlsidePage();
        Ip.Wait();
        Ip.SCrollView();
        Ip.ClickRoleField();
        Ip.SelRoleFieldOpt();
        String Email = randomestring() + "@gmail.com";
        Ip.EnterEmailAddress(Email);
        Ip.CreateRegion();

        Assert.assertTrue(Ip.SuccessMessagee());




    }


}
