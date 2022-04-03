package com.cicodWFM.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WorkFlowPage {

    WebDriver ldriver;

    public WorkFlowPage(WebDriver rdriver) {
        ldriver=rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(xpath = "//*[@id=\"workflows_menu\"]/a/span[2]")
    @CacheLookup
    WebElement workflowMenu;

    @FindBy(xpath = "//*[@id=\"workflows_menu\"]/ul/li[1]/a/span[2]")
    @CacheLookup
    WebElement createWorkflow;

    @FindBy(id = "selectQueue")
    @CacheLookup
    WebElement selQueue;

    @FindBy(xpath= "//*[@id=\"queues\"]/li[2]")
    @CacheLookup
    WebElement QueOps;

    @FindBy(id = "selectQueueType")
    @CacheLookup
    WebElement selQueueOption;

    @FindBy(xpath = "//*[@id=\"queue-types\"]/li[2]")
    @CacheLookup
    WebElement selectstatus1;
    //*[@id="queue-types"]/li[1]

    @FindBy(xpath = "//*[@id=\"selectStatus\"]")
    @CacheLookup
    WebElement createnewstats;

    @FindBy(xpath = "//*[@id=\"selectStatusActions\"]/a")
    @CacheLookup
    WebElement StatusAction;

    @FindBy(name = "name")
    @CacheLookup
    WebElement uname;

    @FindBy(xpath = "//*[@id=\"modal\"]/div[2]/div/div[2]/form/div[2]/textarea")
    @CacheLookup
    WebElement desc;

    @FindBy(id = "saveQueueType")
    @CacheLookup
    WebElement saveQueTypBtn;

    @FindBy(xpath = "//*[@id=\"confirm\"]")
    @CacheLookup
    WebElement confirmation;

    @FindBy(xpath = "//*[@id=\"fieldsTray\"]/button[1]")
    @CacheLookup
    WebElement textField;

    @FindBy(xpath = "//*[@id=\"defualtFieldSummary\"]/input")
    @CacheLookup
    WebElement title;

    @FindBy(xpath = "//*[@id=\"defualtFieldDescription\"]/textarea")
    @CacheLookup
    WebElement textArea;

    @FindBy(xpath = "/html/body/div[4]/div[2]/div[4]/div/div/div/div[2]/div[1]/div[3]/div[2]/div/div/div[2]/div[2]/div[4]/button[2]")
    @CacheLookup
    WebElement custFF;



    @FindBy(xpath = "/html/body/div[4]/div[2]/div[4]/div/div/div/div[2]/div[1]/div[3]/div[3]/div/div/div[2]/div[2]/div[2]/a[2]")
    @CacheLookup
    WebElement escalaNxtBtn;


    @FindBy(xpath = "//*[@id=\"approval\"]/div/div/div[2]/div[2]/div[2]/button")
    @CacheLookup
    WebElement finishBtn;


    public void WorkFlowMenuDropdown(){ workflowMenu.click();}

    public void CreateTicketMenu(){ createWorkflow.click();}

    public void SelectQueue(){ selQueue.click();}

    public void SelQue(){QueOps.click();}

    public void SelectQueueOptn(){ selQueueOption.click();}

    public void SelectQueOpps(){selectstatus1.click();}

    public void CreateNewStatus(){ createnewstats.click();}

    public void StatusesAction(){StatusAction.click();}

    public void CreateStatus(String name){ uname.sendKeys(name);}

    public void Descriptionn(String description){ desc.sendKeys(description);}

    public void saveQueTypButton(){ saveQueTypBtn.click();}

    public void ConfirmBtn(){ confirmation.click();}

    public void Title(String titlee){ title.sendKeys(titlee);}

    public void TextAreaa(String textField){ textArea.sendKeys(textField);}

    public void CustomerFormFieldBtn(){ custFF.click();}

    public void EsacalationBtn(){ escalaNxtBtn.click();}

    public void FinishBtnn(){ finishBtn.click();}




}
