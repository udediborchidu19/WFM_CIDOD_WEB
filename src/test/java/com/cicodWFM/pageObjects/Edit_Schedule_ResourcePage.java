package com.cicodWFM.pageObjects;

import com.cicodWFM.testCases.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Edit_Schedule_ResourcePage extends BaseClass {

    WebDriver ldriver;

    public Edit_Schedule_ResourcePage(WebDriver rdriver) {
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

    //click on more button
    @FindBy(xpath = "//*[@id=\"dLabel\"]/img")
    @CacheLookup
    WebElement SchedulemoreBtn;

    //click on create button
    @FindBy(xpath = "/html/body/ul/li[3]/a")
    @CacheLookup
    WebElement  ResourceUpdate;

    ///////////////////////////////////

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

    //*[@id="bank-form"]/div[19]/div/div/button/span[1]
    @FindBy(xpath = "//*[@id=\"content\"]/div")
    @CacheLookup
    WebElement clickout;

    //*[@id="bank-form"]/div[19]/div/div/button/span[1]
    @FindBy(xpath = "//*[@id=\"bank-form\"]/div[19]/div/div/button/span[1]")
    @CacheLookup
    WebElement clickout1;

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

    @FindBy(xpath = "//*[@id=\"myModal2\"]/div[2]/div/div/div")
    @CacheLookup
    WebElement successmessage;







    public void ResourceMenuSel(){ResourceMenu.click();}

    public void ResourceScheduleMenu(){Resourceschedule.click();}

    public void ClickMoreBtn(){SchedulemoreBtn.click();}

    public void ResourceUPdate(){ResourceUpdate.click();}

    public void FirstNameUpdate(){
        firstName.clear();
        String firstname = randomestring();
        firstName.sendKeys(firstname);}

    public void LastNameUpdate(){
        lastName.clear();
        String lastname = randomestring();
        lastName.sendKeys(lastname);}

    public void EmailUpdate(){

        email.clear();
        String Email = randomestring() + "@gmail.com";
        email.sendKeys(Email);}

    public void Scrollview2() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", nextofkins);
    }

    public void PhoneNumberUpdate(){
        phoneNumber.clear();
        String Phonenumber = "0801" + randomeNumber();
        phoneNumber.sendKeys(Phonenumber);}

    public void StaffIDUpdate(){

        staffId.clear();
        String staffID =  randomeNum();
        staffId.sendKeys(staffID);}

    public void JobTitleUpdate(){

        jobTitle.clear();
        String JobTitle =  randomestring();
        jobTitle.sendKeys(JobTitle);}

    public void ImageSel(){
        String projectPath = System.getProperty("user.dir");
        imageFile.sendKeys(projectPath + "\\Image_file\\broken_screen.png");}

    public void NOKUpdate(){
        nextofkins.clear();
        String nok =  randomestring();
        nextofkins.sendKeys(nok);}



    public void Scrollview3() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", city);
    }

    public void NOKPhoneUpdate(){

        nextofkinsPhone.clear();
        String nokPhone =  randomestring();
        nextofkinsPhone.sendKeys(nokPhone);}

    public void AddressUpdate(){

        address1.clear();
        String Address =  randomestring();
        address1.sendKeys(Address);}

    public void Address2(){
        address2.clear();
        String Address1 =  randomestring();
        address2.sendKeys(Address1);}

    public void CityUpdate(){
        city.clear();
        String City =  randomestring();
        city.sendKeys(City);}


    public void Scrollview4() throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", datejoin);

        Thread.sleep(3000);
    }

    public void DateJoined(){datejoin.click();}

    public void DatePicker(){datepicker.click();}

    public void PageCickOut(){clickout.click();}

    public void PageCickOut1(){clickout1.click();}

    public void ResouceType(){resourceType.click();}

    public void ResouceTypeOpt(){resourceTypeOpt.click();}

    public void ResouceLevel(){resourceLevel.click();}

    public void ResouceLevelOpt(){resourceLevelOpt.click();}

    public void ResouceSchedule(){resourceSchedule.click();}

    public void ResouceScheduleOPT(){resourceScheduleOpt.click();}

    public void ResourceDepart(){department.click();}

    public void ResourceDepartOPT(){departmentOpt.click();}

    public void ResourceDepartcUpdateBtn(){createBtn.click();}

    public boolean SuccessMessagee() {
        if (successmessage.isDisplayed()) return true;
        else return false;


    }


}
