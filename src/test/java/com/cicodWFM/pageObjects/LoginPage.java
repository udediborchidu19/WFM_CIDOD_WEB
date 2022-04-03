package com.cicodWFM.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
		
	@FindBy(name="merchantEmail")
	@CacheLookup
	WebElement txtUserName;
	
	@FindBy(name="merchantPassword")
	@CacheLookup
	WebElement txtPassword;

	@FindBy(name="tenantId")
	@CacheLookup
	WebElement txtDomain;
	
	@FindBy(xpath="//*[@id=\"tab1default\"]/div[1]/form/div[4]/button")
	@CacheLookup
	WebElement btnLogin;

	@FindBy(xpath ="//*[@id=\"__next\"]/div/header/nav/ul")
	@CacheLookup
	WebElement profileBtn;
	
	
	@FindBy(xpath="//*[@id=\"__next\"]/div/header/nav/ul/li/ul/li[2]")
	@CacheLookup
	WebElement lnkLogout;


	//Invalid credentials

	@FindBy(name="merchantEmail")
	@CacheLookup
	WebElement txtUserName_Inv;

	@FindBy(name="merchantPassword")
	@CacheLookup
	WebElement txtPassword_Inv;

	@FindBy(name="tenantId")
	@CacheLookup
	WebElement txtDomain_Inv;



//	@FindBy(xpath ="//*[@id=\"__next\"]/div/header/nav/ul")
//	@CacheLookup
//	WebElement profileBtn;




	public void setUserName(String uname)
	{
		txtUserName.sendKeys(uname);
	}
	
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}

	public void setDomainName(String dmain) {txtDomain.sendKeys(dmain); }

//	public void selProfileBtn() { profileBtn.click(); }
	
	
	public void clickSubmit()
	{
		btnLogin.click();
	}	
	
	public void clickLogout()
	{
		lnkLogout.click();
	}


	//Invalid

	public void setInvalidUserName(String uname1)
	{
		txtUserName_Inv.sendKeys(uname1);
	}

	public void setInvalidPassword(String pwd1)
	{
		txtPassword_Inv.sendKeys(pwd1);
	}

	public void setInvalidDomainName(String dmain) {txtDomain.sendKeys(dmain); }
	
	
	
}









