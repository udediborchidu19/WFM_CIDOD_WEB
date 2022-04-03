package com.cicodWFM.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.cicodWFM.testCases.BaseClass.driver;

public class InventoryApprovalLevelPage {

    WebDriver ldriver;

    public InventoryApprovalLevelPage(WebDriver rdriver) {
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

    @FindBy(xpath = "//*[@id=\"settings_menu\"]/ul/li[4]/a/span[2]")
    @CacheLookup
    WebElement SettingItem;

    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/div[1]/div[2]/a")
    @CacheLookup
    WebElement SettingApprovalLevelClick;


    @FindBy(xpath = "//*[@id=\"ApprovalLevel_name\"]")
    @CacheLookup
    WebElement SettingApprovalLevelName;

    @FindBy(xpath = "//*[@id=\"bank-form\"]/div[3]/div/input")
    @CacheLookup
    WebElement CreateBtn;

    @FindBy(xpath = "//*[@id=\"myModal2\"]/div[2]/div/div/div")
    @CacheLookup
    WebElement Successmessag;


    public void SettingMenu() {
        Setting.click();
    }

    public void SettingMenuView() {
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",SettingView);


    }

    public void SettingMenuView2() {
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",SettingView2);

    }

    public void SettingMenuItem() {
        SettingItem.click();
    }

    public void CreateApprovalLevelBtn() {
        SettingApprovalLevelClick.click();
    }

    public void EnterApprovalLevel(String name) {
        SettingApprovalLevelName.sendKeys(name);
    }

    public void CreateBtn() {
        CreateBtn.click();
    }

    public boolean SuccessMessagee() {
        if (Successmessag.isDisplayed()) return true;
        else return false;

    }
}
