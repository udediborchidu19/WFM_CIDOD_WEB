package com.cicodWFM.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateRolesPage {

    WebDriver ldriver;

    public CreateRolesPage(WebDriver rdriver) {
        ldriver=rdriver;
        PageFactory.initElements(rdriver, this);
    }

    //Menu Selection

    @FindBy(xpath = "//*[@id=\"users_menu\"]/a/span[2]")
    @CacheLookup
    WebElement Users;

    @FindBy(xpath = "//*[@id=\"users_menu\"]/ul/li[1]/a/span[2]")
    @CacheLookup
    WebElement Roles;



    //click on create button
    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[1]/div[2]/a")
    @CacheLookup
    WebElement CreateBtn;

    @FindBy(xpath="//*[@id=\"RightTemplate_name\"]")
    @CacheLookup
    WebElement nameField;

    @FindBy(xpath="//*[@id=\"RightTemplate_description\"]")
    @CacheLookup
    WebElement descrtiptionn;

    @FindBy(xpath = "//*[@id=\"create-form\"]/div[3]/div/input")
    @CacheLookup
    WebElement giveaccessBtn;

    @FindBy(xpath ="//*[@id=\"all-access\"]" )
    @CacheLookup
    WebElement allAccess;

//Scroll down
    @FindBy(xpath="//*[@id=\"access-form\"]/div[2]/div[2]/div/input")
    @CacheLookup
    WebElement accessToQueueBtn;

    //Assign all role to Queue

    @FindBy(xpath="//*[@id=\"queues-form\"]/div[2]/div[1]/div[1]/div/label/input")
    @CacheLookup
    WebElement assignAllRoleToQueueCheckbtn;

    //Scrolldown page to click Done button

    @FindBy(xpath="//*[@id=\"access-form\"]/div[2]/div[2]/div/input")
    @CacheLookup
    WebElement done;

    @FindBy(xpath="//*[@id=\"queues-form\"]/div[2]/div[2]/div/input")
    @CacheLookup
    WebElement doneLast;






    public void UserRole(){ Users.click();}

    public void RoleSelect(){ Roles.click();}

    public void RolesCreate(){ CreateBtn.click();}

    public void NameEntry(String name){ nameField.sendKeys(name);}

    public void DescriptionEntry(String description){ descrtiptionn.sendKeys(description);}

    public void ClickAccessBtn(){giveaccessBtn.click();}

    public void AllAccessCheck(){ allAccess.click();}

    public void AccessToQueue(){ accessToQueueBtn.click();}

    public void AssignAll(){ assignAllRoleToQueueCheckbtn.click();}

        public void DoneBtn(){ done.click();}

    public void DoneLastBtn(){ doneLast.click();}













}
