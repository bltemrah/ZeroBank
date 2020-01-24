package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PayBill {

    public PayBill () {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy (xpath = "//title")
    public WebElement payBillTitle;

    /**
     * @return page name, for example: Dashboard
     */
    public String getPageSubTitle() {
        //ant time we are verifying page name, or page subtitle, loader mask appears

        BrowserUtils.waitForStaleElement(payBillTitle);
        return payBillTitle.getText();
    }
}
