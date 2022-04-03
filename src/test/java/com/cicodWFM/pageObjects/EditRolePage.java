package com.cicodWFM.pageObjects;

import com.cicodWFM.testCases.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class EditRolePage extends BaseClass {

    WebDriver ldriver;

    public EditRolePage(WebDriver rdriver) {
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


    //click on more button
    @FindBy(xpath = "//*[@id=\"dLabel\"]/img")
    @CacheLookup
    WebElement RolemenueBtn;

    //click on create button
    @FindBy(xpath = "/html/body/ul/li[1]/a")
    @CacheLookup
    WebElement RolemenueUpdate;

    @FindBy(xpath="//*[@id=\"RightTemplate_name\"]")
    @CacheLookup
    WebElement nameField;

    @FindBy(xpath="//*[@id=\"RightTemplate_description\"]")
    @CacheLookup
    WebElement descrtiptionn;

    @FindBy(xpath="//*[@id=\"create-form\"]/div[3]/div/input")
    @CacheLookup
    WebElement UpdateRoleBtn;

    @FindBy(xpath = "//*[@id=\"myModal2\"]/div[2]/div/div/div")
    @CacheLookup
    WebElement successmessage;






    public void UserRole(){ Users.click();}

    public void RoleSelect(){ Roles.click();}

    public void Rolesmenu(){ RolemenueBtn.click();}

    public void RolesmenuUpdateOpt(){ RolemenueUpdate.click();}

    public void NameUpdate(){
        nameField.clear();
        String namee = randomestring();
        nameField.sendKeys(namee);}

    public void DescriptionUpdate(){

        nameField.clear();
        String descriiption = randomestring();
        descrtiptionn.sendKeys(descriiption);}



    public void DoneBtn(){ UpdateRoleBtn.click();}

    public boolean SuccessMessagee() {
        if (successmessage.isDisplayed()) return true;
        else return false;

    }

//    public void DoneLastBtn(){ doneLast.click();}

}
