package com.cicodWFM.testCases;

import com.cicodWFM.pageObjects.CreateRolesPage;
import com.cicodWFM.pageObjects.CreateTicketPage;
import com.cicodWFM.pageObjects.LoginPage;
//import com.cicodWFM.pageObjects.RolesPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC_Roles extends BaseClass{

    @Test
    public void CreateRoles() throws InterruptedException, IOException {
        logger.info("URL is opened");

        LoginPage lp = new LoginPage(driver);
        lp.setUserName(username);
        lp.setDomainName(domainename);
        lp.setPassword(password);
        lp.clickSubmit();
        logger.info("login completed");

        driver.manage().window().maximize();

        Thread.sleep(3000);

        CreateTicketPage ct = new CreateTicketPage(driver);

        Thread.sleep(5000);

        // identify element
        WebElement l=driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div[2]/section/div/div/div[1]/div[2]/div[4]/a"));
        // Javascript executor
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", l);
        logger.info("page is scrolled");

        Thread.sleep(800);

        ct.ApplicationPgf();

        CreateRolesPage rs = new CreateRolesPage(driver);

        rs.UserRole();
        logger.info("User menu button is clicked");

        rs.RoleSelect();
        logger.info("Role is clicked");

        Thread.sleep(3000);

        rs.RolesCreate();
        logger.info("Create role button is clicked");

        //wait
        Thread.sleep(3000);

        String name="Role " + randomeNum();
        rs.NameEntry(name);
        logger.info("Name is entered");

        rs.DescriptionEntry("Test for admin");
        logger.info("Description is entered");

        rs.ClickAccessBtn();
        logger.info("Access button is clicked");

        Thread.sleep(3000);

        rs.AllAccessCheck();
        logger.info("Role is given all access");

        // identify element
        WebElement i=driver.findElement(By.xpath("//*[@id=\"access-form\"]/div[2]/div[2]/div/input"));
        // Javascript executor
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", i);
        Thread.sleep(800);

        rs.AccessToQueue();
        logger.info("access queue button  is clicked");

        rs.AssignAll();
        logger.info("All roles has been assigned");

        WebElement u=driver.findElement(By.xpath("//*[@id=\"queues-form\"]/div[2]/div[2]/div/input"));
//        // Javascript executor
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", u);

        logger.info("Page is scrolled");

        Thread.sleep(3000);

//        rs.DoneBtn();
//        logger.info("Done button is clicked");
//
//        Thread.sleep(3000);

        rs.DoneLastBtn();

        Thread.sleep(8000);

        boolean res=driver.getPageSource().contains("Role Successfully Created.");

        if(res==true)
        {
            Assert.assertTrue(true);
            logger.info("test case passed....");
//            driver.close();

        }
        else
        {
            logger.info("test case failed....");
            captureScreen(driver,"Roles captured");
            Assert.assertTrue(false);
        }









    }
}
