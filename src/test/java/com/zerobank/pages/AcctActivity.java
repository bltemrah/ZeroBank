package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AcctActivity {

    public AcctActivity () {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy (xpath = "//title")
    public WebElement pageTitle;

    @FindBy (css = "#aa_accountId>option")
    public List<WebElement> acctOption;

    @FindBy (css = "#aa_accountId>option:nth-of-type(1)")
    public WebElement deafultAcctOption;

    public Select repeatOptionsList(){

        return new Select(deafultAcctOption);
    }

    @FindBy (css = "a[href^='#ui-tabs-2']")
    public WebElement transButton;

    @FindBy (xpath = "(//div[@class = 'board-content'])[2]//div//label[@class = 'control-label']")
    public List<WebElement> transactionTable;


    @FindBy (css = "#aa_type")
    public WebElement transTypes;

    public Select transTypes(){

        return new Select(transTypes);
    }

    @FindBy (css = "#aa_accountId")
    public WebElement accountType;


    @FindBy (css = "#aa_accountId>option")
    public List<WebElement> actType;






}
