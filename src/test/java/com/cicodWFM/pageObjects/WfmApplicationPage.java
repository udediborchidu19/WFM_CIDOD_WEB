package com.cicodWFM.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WfmApplicationPage {

    WebDriver ldriver;

    public WfmApplicationPage(WebDriver rdriver) {
        ldriver=rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(xpath = "//*[@id=\"__next\"]/div/main/div[2]/section/div/div/div[1]/div[2]/div[4]/a")
    @CacheLookup
    WebElement applicationPg;
    //*[@id="__next"]/div/main/div[2]/section/div/div/div[1]/div[2]/div[4]/a

    public void setApplicationPg(){applicationPg.click();}

    }

