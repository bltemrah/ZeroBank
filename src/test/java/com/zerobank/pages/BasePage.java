package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage () {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy (css = "#account_summary_tab>a")
    public WebElement acctSummary;

    @FindBy (xpath = "//a[. ='Account Activity']")
    public WebElement acctActivity;

    @FindBy (xpath = "//a[. ='Transfer Funds']")
    public WebElement transferFund;

    @FindBy (xpath = "//a[. ='Pay Bills']")
    public WebElement payBills;

    @FindBy (xpath = "//a[. ='My Money Map']")
    public WebElement myMoneyMap;

    @FindBy (xpath = "//a[. ='Online Statements']")
    public WebElement onlineStatements;

    @FindBy (xpath = "(//a[@* = 'dropdown-toggle'])[1]")
    public WebElement setting;

    @FindBy (xpath = "(//a[@* = 'dropdown-toggle'])[2]")
    public WebElement Myprofile;

}
