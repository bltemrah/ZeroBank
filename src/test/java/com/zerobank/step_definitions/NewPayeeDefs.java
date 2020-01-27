package com.zerobank.step_definitions;

import com.zerobank.pages.BasePage;
import com.zerobank.pages.PayBill;
import com.zerobank.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.Map;

public class NewPayeeDefs {

    @Given("Go to Pay Bills module")
    public void go_to_Pay_Bills_module() {
        BasePage basePage = new BasePage();
        BrowserUtils.waitFor(3);
        basePage.payBills.click();
    }

    @Given("Add New Payee tab")
    public void add_New_Payee_tab() {

        PayBill payBill = new PayBill();
        payBill.addNewPay.click();


    }

    @Given("creates new payee using following information")
    public void creates_new_payee_using_following_information(Map<String, String> userData) {

        PayBill payBill = new PayBill();
        BrowserUtils.waitFor(2);
        payBill.payName.sendKeys(userData.get("Payee Name"));
        payBill.payAddress.sendKeys(userData.get("Payee Address"));
        payBill.payAcct.sendKeys(userData.get("Account"));
        payBill.payDetails.sendKeys(userData.get("Payee details"));
        BrowserUtils.waitFor(2);
    }

    @Then("user click the add button")
    public void user_click_the_add_button() {
        PayBill payBill = new PayBill();
        payBill.addButton.click();
    }

    @Then("message {string}")
    public void message(String expMsg) {
        PayBill payBill = new PayBill();
        BrowserUtils.waitFor(2);
        String actMsg = payBill.message.getAttribute("innerHTML");

        System.out.println(actMsg);
        Assert.assertEquals(expMsg, actMsg);


    }

}
