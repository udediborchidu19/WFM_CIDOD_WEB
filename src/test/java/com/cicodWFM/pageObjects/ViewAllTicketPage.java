package com.cicodWFM.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewAllTicketPage {

    WebDriver ldriver;

    public ViewAllTicketPage(WebDriver rdriver) {
        ldriver=rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(xpath = "//*[@id=\"tabs\"]/li[2]/a")
    @CacheLookup
    WebElement AllTicket;

    @FindBy(xpath = "//*[@id=\"tableBody\"]/tr[1]/td[2]/div/p[1]/a")
    @CacheLookup
    WebElement singleTicket;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/div/div[1]/div/div[1]")
    @CacheLookup
    WebElement Assignuserbtn;

    @FindBy(xpath = "//*[@id=\"userMenuToggler\"]/a/span")
    @CacheLookup
    WebElement AssignBtn;


    @FindBy(xpath = "//*[@id=\"form_PSdVy7gU1a7Rr5knKMgTJwn4JV8o8i\"]/li/a")
    @CacheLookup
    WebElement UserAssigned;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/div/div[1]/div/div[1]/ul/li[2]/a/span")
    @CacheLookup
    WebElement ResourceAssign;



    public void AllTicket(){AllTicket.click();}

    public void SingleTicket(){singleTicket.click();}

    public void AssignUser(){ Assignuserbtn.click();}

    public void AssignUserBtn(){ AssignBtn.click();}

    public void ReassignUser(){ UserAssigned.click();}

    public void AssignResourceBtn(){ ResourceAssign.click();}

}

