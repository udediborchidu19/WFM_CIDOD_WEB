package com.cicodWFM.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.cicodWFM.testCases.BaseClass.driver;

public class CreateTicketPage {

    WebDriver ldriver;

    public CreateTicketPage(WebDriver rdriver) {
        ldriver=rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(xpath = "//*[@id=\"tickets_menu\"]/ul/li[1]/a")
    @CacheLookup
    WebElement createticketBtn;

    @FindBy(xpath="//*[@id=\"__next\"]/div/main/div[2]/section/div/div/div[1]/div[2]/div[4]/a/div[1]")
    @CacheLookup
    WebElement applicationpgg;

    @FindBy(name = "queue_id")
    @CacheLookup
    WebElement queueType;

    @FindBy(xpath = "//*[@id=\"queue_id\"]/option[4]")
    @CacheLookup
    WebElement queueType2;

    @FindBy(xpath = "//*[@id=\"queue_type_id\"]/option[2]")
    @CacheLookup
    WebElement vas;

    @FindBy(xpath = "//*[@id=\"queue_type_id\"]")
    @CacheLookup
    WebElement queueType3;

    @FindBy(xpath = "//*[@id=\"queue_type_id\"]/option[2]")
    @CacheLookup
    WebElement queueType4;

    @FindBy(name = "summary")
    @CacheLookup
    WebElement title;

    @FindBy(id="WorkOrder_description")
    @CacheLookup
    WebElement description;

    @FindBy(xpath = "//*[@id=\"additionalField\"]/div/div/div/div[1]/input")
    @CacheLookup
    WebElement custTitle;

    @FindBy(xpath = "//*[@id=\"additionalField\"]/div/div/div/div[2]/input")
    @CacheLookup
    WebElement firstName;


    @FindBy(xpath = "//*[@id=\"additionalField\"]/div/div/div/div[3]/input")
    @CacheLookup
    WebElement lastName;


    @FindBy(xpath = "//*[@id=\"additionalField\"]/div/div/div/div[4]/input")
    @CacheLookup
    WebElement phoneNumber;


    @FindBy(xpath = "//*[@id=\"additionalField\"]/div/div/div/div[5]/input")
    @CacheLookup
    WebElement email;

    @FindBy(xpath = "//*[@id=\"ticket-form\"]/div[5]/div/input")
    @CacheLookup
    WebElement createTicketButton;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/main/div[2]/section/div/div/div[1]/div[2]/div[4]/a")
    @CacheLookup
    WebElement srollToview2;


    public void CreateTicketsPage(){createticketBtn.click();}

    public void SCrollView2(){((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",srollToview2);}


    public void SelQueueType(){queueType.click();}

    public void QueueTypeOpt(){queueType2.click();}

    public void QueueTypeOpt1(){queueType3.click();}

    public void QueueTypeOpt2(){queueType4.click();}

    public void ApplicationPgf(){ applicationpgg.click();}

    public void Tile(String title1){ title.sendKeys(title1);}

    public void Description(String descriiptn){description.sendKeys(descriiptn);}

    public void CustomerTitle(String title){custTitle.sendKeys(title);}

    public void FirstName(String firstname){firstName.sendKeys(firstname);}

    public void LatName(String lastname){lastName.sendKeys(lastname);}

//    public void Value(){ vas.click();}

    public void PhoneNumber(String phonenumber){phoneNumber.sendKeys(phonenumber);}

    public void Emailid(String cemailid){ email.sendKeys(cemailid);}

    public void CreateBtn(){createTicketButton.click();}

    public void Wait() throws InterruptedException {Thread.sleep(3000);}





}
