package com.cicodWFM.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.cicodWFM.testCases.BaseClass.driver;

public class EditTicketPage {

    WebDriver ldriver;

    public EditTicketPage(WebDriver rdriver) {
        ldriver=rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(id = "//*[@id=\"tableBody\"]/tr[1]/td[12]/span")
    @CacheLookup
    WebElement menuBtnnnn;

    @FindBy(xpath = "//*[@id=\"tableBody\"]/tr[1]/td[13]/div/ul/li[2]/a")
    @CacheLookup
    WebElement Update;


    public void MenuButtonn(){((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", menuBtnnnn); }

    public void UpdateTicket(){ Update.click();}

    public void UpdateTicke(String name){
        Update.clear();
        Update.sendKeys(name);}
}
