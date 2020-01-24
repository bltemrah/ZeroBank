package com.zerobank.step_definitions;

import com.zerobank.pages.BasePage;
import com.zerobank.pages.PayBill;
import com.zerobank.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

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

}
