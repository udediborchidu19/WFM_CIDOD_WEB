package com.cicodWFM.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResourceLevelPage {

    WebDriver ldriver;

    public ResourceLevelPage(WebDriver rdriver) {
        ldriver=rdriver;
        PageFactory.initElements(rdriver, this);
    }


    @FindBy(xpath = "//*[@id=\"resource_menu\"]/a/span[2]")
    @CacheLookup
    WebElement ResourceMenu;

    @FindBy(xpath = "//*[@id=\"resource_menu\"]/ul/li[3]/a/span[2]")
    @CacheLookup
    WebElement ResourceLevel;

    //..............Wait........


    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[1]/div[2]/a")
    @CacheLookup
    WebElement ResourceLevelCreateBtn;


    @FindBy(xpath = "//*[@id=\"EngineerLevel_name\"]")
    @CacheLookup
    WebElement ResourceLevelName;


    @FindBy(xpath = "//*[@id=\"EngineerLevel_description\"]")
    @CacheLookup
    WebElement ResourceLevelDesc;

    @FindBy(xpath = "//*[@id=\"bank-form\"]/div[4]/div/input")
    @CacheLookup
    WebElement CreateBtn;


    public void ResourceMenu1(){ResourceMenu.click();}

    public void ResourceLevel(){ResourceLevel.click();}

    public void ResourceLevelCreateB(){ResourceLevelCreateBtn.click();}

    public void ResourceLevelName1(String resourcelvlName){ResourceLevelName.sendKeys(resourcelvlName);}

    public void ResourceLevelDesc(String resourcelvlDesc){ResourceLevelDesc.sendKeys(resourcelvlDesc);}

    public void CreateButton(){CreateBtn.click();}










}
