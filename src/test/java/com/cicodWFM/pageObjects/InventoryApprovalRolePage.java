package com.cicodWFM.pageObjects;

import com.cicodWFM.testCases.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.cicodWFM.testCases.BaseClass.driver;

public class InventoryApprovalRolePage extends BaseClass {

    WebDriver ldriver;

    public InventoryApprovalRolePage(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(xpath = "//*[@id=\"settings_menu\"]/a/span[2]")
    @CacheLookup
    WebElement Setting;

    @FindBy(xpath = "//*[@id=\"settings_menu\"]/ul/li[2]/a/span[2]")
    @CacheLookup
    WebElement inventoryApprovalrole;

    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/div[1]/div[2]/a")
    @CacheLookup
    WebElement CreateButtonA;

    @FindBy(xpath = "//*[@id=\"EscalationRole_name\"]")
    @CacheLookup
    WebElement EscalationRoleName;

    @FindBy(xpath = "//*[@id=\"EscalationRole_description\"]")
    @CacheLookup
    WebElement EscalationRoleDesc;

    @FindBy(xpath = "//*[@id=\"bank-form\"]/div[4]/div/input")
    @CacheLookup
    WebElement EscalationRoleCreateBTN;

    @FindBy(xpath = "//*[@id=\"settings_menu\"]/a/span[2]")
    @CacheLookup
    WebElement srollToview;

    @FindBy(xpath = "//*[@id=\"myModal2\"]/div[2]/div/div/div")
    @CacheLookup
    WebElement Successmessage;







    public void Wait() throws InterruptedException {Thread.sleep(3000);}

    public void SettingMenu(){Setting.click();}

    public void ClickApprovalRole(){inventoryApprovalrole.click();}

    public void ClickApprovalRoleBtn(){CreateButtonA.click();}

    public void EnterEscalRoleName(String roleName){EscalationRoleName.sendKeys(roleName);}

    public void EnterEscalRoleDesc (String roleDesc){EscalationRoleDesc.sendKeys(roleDesc);}

    public void ClickCreateBtn(){EscalationRoleCreateBTN.click();}

    public void SCrollView(){((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",srollToview);}

    public boolean SuccessMessagee(){
        if (Successmessage.isDisplayed()) return true;
        else return false;
    }



}
