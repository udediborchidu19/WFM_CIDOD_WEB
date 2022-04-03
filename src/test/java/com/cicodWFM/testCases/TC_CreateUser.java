package com.cicodWFM.testCases;

import com.cicodWFM.pageObjects.CreateTicketPage;
import com.cicodWFM.pageObjects.CreateUserPage;
import com.cicodWFM.pageObjects.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC_CreateUser extends BaseClass{

    @Test
    public void CreateUser() throws InterruptedException, IOException {

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

        CreateUserPage up = new CreateUserPage(driver);

        up.UserMenu();

        up.UserAccess();

        Thread.sleep(3000);

        up.ClickCreateBtn();

        up.userFirstName("Jakes");

        up.setUserLastName("Kells");

        String email=randomestring()+"@gmail.com";
        up.setUserEmail(email);
        logger.info("Email is entered");

        up.setUserPhonenumber("07012907176");

        // identify element
        WebElement o=driver.findElement(By.xpath("//*[@id=\"Users_staff_id\"]"));
        // Javascript executor
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", o);
        Thread.sleep(800);

        up.selectRole();

        up.ClickRole();

        up.DepartmentSel();

        Thread.sleep(4000);

        up.DepartmentOption();

        String projectPath = System.getProperty("user.dir");
        up.setUserProilePix(projectPath);

        Thread.sleep(4000);


        // identify element
        WebElement b=driver.findElement(By.xpath("//*[@id=\"Users_staff_id\"]"));
        // Javascript executor
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", b);

        up.RegionClickn();

        up.RegionSelection();

        String staffids="Cicod" + randomeNum();
        up.setUserStaffId(staffids);
        logger.info("Staff Id is entered");

        up.setUserJobTitle("Quality Engineer");

        up.ClickUserCreateBtn();



        boolean res=driver.getPageSource().contains("Successful");

        if(res==true)
        {
            Assert.assertTrue(true);
            logger.info("test case passed....");
//            logger.log("working");
//            driver.close();

        }
        else
        {
            logger.info("test case failed....");
            captureScreen(driver,"create user snapshot");
            Assert.assertTrue(false);
        }





//














}

}
