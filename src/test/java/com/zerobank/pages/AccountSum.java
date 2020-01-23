package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AccountSum {

    public AccountSum() {

        PageFactory.initElements(Driver.get(), this);

    }

    @FindBy(css = "[class = 'offset2 span8']>h2")
    public List<WebElement> accountType;


}