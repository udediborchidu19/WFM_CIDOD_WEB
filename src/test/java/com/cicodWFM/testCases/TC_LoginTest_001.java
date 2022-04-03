package com.cicodWFM.testCases;


import java.io.IOException;
//import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


import com.cicodWFM.pageObjects.LoginPage;


public class TC_LoginTest_001 extends BaseClass {

	@Test
	public void Valid_loginTest() throws IOException, InterruptedException {

		LoginPage lp = new LoginPage(driver);

		lp.setUserName(username);

		lp.setDomainName(domainename);

		lp.setPassword(password);

		lp.clickSubmit();

		driver.manage().window().maximize();

		Thread.sleep(5000);

		if (driver.getCurrentUrl().equals("https://recyclepoints.cicodsaasstaging.com/admin/merchant")) {
			Assert.assertTrue(true);
			logger.info("Login test passed");
		} else {
			captureScreen(driver, "loginTest");
			Assert.assertTrue(false);
			logger.info("Login test failed");
		}

	}



}

