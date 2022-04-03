package com.cicodWFM.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import static com.cicodWFM.testCases.BaseClass.driver;

public class InventoryApprovalRegionPage {

    WebDriver ldriver;

    public InventoryApprovalRegionPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(xpath = "//*[@id=\"settings_menu\"]/a/span[2]")
    @CacheLookup
    WebElement Setting;

    @FindBy(xpath = "//*[@id=\"settings_menu\"]/ul/li[3]/a/span[2]")
    @CacheLookup
    WebElement approvalregion;

    @FindBy(xpath = "//*[@id=\"bank-form\"]/div[2]/div/div/button/span[1]")
    @CacheLookup
    WebElement approvalregionclick;

    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/div[1]/div[2]/a")
    @CacheLookup
    WebElement approvalregioncreate;

    @FindBy(xpath = "//*[@id=\"bank-form\"]/div[2]/div/div/div/ul/li[1]")
    @CacheLookup
    WebElement approvalregionsel;

    @FindBy(xpath = "//*[@id=\"EscalationDistrictRole_emails\"]")
    @CacheLookup
    WebElement clickout;

    @FindBy(xpath = "//*[@id=\"EscalationDistrictRole_role_id\"]")
    @CacheLookup
    WebElement escalationRole;

    @FindBy(xpath = "//*[@id=\"EscalationDistrictRole_role_id\"]/option[3]")
    @CacheLookup
    WebElement escalationRoleOpt;

    //..........scroll to view.....
    @FindBy(xpath = "//*[@id=\"EscalationDistrictRole_emails\"]")
    @CacheLookup
    WebElement escalationEmail;

    @FindBy(xpath = "//*[@id=\"settings_menu\"]/a/span[2]")
    @CacheLookup
    WebElement SettingView;

    @FindBy(xpath = "//*[@id=\"myModal2\"]/div[2]/div/div/div")
    @CacheLookup
    WebElement successmessage;

    @FindBy(xpath = "//*[@id=\"bank-form\"]/div[5]/div/input")
    @CacheLookup
    WebElement Create;


    public void Settings() {
        Setting.click();
    }

    public void ApprovalRegion() {
        approvalregion.click();
    }

    public void ApprovalRegionCreate() {
        approvalregioncreate.click();
    }

    public void ClickApprovalRegionField() {
        approvalregionclick.click();
    }

//    public void ClickApprovalRegionField(){
//        Select select = new Select(approvalregionclick);
//        select.selectByIndex(2);
//    }

    public void SelectApprovalOpt() {
        approvalregionsel.click();
    }


    public void ClicOutlsidePage() {
        clickout.click();
    }

    public void ClickRoleField() {
        escalationRole.click();
    }

    public void SelRoleFieldOpt() {
        escalationRoleOpt.click();
    }

    public void Scrollview2() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", SettingView);
    }

    public void SCrollView() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", escalationEmail);
    }

    public void EnterEmailAddress(String Email) {
        escalationEmail.sendKeys(Email);
    }

    public void CreateRegion() {
        Create.click();
    }


    public void Wait() throws InterruptedException {
        Thread.sleep(3000);
    }

    public boolean SuccessMessagee() {
        if (successmessage.isDisplayed()) return true;
        else return false;

    }
}
