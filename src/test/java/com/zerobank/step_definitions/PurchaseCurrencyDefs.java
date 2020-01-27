package com.zerobank.step_definitions;

import com.zerobank.pages.PayBill;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;

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

    @When("user tries to calculate cost without selection a currency")
    public void user_tries_to_calculate_cost_without_selection_a_currency() {

        PayBill payBill = new PayBill();
        BrowserUtils.waitFor(3);
        payBill.costCalc.click();

    }

    @Then("the error message {string} should be seen")
    public void the_error_message_should_be_seen(String expMsg) {

        Alert alert = Driver.get().switchTo().alert();
        String actMsg = alert.getText();

        Assert.assertEquals(expMsg,actMsg );

    }

    @When("user tries to calculate cost without entering value")
    public void user_tries_to_calculate_cost_without_entering_value() {
        PayBill payBill = new PayBill();
        BrowserUtils.waitFor(3);
        payBill.costCalc.click();
    }

}
