package com.zerobank.step_definitions;

import com.zerobank.pages.AcctActivity;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class FTransactionDefs {

    @When("the user accesses to Find Transactions")
    public void the_user_accesses_to_Find_Transactions() {

        BrowserUtils.waitFor(2);
        AcctActivity acctActivity = new AcctActivity();
        acctActivity.findTransaction.click();
    }

    @When("the user enters description {string}")
    public void the_user_enters_description(String desc) {
        BrowserUtils.waitFor(3);
        AcctActivity acctActivity = new AcctActivity();
        acctActivity.description.sendKeys(desc);
    }

    @When("clicks Find")
    public void clicks_Find() {
        BrowserUtils.waitFor(3);
        AcctActivity acctActivity = new AcctActivity();
        acctActivity.findButton.click();

    }

    @Then("result table should only show transfer containing {string} under Description column")
    public void result_table_should_only_show_transfer_containing_under_Description_column(String expDesc) {

        AcctActivity acctActivity = new AcctActivity();
        BrowserUtils.waitFor(3);
        List<String> creditT = BrowserUtils.getElementsAttribute(acctActivity.descriptionTable);
        System.out.println(creditT);

        for (int i=0; i<creditT.size();i++) {
            Assert.assertTrue(creditT.get(i).contains(expDesc));
        }
    }

    @When("the user enters {string} as a description")
    public void the_user_enters_as_a_description(String desc) {
        Driver.get().navigate().refresh();

        BrowserUtils.waitFor(3);
        AcctActivity acctActivity = new AcctActivity();
        acctActivity.findTransaction.click();
        BrowserUtils.waitFor(3);
        acctActivity.description.sendKeys(desc);

    }


    @Then("results table should only display transfer containing {string}")
    public void results_table_should_only_display_transfer_containing(String expDesc) {
        BrowserUtils.waitFor(3);
        AcctActivity acctActivity = new AcctActivity();
        List<String> creditT = BrowserUtils.getElementsAttribute(acctActivity.descriptionTable);
        System.out.println(creditT);

        for (int i=0; i<creditT.size();i++) {
            Assert.assertTrue(creditT.get(i).contains(expDesc));
        }

    }

    @Then("results table should not display transfer containing {string}")
    public void results_table_should_not_display_transfer_containing(String expDesc) {

        BrowserUtils.waitFor(3);
        AcctActivity acctActivity = new AcctActivity();
        List<String> creditT = BrowserUtils.getElementsAttribute(acctActivity.descriptionTable);
        System.out.println(creditT);

        for (int i=0; i<creditT.size();i++) {
            Assert.assertFalse(creditT.get(i).contains(expDesc));
        }
    }



}
