package com.cicodWFM.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResourceSchedulePage {

    WebDriver ldriver;

    public ResourceSchedulePage(WebDriver rdriver) {
        ldriver=rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(xpath = "//*[@id=\"resource_menu\"]/a/span[2]")
    @CacheLookup
    WebElement ResourceMenu;

    @FindBy(xpath = "//*[@id=\"resource_menu\"]/ul/li[5]/a/span[2]")
    @CacheLookup
    WebElement Resourceschedule;

    //..............Wait........

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[1]/div[2]/a")
    @CacheLookup
    WebElement ResourceCreateBtn;

    @FindBy(xpath = "//*[@id=\"EngineerSchedule_name\"]")
    @CacheLookup
    WebElement Schedulename;

    @FindBy(xpath = "//*[@id=\"EngineerSchedule_monday\"]")
    @CacheLookup
    WebElement SchedulemondayClick;


    @FindBy(xpath = "//*[@id=\"EngineerSchedule_monday\"]/option[2]")
    @CacheLookup
    WebElement schedulemondayOpt;


    @FindBy(xpath = "//*[@id=\"EngineerSchedule_tuesday\"]")
    @CacheLookup
    WebElement ScheduletuesdayClick;


    @FindBy(xpath = "//*[@id=\"EngineerSchedule_tuesday\"]/option[2]")
    @CacheLookup
    WebElement scheduletuesdayOpt;


    @FindBy(xpath = "//*[@id=\"EngineerSchedule_wednesday\"]")
    @CacheLookup
    WebElement SchedulewednesdayClick;


    @FindBy(xpath = "//*[@id=\"EngineerSchedule_wednesday\"]/option[3]")
    @CacheLookup
    WebElement SchedulewednesdayOpt;

    @FindBy(xpath = "//*[@id=\"EngineerSchedule_thursday\"]")
    @CacheLookup
    WebElement SchedulethursdayClick;


    @FindBy(xpath = "//*[@id=\"EngineerSchedule_thursday\"]/option[3]")
    @CacheLookup
    WebElement SchedulethursdayOpt;


    @FindBy(xpath = "//*[@id=\"EngineerSchedule_friday\"]")
    @CacheLookup
    WebElement SchedulefridayClick;


    @FindBy(xpath = "//*[@id=\"EngineerSchedule_friday\"]/option[4]")
    @CacheLookup
    WebElement ScheduletfridayOpt;


    @FindBy(xpath = "//*[@id=\"EngineerSchedule_saturday\"]")
    @CacheLookup
    WebElement SchedulesaturdayClick;


    @FindBy(xpath = "//*[@id=\"EngineerSchedule_saturday\"]/option[4]")
    @CacheLookup
    WebElement ScheduletsaturdayOpt;


    @FindBy(xpath = "//*[@id=\"EngineerSchedule_sunday\"]")
    @CacheLookup
    WebElement SchedulesundayClick;


    @FindBy(xpath = "//*[@id=\"EngineerSchedule_sunday\"]/option[4]")
    @CacheLookup
    WebElement ScheduletsundayOpt;

    @FindBy(xpath = "//*[@id=\"bank-form\"]/div[10]/div/input")
    @CacheLookup
    WebElement ScheduleCreateBtn;



    public void ResourceMenu(){ResourceMenu.click();}

    public void ResourceSenu(){Resourceschedule.click();}

    public void ResourceCreatBtn(){ResourceCreateBtn.click();}

    public void ResourceName(String name){Schedulename.sendKeys(name);}

    public void ResourceMondayClick(){SchedulemondayClick.click();}

    public void ScheduleMonday(){schedulemondayOpt.click();}

    public void ScheduleTuesday(){ScheduletuesdayClick.click();}

    public void ScheduleTuesdayOpt(){scheduletuesdayOpt.click();}

    public void ScheduleWednesday(){SchedulewednesdayClick.click();}

    public void ScheduleWednesdayOpt(){SchedulewednesdayOpt.click();}

    public void ScheduleThursday(){SchedulethursdayClick.click();}

    public void ScheduleThursdayOpt(){SchedulethursdayOpt.click();}

    public void ScheduleFriday(){SchedulefridayClick.click();}

    public void ScheduleFridayOpt(){ScheduletfridayOpt.click();}

    public void ScheduleSaturday(){SchedulesaturdayClick.click();}

    public void ScheduleSaturdayOpt(){ScheduletsaturdayOpt.click();}


    public void ScheduleSunday(){SchedulesundayClick.click();}

    public void ScheduleSundayOpt(){ScheduletsundayOpt.click();}

    public void ScheduleCreate(){ScheduleCreateBtn.click();}







}
