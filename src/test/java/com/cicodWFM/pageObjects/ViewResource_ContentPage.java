package com.cicodWFM.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewResource_ContentPage {

    WebDriver ldriver;

    public ViewResource_ContentPage(WebDriver rdriver) {
        ldriver=rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(xpath = "//*[@id=\"resource_menu\"]/a/span[2]")
    @CacheLookup
    WebElement ResourceMenu;

    @FindBy(xpath = "//*[@id=\"resource_menu\"]/ul/li[1]/a/span[2]")
    @CacheLookup
    WebElement Resourceschedule;

    @FindBy(xpath = "//*[@id=\"dLabel\"]/img")
    @CacheLookup
    WebElement ResourceMenuClick;

    @FindBy(xpath = "/html/body/ul/li[1]/a")
    @CacheLookup
    WebElement ResourceView;

    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/div[2]/div[1]/div[2]/div/div[3]/p[2]")
    @CacheLookup
    WebElement address1content;

    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/div[2]/div[1]/div[2]/div/div[4]/p[2]")
    @CacheLookup
    WebElement address2content;

    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/div[2]/div[1]/div[2]/div/div[5]/p[2]")
    @CacheLookup
    WebElement citycontent;

    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/div[2]/div[1]/div[2]/div/div[6]/p[2]")
    @CacheLookup
    WebElement statecontent;

    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/div[2]/div[1]/div[2]/div/div[7]/p[2]")
    @CacheLookup
    WebElement nextofkinscontent;

    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/div[2]/div[1]/div[2]/div/div[7]/p[2]")
    @CacheLookup
    WebElement nextofkinsphonenumbercontent;

    @FindBy(xpath = "///*[@id=\"content\"]/div[1]/div[2]/div[1]/div[2]/div/div[9]/p[2]")
    @CacheLookup
    WebElement departmentcontent;

    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/div[2]/div[1]/div[2]/div/div[12]/p[2]")
    @CacheLookup
    WebElement location;

//    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/div[2]/div[1]/div[2]/div/div[12]/p[2]")
//    @CacheLookup
//    WebElement location;


    public boolean ElementIsPresent(){

        if (address1content.isDisplayed() &
                address2content.isDisplayed() &
                address2content.isDisplayed() &
                citycontent.isDisplayed() &
                statecontent.isDisplayed()) return true;
        else return false;

//        citycontent.isDisplayed();
//        statecontent.isDisplayed();
//        nextofkinscontent.isDisplayed());

    }

    public void ResourceMenuClick(){
        ResourceMenu.click();

    }

    public void ResourceSchedule(){
        Resourceschedule.click();
    }

    public void ResourceMenuclick(){
        ResourceMenuClick.click();
    }

    public void ResourceViewBtn(){
        ResourceView.click();
    }



//    public boolean address1IsPresent(){
//
//        if (address1content.isDisplayed()) return true;
//        else return false;
//
//    }
//
//
//
//    public boolean address2IsPresent(){
//        if (address2content.isDisplayed()) return true;
//        else return false;
//
//    }
//
//    public boolean cityIsPresent(){
//        if (citycontent.isDisplayed()) return true;
//        else return false;
//    }
//
//    public boolean stateIscontent(){
//        statecontent.isDisplayed();
//        return stateIscontent();
//    }





}
