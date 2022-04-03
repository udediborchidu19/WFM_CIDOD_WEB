package com.cicodWFM.testCases;

import com.cicodWFM.pageObjects.CreateTicketPage;
import com.cicodWFM.pageObjects.CreateUserPage;
import com.cicodWFM.pageObjects.EditRolePage;
import com.cicodWFM.pageObjects.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_EditRole extends BaseClass {

    @Test
    public void EditRole() throws InterruptedException {


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
        WebElement l = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div[2]/section/div/div/div[1]/div[2]/div[4]/a"));
        // Javascript executor
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", l);
        Thread.sleep(800);

        ct.ApplicationPgf();

        EditRolePage Er = new EditRolePage(driver);

        Er.UserRole();

        Er.RoleSelect();

        Er.Rolesmenu();

        Er.RolesmenuUpdateOpt();

        Er.NameUpdate();

        Er.DescriptionUpdate();

        Thread.sleep(3000);

        Er.DoneBtn();

        Assert.assertTrue(Er.SuccessMessagee());
    }
}