package com.cicodWFM.pageObjects;

import com.cicodWFM.testCases.BaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class EditUserPage extends BaseClass {

    WebDriver ldriver;

    public EditUserPage(WebDriver rdriver) {
        ldriver=rdriver;
        PageFactory.initElements(rdriver, this);
    }


    @FindBy(xpath = "//*[@id=\"dLabel\"]/img")
    @CacheLookup
    WebElement ResourceMenu;

    @FindBy(xpath = "//*[@id=\"dLabel\"]/img")
    @CacheLookup
    WebElement ResourceMenuClick;

    @FindBy(xpath = "/html/body/ul/li[3]/a")
    @CacheLookup
    WebElement Update;

    @FindBy(xpath = "//*[@id=\"Users_firstname\"]")
    @CacheLookup
    WebElement Firstname;

    @FindBy(xpath = "//*[@id=\"Users_lastname\"]")
    @CacheLookup
    WebElement Lastname;

    @FindBy(xpath = "//*[@id=\"Users_email\"]")
    @CacheLookup
    WebElement email;

    @FindBy(xpath = "//*[@id=\"Users_right_template_id\"]")
    @CacheLookup
    WebElement updaterole;

    @FindBy(xpath = "//*[@id=\"Users_staff_id\"]")
    @CacheLookup
    WebElement scrolltoview;

    @FindBy(xpath = "//*[@id=\"bank-form\"]/div[7]/div/div/button/span[1]")
    @CacheLookup
    WebElement clickDepartment;

    @FindBy(xpath = "//*[@id=\"bank-form\"]/div[7]/div/div/div/ul/li[1]/a/span[1]")
    @CacheLookup
    WebElement selDepartmentOpt;

    @FindBy(xpath = "//*[@id=\"bank-form\"]/div[7]/div/div/div/ul/li[5]/a/span[1]")
    @CacheLookup
    WebElement selDepartmentOpt1;

    @FindBy(xpath = "//*[@id=\"content\"]/div")
    @CacheLookup
    WebElement Clickoutside;

    @FindBy(xpath = "//*[@id=\"bank-form\"]/div[11]/div/div/button/span[1]")
    @CacheLookup
    WebElement ScrolToregion;

    @FindBy(xpath = "//*[@id=\"Users_profile_picture\"]")
    @CacheLookup
    WebElement staffIdProfile;

    @FindBy(xpath = "//*[@id=\"Users_right_template_id\"]")
    @CacheLookup
    WebElement ScrollTorole;

    @FindBy(xpath = "//*[@id=\"bank-form\"]/div[13]/div/input")
    @CacheLookup
    WebElement UpdateBtn;

    @FindBy(xpath = "//*[@id=\"myModal2\"]/div[2]/div/div/div")
    @CacheLookup
    WebElement successmessage2;

    public void MenuButtonn(){((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ResourceMenu); }

    public void UpdateClick(){Update.click();}


    public void MenuClick(){ResourceMenuClick.click();}

    public void EditFirstName(String firstname){
        Firstname.clear();
        Firstname.sendKeys(firstname);}

    public void EditLastName(String lastname){
        Lastname.clear();
        Lastname.sendKeys(lastname);}

    public void Editemail(){
        email.clear();
        String Emaill = randomestring() + "@gmail.com";
        email.sendKeys(Emaill);}


    public void UpdateRole(){
        Select select = new Select(updaterole);
        select.selectByValue("8");
        }

        public void ScrollPageToview(){
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scrolltoview);
        }

    public void ScrollPageToview2(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ScrollTorole);
    }


    public void ScrollPageToview1(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", staffIdProfile);
    }

        public void SelectDepartment(){
//            clickDepartment.clear();
            clickDepartment.click();}


    public void SelectDepartmentOpt(){
//        selDepartmentOpt1.clear();
        selDepartmentOpt1.click();}

    public void SelectDepartmentOpt1(){
//        selDepartmentOpt.clear();
        selDepartmentOpt.click();}

    public void ClickBackground(){
        Clickoutside.click();}


    public void ScrollToView(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ScrolToregion);}


    public void UpdateUserClick(){
        UpdateBtn.click();}

    public boolean SuccessMessagee() {
        if (successmessage2.isDisplayed()) return true;
        else return false;


    }

}
