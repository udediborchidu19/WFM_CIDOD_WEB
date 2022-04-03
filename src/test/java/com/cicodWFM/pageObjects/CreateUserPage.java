package com.cicodWFM.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateUserPage {

    WebDriver ldriver;

    public CreateUserPage(WebDriver rdriver) {
        ldriver=rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(xpath = "//*[@id=\"users_menu\"]/a/span[2]")
    @CacheLookup
    WebElement Users;

    @FindBy(xpath = "//*[@id=\"users_menu\"]/ul/li[3]/a/span[2]")
    @CacheLookup
    WebElement User;

    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/div[1]/div[2]/a[2]")
    @CacheLookup
    WebElement userCreateBtn;

    //..........Wait.........

    @FindBy(xpath = "//*[@id=\"Users_firstname\"]")
    @CacheLookup
    WebElement UserFirstname;

    @FindBy(xpath = "//*[@id=\"Users_lastname\"]")
    @CacheLookup
    WebElement UserLastname;

    @FindBy(xpath = "//*[@id=\"Users_email\"]")
    @CacheLookup
    WebElement userEmail;

    @FindBy(xpath = "//*[@id=\"Users_phone\"]")
    @CacheLookup
    WebElement userPhonenumber;

    //.......scroll to view.......
    //*[@id="Users_staff_id"]

    //....continue....
    //......Select role.....
    //*[@id="Users_right_template_id"]
    @FindBy(xpath = "//*[@id=\"Users_right_template_id\"]")
    @CacheLookup
    WebElement rolesel;

    @FindBy(xpath = "//*[@id=\"bank-form\"]/div[7]/div/div/button/span[1]")
    @CacheLookup
    WebElement rolesell;

    @FindBy(xpath = "//*[@id=\"bank-form\"]/div[7]/div/div/div/ul/li[1]/a")
    @CacheLookup
    WebElement departmentSel;


    @FindBy(xpath = "//*[@id=\"Users_right_template_id\"]/option[3]")
    @CacheLookup
    WebElement roleselect;

    //.......Select department......
    //*[@id="bank-form"]/div[7]/div/div/button/span[1]

    //profile upload
    @FindBy(xpath = "//*[@id=\"Users_profile_picture\"]")
    @CacheLookup
    WebElement profilepix;



    @FindBy(xpath = "//*[@id=\"Users_staff_id\"]")
    @CacheLookup
    WebElement staffID;

    //.......scroll to view.......
    //*[@id="bank-form"]/div[13]/div/input

    @FindBy(xpath = "//*[@id=\"Users_job_title\"]")
    @CacheLookup
    WebElement jobTitle;

    @FindBy(xpath = "//*[@id=\"bank-form\"]/div[11]/div/div/button/span[1]")
    @CacheLookup
    WebElement regionClick;

    @FindBy(xpath = "//*[@id=\"bank-form\"]/div[11]/div/div/div/ul/li[2]/a/span[1]")
    @CacheLookup
    WebElement regionSelect;

    //........select region......
    //*[@id="bank-form"]/div[11]/div/div/button/span[1]

    @FindBy(xpath = "//*[@id=\"Users_is_linemanager\"]")
    @CacheLookup
    WebElement InvApproval;

    @FindBy(xpath = "//*[@id=\"bank-form\"]/div[13]/div/input")
    @CacheLookup
    WebElement CreateUser;



    //.......successful message: Successful

    public void UserMenu(){Users.click();}

    public void UserAccess(){User.click();}

    public void ClickCreateBtn(){userCreateBtn.click();}

    public void userFirstName(String firstname){UserFirstname.sendKeys(firstname);}

    public void setUserLastName(String lastname){UserLastname.sendKeys(lastname);}

    public void setUserEmail(String email){userEmail.sendKeys(email);}

    public void setUserPhonenumber(String phonenumber){userPhonenumber.sendKeys(phonenumber);}

    public void selectRole(){ rolesel.click();}

    public void ClickRole(){ roleselect.click();}

    public void RegionClickn(){ regionClick.click();}

    public void RegionSelection(){ regionSelect.click();}

    public void DepartmentSel(){ rolesell.click();}

    public void DepartmentOption(){departmentSel.click(); }

    public void setUserProilePix(String projectPath){profilepix.sendKeys( projectPath + "\\Image_file\\broken_screen.png");}

    public void setUserStaffId(String staffId){staffID.sendKeys(staffId);}

    public void setUserJobTitle(String jobTitl){jobTitle.sendKeys(jobTitl);}

    public void ClickUserCreateBtn(){CreateUser.click();}

























}
