package com.cicodWFM.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeparmentPage {

    WebDriver ldriver;

    public DeparmentPage(WebDriver rdriver) {
        ldriver=rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(xpath = "//*[@id=\"users_menu\"]/a/span[2]")
    @CacheLookup
    WebElement Users;

    @FindBy(xpath = "//*[@id=\"users_menu\"]/ul/li[2]/a/span[2]")
    @CacheLookup
    WebElement department;

    //wait

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[1]/div[2]/a")
    @CacheLookup
    WebElement departmentCreateBtn;

    //Wait

    @FindBy(xpath = "//*[@id=\"Team_name\"]")
    @CacheLookup
    WebElement nameEntry;

    @FindBy(xpath = "//*[@id=\"Team_description\"]")
    @CacheLookup
    WebElement description;

    // ........select Approval Group drop down........
    //*[@id="Team_approval_group_id"]

    @FindBy(xpath = "//*[@id=\"bank-form\"]/div[5]/div/input")
    @CacheLookup
    WebElement createDepartmentBtn;

    // successful message: Successful

    public void UserMenu(){Users.click();}

    public void DepartmentUser(){department.click();}

    public void DepartmentCreateB(){departmentCreateBtn.click();}

    public void NameEntry(String name){nameEntry.sendKeys(name);}

    public void DescriptionEntry(String desc){description.sendKeys(desc);}

    //...............Select...........

    public void DepartmentBtn(){createDepartmentBtn.click();}








}
