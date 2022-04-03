package com.cicodWFM.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ScheduleResourcePage {

    WebDriver ldriver;

    public ScheduleResourcePage(WebDriver rdriver) {
        ldriver=rdriver;
        PageFactory.initElements(rdriver, this);
    }


    @FindBy(xpath = "//*[@id=\"resource_menu\"]/a/span[2]")
    @CacheLookup
    WebElement ResourceMenu;

    @FindBy(xpath = "//*[@id=\"resource_menu\"]/ul/li[1]/a/span[2]")
    @CacheLookup
    WebElement Resourceschedule;

    //..............Wait........

    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/div[1]/div[2]/a")
    @CacheLookup
    WebElement ResourceCreateBtn;

    @FindBy(xpath = "//*[@id=\"firstname\"]")
    @CacheLookup
    WebElement firstName;

    @FindBy(xpath = "//*[@id=\"lastname\"]")
    @CacheLookup
    WebElement lastName;

    @FindBy(xpath = "//*[@id=\"email\"]")
    @CacheLookup
    WebElement email;

    @FindBy(xpath = "//*[@id=\"phone\"]")
    @CacheLookup
    WebElement phoneNumber;

    //.........scroll to view.......
    //*[@id="Engineer_next_of_kin"]

    @FindBy(xpath = "//*[@id=\"staff_id\"]")
    @CacheLookup
    WebElement staffId;

    @FindBy(xpath = "//*[@id=\"job_title\"]")
    @CacheLookup
    WebElement jobTitle;

    @FindBy(xpath = "//*[@id=\"Users_profile_picture\"]")
    @CacheLookup
    WebElement imageFile;


    @FindBy(xpath = "//*[@id=\"Engineer_next_of_kin\"]")
    @CacheLookup
    WebElement nextofkins;

    @FindBy(xpath = "//*[@id=\"Engineer_next_of_kin_phone\"]")
    @CacheLookup
    WebElement nextofkinsPhone;

    //............scroll to view..........
    //*[@id="Engineer_city"]


    @FindBy(xpath = "//*[@id=\"Engineer_address1\"]")
    @CacheLookup
    WebElement address1;

    @FindBy(xpath = "//*[@id=\"Engineer_address2\"]")
    @CacheLookup
    WebElement address2;

    @FindBy(xpath = "//*[@id=\"Engineer_city\"]")
    @CacheLookup
    WebElement city;

    //............Select State........
    @FindBy(xpath = "//*[@id=\"Engineer_state\"]")
    @CacheLookup
    WebElement state;

    @FindBy(xpath = "//*[@id=\"Engineer_date_joined\"]")
    @CacheLookup
    WebElement datejoin;

    @FindBy(xpath = "/html/body/div[5]/div[1]/table/tbody/tr[4]/td[5]")
    @CacheLookup
    WebElement datepicker;

    //........click out......

    @FindBy(xpath = "//*[@id=\"content\"]/div")
    @CacheLookup
    WebElement clickout;

    //select resource type............
    @FindBy(xpath = "//*[@id=\"Engineer_eng_type\"]")
    @CacheLookup
    WebElement resourceType;

    //.......resourceType option.............
    @FindBy(xpath = "//*[@id=\"Engineer_eng_type\"]/option[11]")
    @CacheLookup
    WebElement resourceTypeOpt;

    //..............scroll to view.........
    //*[@id="bank-form"]/div[19]/div/div/button/span[1]


    @FindBy(xpath = "//*[@id=\"Engineer_eng_level\"]")
    @CacheLookup
    WebElement resourceLevel;

    @FindBy(xpath = "//*[@id=\"Engineer_eng_level\"]/option[3]")
    @CacheLookup
    WebElement resourceLevelOpt;

    @FindBy(xpath = "//*[@id=\"Engineer_eng_schedule\"]")
    @CacheLookup
    WebElement resourceSchedule;

    @FindBy(xpath = "//*[@id=\"Engineer_eng_schedule\"]/option[4]")
    @CacheLookup
    WebElement resourceScheduleOpt;

    @FindBy(xpath = "//*[@id=\"bank-form\"]/div[19]/div/div/button/span[1]")
    @CacheLookup
    WebElement department;

    @FindBy(xpath = "//*[@id=\"bank-form\"]/div[19]/div/div/div/ul/li[5]/a/span[1]")
    @CacheLookup
    WebElement departmentOpt;


    @FindBy(xpath = "//*[@id=\"bank-form\"]/div[20]/div/input")
    @CacheLookup
    WebElement createBtn;


    public void ResourceMenuSel(){ResourceMenu.click();}

    public void ResourceScheduleMenu(){Resourceschedule.click();}

    public void ResourceCreate(){ResourceCreateBtn.click();}

    public void FirstNameEntry(String firstname){firstName.sendKeys(firstname);}

    public void LastNameEntry(String lastname){lastName.sendKeys(lastname);}

    public void EmailEntry(String Email){email.sendKeys(Email);}

    public void PhoneNumberEntry(String phonenumb){phoneNumber.sendKeys(phonenumb);}

    public void StaffIDEntry(String staffid){staffId.sendKeys(staffid);}

    public void JobTitleEntry(String jobtitle){jobTitle.sendKeys(jobtitle);}

    public void ImageSel(String projectPath){imageFile.sendKeys(projectPath + "\\Image_file\\broken_screen.png");}

    public void NOKEntry(String nok){nextofkins.sendKeys(nok);}

    public void NOKPhoneEntry(String nokphone){nextofkinsPhone.sendKeys(nokphone);}

    public void Address1(String add1){address1.sendKeys(add1);}

    public void Address2(String add2){address2.sendKeys(add2);}

    public void CityEntry(String City){city.sendKeys(City);}

    public void DateJoined(){datejoin.click();}

    public void DatePicker(){datepicker.click();}

    public void PageCickOut(){clickout.click();}

    public void ResouceType(){resourceType.click();}

    public void ResouceTypeOpt(){resourceTypeOpt.click();}

    public void ResouceLevel(){resourceLevel.click();}

    public void ResouceLevelOpt(){resourceLevelOpt.click();}

    public void ResouceSchedule(){resourceSchedule.click();}

    public void ResouceScheduleOPT(){resourceScheduleOpt.click();}

    public void ResourceDepart(){department.click();}

    public void ResourceDepartOPT(){departmentOpt.click();}

    public void ResourceDepartcCreateBtn(){createBtn.click();}
















}
