package com.cicodWFM.testCases;

import com.cicodWFM.pageObjects.CreateTicketPage;
import com.cicodWFM.pageObjects.InventoryApprovalLevelPage;
import com.cicodWFM.pageObjects.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_InventoryApprovalLevel extends BaseClass {

    @Test
    public void InventoryApprovalLevel() throws InterruptedException {

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

        InventoryApprovalLevelPage Ap = new InventoryApprovalLevelPage(driver);

        Ap.SettingMenuView();
        Ap.SettingMenu();
        Ap.SettingMenuView2();
        Ap.SettingMenuItem();
        Ap.CreateApprovalLevelBtn();
        String name = randomestring();
        Ap.EnterApprovalLevel(name);
        Ap.CreateBtn();
        Assert.assertTrue(Ap.SuccessMessagee());
    }
}
