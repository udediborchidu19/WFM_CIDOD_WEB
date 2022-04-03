package com.cicodWFM.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResourceShiftPage {

    WebDriver ldriver;

    public ResourceShiftPage(WebDriver rdriver) {
        ldriver=rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(xpath = "//*[@id=\"resource_menu\"]/a/span[2]")
    @CacheLookup
    WebElement ResourceMenu;



    @FindBy(xpath = "//*[@id=\"resource_menu\"]/ul/li[4]/a/span[2]")
    @CacheLookup
    WebElement Resourceshift;

    //..............Wait........

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[1]/div[2]/a")
    @CacheLookup
    WebElement ResourceShiftBtn;

    @FindBy(xpath = "//*[@id=\"EngineerShift_name\"]")
    @CacheLookup
    WebElement ResourceShiftname;


    @FindBy(xpath = "//*[@id=\"EngineerShift_shift_color\"]")
    @CacheLookup
    WebElement ResourceShiftcolor;


    @FindBy(xpath = "/html/body/div[5]/div[1]/i/b")
    @CacheLookup
    WebElement colorselection;

    @FindBy(xpath = "//*[@id=\"content\"]/div")
    @CacheLookup
    WebElement clickout;


    @FindBy(xpath = "//*[@id=\"EngineerShift_start_time\"]")
    @CacheLookup
    WebElement startTime;

    @FindBy(xpath = "/html/body/div[6]/table/tbody/tr[3]/td[1]/a/i")
    @CacheLookup
    WebElement startTimeArrowdown;

    @FindBy(xpath = "/html/body/div[6]/table/tbody/tr[2]/td[1]/input")
    @CacheLookup
    WebElement startTimeSel;

    @FindBy(xpath = "//*[@id=\"content\"]/div")
    @CacheLookup
    WebElement clickout1;

    @FindBy(xpath = "//*[@id=\"EngineerShift_end_time\"]")
    @CacheLookup
    WebElement endtimeup;

    @FindBy(xpath = "/html/body/div[6]/table/tbody/tr[1]/td[1]/a/i")
    @CacheLookup
    WebElement endtimeArrUpwards;

    @FindBy(xpath = "//*[@id=\"content\"]/div")
    @CacheLookup
    WebElement clickout2;

    @FindBy(xpath = "//*[@id=\"bank-form\"]/div[6]/div/input")
    @CacheLookup
    WebElement click_Create;


    public void ResourceMenu(){ResourceMenu.click();}

    public void ResourceSchedule(){Resourceshift.click();}

    public void ResourceShiftBtn(){ResourceShiftBtn.click();}

    public void ResourceShiftName(String name){ResourceShiftname.sendKeys(name);}

    public void ResourceShiftColor(){ResourceShiftcolor.click();}

    public void ColorSelection(){colorselection.click();}

    public void ClickOut(){clickout.click();}

    public void StartTime(){startTime.click();}

    public void ArrowDown(){startTimeArrowdown.click();}

    public void StartTimeSel(){startTimeSel.click();}

    public void ClickOut1(){clickout1.click();}

    public void ClickUpwards(){endtimeup.click();}

    public void ArrowUpwards(){endtimeArrUpwards.click();}

    public void ClickOut2(){clickout2.click();}

    public void ClickCreate(){click_Create.click();}

























}
