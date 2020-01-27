package com.zerobank.step_definitions;

import com.zerobank.pages.PayBill;
import com.zerobank.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class PurchaseCurrencyDefs {

    @Given("click Purchase Foreign Currency")
    public void click_Purchase_Foreign_Currency() {

        PayBill payBill = new PayBill();
        BrowserUtils.waitFor(2);
        payBill.currency.click();

    }

    @Then("Following currencies should be available")
    public void following_currencies_should_be_available(List<String> expCurList) {
        PayBill payBill = new PayBill();
        BrowserUtils.waitFor(3);
        List<String> actualAcctTypes = BrowserUtils.getElementsAttribute(payBill.currencyList);
        Assert.assertTrue(actualAcctTypes.containsAll(expCurList));

    }
}
