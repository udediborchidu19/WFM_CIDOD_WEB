package com.cicodWFM.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.cicodWFM.testCases.BaseClass.driver;

public class InventoryApprovalGroupPage {

    WebDriver ldriver;

    public InventoryApprovalGroupPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(xpath = "//*[@id=\"settings_menu\"]/a/span[2]")
    @CacheLookup
    WebElement SettingView;

    @FindBy(xpath = "//*[@id=\"settings_menu\"]/ul/li[5]/a/span[2]")
    @CacheLookup
    WebElement SettingView2;

    @FindBy(xpath = "//*[@id=\"settings_menu\"]/a/span[2]")
    @CacheLookup
    WebElement Setting;

    @FindBy(xpath = "//*[@id=\"settings_menu\"]/ul/li[5]/a/span[2]")
    @CacheLookup
    WebElement approvalgroupmenu;


    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/div[1]/div[2]/a")
    @CacheLookup
    WebElement Createapprovalgroup;


    @FindBy(xpath = "//*[@id=\"ApprovalGroup_name\"]")
    @CacheLookup
    WebElement approvalgroupname;

//    @FindBy(xpath = "//*[@id=\"ApprovalGroup_name\"]")
//    @CacheLookup
//    WebElement approvalgroupname;

    @FindBy(xpath = "//*[@id=\"bank-form\"]/div[3]/input")
    @CacheLookup
    WebElement Createapprovalgroupbtn;

    @FindBy(xpath = "//*[@id=\"myModal2\"]/div[2]/div/div/div")
    @CacheLookup
    WebElement Successmesg;


    public void SettingsMenu() {
        Setting.click();
    }

    public void SettingMenuView() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", SettingView);

    }


    public void SettingMenuView2() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", SettingView2);

    }

    public void SettingMenu() {
        approvalgroupmenu.click();
    }

    public void CreateApprovalgroup() {
        Createapprovalgroup.click();
    }

    public void EnterGroupname(String name) {
        approvalgroupname.sendKeys(name);
    }

    public void CreateGroupnbtn() {
        Createapprovalgroupbtn.click();
    }

    public boolean SuccessMessagee() {
        if (Successmesg.isDisplayed()) return true;
        else return false;


    }
}
