package com.cicodWFM.utilities;

import com.cicodWFM.pageObjects.CreateTicketPage;
import com.cicodWFM.pageObjects.LoginPage;
import com.cicodWFM.testCases.BaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.io.IOException;

public class ActionClass extends BaseClass {

    @Test
    public void Valid_loginTest() throws IOException, InterruptedException {

        LoginPage lp = new LoginPage(driver);

        lp.setUserName(username);

        lp.setDomainName(domainename);

        lp.setPassword(password);

        lp.clickSubmit();

        driver.manage().window().maximize();

        Thread.sleep(5000);

    }
}