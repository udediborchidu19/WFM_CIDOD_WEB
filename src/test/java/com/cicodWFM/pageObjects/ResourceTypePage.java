package com.cicodWFM.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResourceTypePage {

    WebDriver ldriver;

    public ResourceTypePage(WebDriver rdriver) {
        ldriver=rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(xpath = "//*[@id=\"resource_menu\"]/a/span[2]")
    @CacheLookup
    WebElement ResourceMenu;

    @FindBy(xpath = "//*[@id=\"resource_menu\"]/ul/li[2]/a/span[2]")
    @CacheLookup
    WebElement ResourceTypemenu;

    //........wait......

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[1]/div[2]/a")
    @CacheLookup
    WebElement ResourceTypeBtn;


    @FindBy(xpath = "//*[@id=\"EngineerType_name\"]")
    @CacheLookup
    WebElement ResourceTypeName;


    @FindBy(xpath = "//*[@id=\"EngineerType_description\"]")
    @CacheLookup
    WebElement ResourceTypeDescription;


    @FindBy(xpath = "//*[@id=\"bank-form\"]/div[4]/div/div/button/span[1]")
    @CacheLookup
    WebElement QueueType;

    @FindBy(xpath = "//*[@id=\"bank-form\"]/div[4]/div/div/div/ul/li[7]/a/span[1]")
    @CacheLookup
    WebElement QueueTypeOpt;

    //.......scroll to view
    //*[@id="bank-form"]/div[5]/div/input

    @FindBy(xpath = "//*[@id=\"bank-form\"]/div[5]/div/input")
    @CacheLookup
    WebElement ResourceTypeCreateBtn;



    public void ResourceMenu(){ResourceMenu.click();}

    public void ResourceTypeMenu(){ResourceTypemenu.click();}

    public void ResourceTypeCreateBtn(){ResourceTypeBtn.click();}

    public void ResourceTypeName(String rescrcTypName){ResourceTypeName.sendKeys(rescrcTypName);}

    public void ResourceTypeDescp(String rescrcTypeDesc){ResourceTypeDescription.sendKeys(rescrcTypeDesc);}

    public void QueueTypee(){QueueType.click();}

    public void QueueTypeOption(){QueueTypeOpt.click();}

    public void ResourceTypCreateBtn(){ResourceTypeCreateBtn.click();}

}
