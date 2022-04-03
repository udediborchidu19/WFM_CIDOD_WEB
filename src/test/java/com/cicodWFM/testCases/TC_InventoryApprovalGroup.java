package com.cicodWFM.testCases;

import com.cicodWFM.pageObjects.CreateTicketPage;
import com.cicodWFM.pageObjects.InventoryApprovalGroupPage;
import com.cicodWFM.pageObjects.InventoryApprovalLevelPage;
import com.cicodWFM.pageObjects.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_InventoryApprovalGroup extends BaseClass {

    @Test
    public void InventoryApprovalGroup() throws InterruptedException {

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

        InventoryApprovalGroupPage Gp = new InventoryApprovalGroupPage(driver);

        Gp.SettingMenuView();

        Gp.SettingsMenu();

        Gp.SettingMenuView2();

        Gp.SettingMenu();

        Gp.CreateApprovalgroup();

        String name = randomestring();
        Gp.EnterGroupname(name);

        Gp.CreateGroupnbtn();

        Assert.assertTrue(Gp.SuccessMessagee());


    }
}