package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AcctActivity {

    public AcctActivity () {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy (css = "#aa_accountId>option")
    public List<WebElement> acctOption;

    @FindBy (css = "#aa_accountId>option:nth-of-type(1)")
    public WebElement deafultAcctOption;



}
