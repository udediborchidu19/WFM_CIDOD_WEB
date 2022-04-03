package com.cicodWFM.testCases;

import com.cicodWFM.pageObjects.CreateTicketPage;
import com.cicodWFM.pageObjects.InventoryApprovalRolePage;
import com.cicodWFM.pageObjects.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InventoryApprovalRole extends BaseClass{

    @Test(priority = 1)
    public void Inventory_ApprovalRole() throws InterruptedException {

        logger.info("URL is opened");

        LoginPage lp = new LoginPage(driver);

        lp.setUserName(username);

        lp.setDomainName(domainename);

        lp.setPassword(password);

        lp.clickSubmit();

        driver.manage().window().maximize();

        CreateTicketPage ct = new CreateTicketPage(driver);

        Thread.sleep(5000);

        ct.SCrollView2();
        Thread.sleep(800);

        ct.ApplicationPgf();

        Thread.sleep(800);

        InventoryApprovalRolePage inpg = new InventoryApprovalRolePage(driver);;

        inpg.Wait();

        inpg.SCrollView();

        inpg.Wait();

        inpg.SettingMenu();

        inpg.ClickApprovalRole();

        inpg.ClickApprovalRoleBtn();

        String admin = randomeNum();
        inpg.EnterEscalRoleName("Admin" + admin);

        inpg.EnterEscalRoleDesc("This is a fake description");

        inpg.ClickCreateBtn();

        Assert.assertTrue(inpg.SuccessMessagee());

    }
    @Test(priority = 2)
    public void EditApprovalRole()
    {


    }

}
