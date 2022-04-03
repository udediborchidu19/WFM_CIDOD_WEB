package com.cicodWFM.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReportPage {

    WebDriver ldriver;

    public ReportPage(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(xpath="//*[@id=\"reports_menu\"]/a/span[2]")
    @CacheLookup
    WebElement reportMenu;

    @FindBy(xpath="//*[@id=\"queue_id\"]")
    @CacheLookup
    WebElement reportQueue;

    @FindBy(xpath="//*[@id=\"queue_id\"]/option[4]")
    @CacheLookup
    WebElement reportQueueOpt;

    @FindBy(xpath="//*[@id=\"queue_type_id\"]")
    @CacheLookup
    WebElement reportQueueType;

    @FindBy(xpath="//*[@id=\"queue_type_id\"]/option[2]")
    @CacheLookup
    WebElement reportQueueTypeOpt;


    @FindBy(xpath="//*[@id=\"status_id\"]")
    @CacheLookup
    WebElement reportStatusid;

    @FindBy(xpath="//*[@id=\"status_id\"]/option[4]")
    @CacheLookup
    WebElement reportStatusIdOpt;

    @FindBy(xpath="//*[@id=\"reportDateRnge\"]")
    @CacheLookup
    WebElement reportStatusDateRangeClick;

    @FindBy(xpath="/html/body/div[5]/div[1]/div/div/div[1]/button[1]")
    @CacheLookup
    WebElement reportStatusbackArr;

    @FindBy(xpath="/html/body/div[5]/div[1]/div/div/div[3]/div[2]")
    @CacheLookup
    WebElement reportStatDatePicker;

    @FindBy(xpath="/html/body/div[5]/div[1]/div/div/div[3]/div[2]")
    @CacheLookup
    WebElement reportStatDatePicker1;

    @FindBy(xpath="/html/body/div[5]/div[1]/div/div/div[1]/button[2]")
    @CacheLookup
    WebElement reportStatusfowrdArr;


//    @FindBy(xpath="/html/body/div[5]/div[1]/div/div/div[3]/div[2]")
//    @CacheLookup
//    WebElement reportStatDatePicker1;

    @FindBy(xpath="/html/body/div[5]/div[1]/div/div/div[3]/div[18]")
    @CacheLookup
    WebElement reportStatDatePicker2;

    @FindBy(xpath="//*[@id=\"generate-report-form\"]/div/div[1]/div[6]/button[2]")
   @CacheLookup
   WebElement reportCreate;

    @FindBy(xpath="//*[@id=\"resultTableBody\"]/tr[1]/td[4]")
    @CacheLookup
    WebElement getValue;

    public void ReportMenu(){reportMenu.click();}

    public void ReportQueue(){reportQueue.click();}

    public void ReportQueueOpt(){reportQueueOpt.click();}

    public void ReportQueueType(){reportQueueType.click();}

    public void ReportQueueTypeOpt(){reportQueueTypeOpt.click();}

    public void ReportStatusID(){reportStatusid.click();}

    public void ReportStatusIDOpt(){reportStatusIdOpt.click();}

    public void ReportStatusDateRange(){reportStatusDateRangeClick.click();}

    public void ReportStatusBackArr(){reportStatusbackArr.click();}

    public void ReportStatusDate(){reportStatDatePicker.click();}

    public void ReportStatusDatePicker1(){reportStatDatePicker1.click();}

    public void ReportStatusfowardArr(){reportStatusfowrdArr.click();}

    public void ReportStatusDatePIck(){reportStatDatePicker2.click();}

    public void ReportCreateBtn(){reportCreate.click();}

//    public void ReportCreateBt(){getValue.getText();}






}
