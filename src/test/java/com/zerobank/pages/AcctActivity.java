package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class AcctActivity {

    public AcctActivity() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//title")
    public WebElement pageTitle;

    @FindBy(css = "#aa_accountId>option")
    public List<WebElement> acctOption;

    @FindBy(css = "#aa_accountId>option:nth-of-type(1)")
    public WebElement deafultAcctOption;

    public Select repeatOptionsList() {

        return new Select(deafultAcctOption);
    }

    @FindBy(css = "a[href^='#ui-tabs-2']")
    public WebElement transButton;

    @FindBy(xpath = "(//div[@class = 'board-content'])[2]//div//label[@class = 'control-label']")
    public List<WebElement> transactionTable;

    @FindBy(css = "#aa_type")
    public WebElement transTypes;

    public Select transTypes() {

        return new Select(transTypes);
    }

    @FindBy(css = "#aa_accountId")
    public WebElement accountType;

    @FindBy(css = "#aa_accountId>option")
    public List<WebElement> actType;

    @FindBy(css = "#aa_accountId")
    public WebElement accountBrokerType;

    @FindBy(css = "#aa_accountId")
    public WebElement showTrans;

    @FindBy(xpath = "//a[@href = '#ui-tabs-2']")
    public WebElement findTransaction;

    @FindBy(css = "#aa_fromDate")
    public WebElement fromDate;

    @FindBy(css = "#aa_toDate")
    public WebElement toDate;

    @FindBy(css = "button[type='submit']")
    public WebElement findButton;

    @FindBy(xpath = "//div[@id ='filtered_transactions_for_account']//td[1]")
    public List<WebElement> dateRange;

    public List<String> dRange() {

        List<WebElement> drange = Driver.get().findElements(By.xpath("(//tbody)[2]//td[1]"));

        List<String> dRange = new ArrayList<>();

        for (WebElement each : drange) {
            dRange.add(each.getAttribute("innerHTML"));
        }
        return dRange;
    }

    @FindBy(css = "#aa_description")
    public WebElement description;


    @FindBy(xpath = "//div[@id ='filtered_transactions_for_account']//td[2]")
    public List<WebElement> descriptionTable;

    public List<String> dTable() {

        List<WebElement> dtable = Driver.get().findElements(By.xpath("//div[@id ='filtered_transactions_for_account']//td[2]"));

        List<String> dTable = new ArrayList<>();

        for (WebElement each : dtable) {
            dTable.add(each.getAttribute("value"));
        }
        return dTable;
    }

    @FindBy(xpath = "//div[@id ='filtered_transactions_for_account']//td[3]")
    public List<WebElement> depositColumn;

    @FindBy(xpath = "//div[@id ='filtered_transactions_for_account']//td[4]")
    public List<WebElement> withdrawColumn;

    @FindBy(css = "#aa_type")
    public WebElement typeOptions;









}
