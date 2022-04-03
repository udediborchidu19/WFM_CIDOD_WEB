package com.cicodWFM.testCases;

import com.cicodWFM.pageObjects.CreateTicketPage;
import com.cicodWFM.pageObjects.CreateUserPage;
import com.cicodWFM.pageObjects.EditUserPage;
import com.cicodWFM.pageObjects.LoginPage;
import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC_EditUser extends BaseClass {

    @Description("Update User")
    @Test(priority = 1)
    public void Update_User() throws InterruptedException, IOException {

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

        CreateUserPage up = new CreateUserPage(driver);

        up.UserMenu();

        up.UserAccess();

        Thread.sleep(3000);

        EditUserPage Eu = new EditUserPage(driver);
        Eu.MenuButtonn();

        Eu.MenuClick();

        Eu.UpdateClick();
        Thread.sleep(2000);

        String firstName = randomestring();
        Eu.EditFirstName(firstName);

        String lastname = randomestring();
        Eu.EditLastName(lastname);

        Eu.Editemail();

        Thread.sleep(2000);

        Eu.ScrollPageToview();

        Eu.UpdateRole();

        Eu.ScrollPageToview2();

        Thread.sleep(2000);

        Eu.SelectDepartment();

        Eu.SelectDepartmentOpt();

        Eu.SelectDepartmentOpt1();

        Eu.ClickBackground();

        Eu.ScrollToView();

        Eu.UpdateUserClick();

        Assert.assertTrue(Eu.SuccessMessagee());

    }


}
