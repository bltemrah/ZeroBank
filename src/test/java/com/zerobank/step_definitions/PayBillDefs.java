package com.zerobank.step_definitions;

import com.zerobank.pages.BasePage;
import com.zerobank.pages.PayBill;
import com.zerobank.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class PayBillDefs {


    @When("the user click to {string}")
    public void the_user_click_to(String string) {

        BasePage basePage = new BasePage();
        basePage.payBills.click();
    }

    @Then("the user should be able to see {string} as title")
    public void the_user_should_be_able_to_see_as_title(String expTitle) {

        BrowserUtils.waitFor(2);
        PayBill payBill = new PayBill();
        BrowserUtils.waitFor(2);
        String actTitle = payBill.payBillTitle.getAttribute("innerHTML");
        BrowserUtils.waitFor(2);

        Assert.assertEquals(expTitle, actTitle);

        //Assert.assertEquals(Driver.get().getTitle(), expTitle);
    }

    @When("the user complete successfully a payment operation")
    public void the_user_complete_successfully_a_payment_operation() {

        PayBill payBill = new PayBill();
        Select select = new Select(payBill.selectPayee);
        select.selectByVisibleText("Bank of America");

        Select select1 = new Select((payBill.selectPayAccount));
        select1.selectByIndex(5);

        payBill.selectPayAmount.sendKeys("100");

        payBill.selectPayDate.sendKeys("10102020");

        payBill.selectPayDesc.sendKeys("For your expenses");

        payBill.payButton.click();

    }

    @Then("the user should be able to see {string} as message")
    public void the_user_should_be_able_to_see_as_message(String expMsg) {

        PayBill payBill = new PayBill();
        BrowserUtils.waitFor(3);
        String actMsg = payBill.payMsg.getText();

        Assert.assertEquals(expMsg, actMsg);
    }

    @When("the user does not enter the amount or data")
    public void the_user_does_not_enter_the_amount_or_data() {
        PayBill payBill = new PayBill();
        BrowserUtils.waitFor(3);
        Select select = new Select(payBill.selectPayee);
        select.selectByVisibleText("Bank of America");

        Select select1 = new Select((payBill.selectPayAccount));
        select1.selectByIndex(5);
        payBill.payButton.click();
    }

    @Then("the user should be able to see the message {string}")
    public void the_user_should_be_able_to_see_the_message(String expMsg) {
        PayBill payBill = new PayBill();
        String actMsg = payBill.selectPayAmount.getAttribute("validationMessage");

        Assert.assertEquals("Verify the message as expected", expMsg, actMsg);
    }

    @When("the user enter the amount with alphabetical characters")
    public void the_user_enter_the_amount_with_alphabetical_characters() {
        PayBill payBill = new PayBill();
        BrowserUtils.waitFor(3);
        Select select = new Select(payBill.selectPayee);
        select.selectByVisibleText("Bank of America");

        Select select1 = new Select((payBill.selectPayAccount));
        select1.selectByIndex(5);

        payBill.selectPayAmount.sendKeys("Hundred");
        payBill.selectPayDate.sendKeys("10102020");
        payBill.payButton.click();
    }

    @Then("the user should not be able to see the message {string}")
    public void the_user_should_not_be_able_to_see_the_message(String expMsg) {

        PayBill payBill = new PayBill();
        BrowserUtils.waitFor(3);
        String actMsg = payBill.payMsg.getText();
        payBill.payButton.click();
        Assert.assertNotEquals("Verify that user should not be able to pay with alphabetical amount", expMsg, actMsg);

    }


}
