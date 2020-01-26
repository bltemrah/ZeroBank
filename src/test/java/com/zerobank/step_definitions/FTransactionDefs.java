package com.zerobank.step_definitions;

import com.zerobank.pages.AcctActivity;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

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

        for (int i = 0; i < creditT.size(); i++) {
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


        for (int i = 0; i < creditT.size(); i++) {
            Assert.assertTrue(creditT.get(i).contains(expDesc));
        }

    }

    @Then("results table should not display transfer containing {string}")
    public void results_table_should_not_display_transfer_containing(String expDesc) {

        BrowserUtils.waitFor(3);
        AcctActivity acctActivity = new AcctActivity();
        List<String> creditT = BrowserUtils.getElementsAttribute(acctActivity.descriptionTable);


        for (int i = 0; i < creditT.size(); i++) {
            Assert.assertFalse(creditT.get(i).contains(expDesc));
        }
    }


    @When("the user write {string} as a description")
    public void the_user_write_as_a_description(String desc) {
        Driver.get().navigate().refresh();

        BrowserUtils.waitFor(3);
        AcctActivity acctActivity = new AcctActivity();
        acctActivity.findTransaction.click();
        BrowserUtils.waitFor(3);
        acctActivity.description.sendKeys(desc);
        BrowserUtils.waitFor(3);
    }

    @Then("result table should only show transfer containing {string}")
    public void result_table_should_only_show_transfer_containing(String expDesc) {

        AcctActivity acctActivity = new AcctActivity();
        BrowserUtils.waitFor(3);
        List<String> creditT = BrowserUtils.getElementsAttribute(acctActivity.descriptionTable);
        System.out.println(creditT);

        for (int i = 0; i < creditT.size(); i++) {
            Assert.assertTrue(creditT.get(i).contains(expDesc));
        }

    }

    @Then("results table should show at least {int} result under Deposit")
    public void results_table_should_show_at_least_result_under_Deposit(Integer expRes) {

        AcctActivity acctActivity = new AcctActivity();
        BrowserUtils.waitFor(3);
        List<String> creditT = BrowserUtils.getElementsAttribute(acctActivity.depositColumn);
        Integer listSize = creditT.size();
        System.out.println("listSize = " + listSize);
        Assert.assertTrue(listSize >= 1);

    }

    @Then("results table should show at least {int} result under Withdrawal")
    public void results_table_should_show_at_least_result_under_Withdrawal(Integer int1) {

        AcctActivity acctActivity = new AcctActivity();
        BrowserUtils.waitFor(3);
        List<String> creditT = BrowserUtils.getElementsAttribute(acctActivity.withdrawColumn);
        Integer listSize = creditT.size();
        System.out.println("listSize = " + listSize);
        Assert.assertTrue(listSize >= 1);

    }


    @When("user selects type {string}")
    public void user_selects_type(String sType) {

        AcctActivity acctActivity = new AcctActivity();
        BrowserUtils.waitFor(2);
        Select select = new Select(acctActivity.typeOptions);
        select.selectByIndex(1);

    }

    @Then("results table should show no result under Withdrawal")
    public void results_table_should_show_no_result_under_Withdrawal() {

        AcctActivity acctActivity = new AcctActivity();
        BrowserUtils.waitFor(3);
        List<String> creditT = BrowserUtils.getElementsAttribute(acctActivity.withdrawColumn);
        Integer listSize = creditT.size();
        System.out.println("listSize = " + listSize);
        for (int i =0; i<creditT.size(); i++) {
            Assert.assertTrue(creditT.get(i).isEmpty());

        }
    }

    @When("user selects {string}")
    public void user_selects(String string) {

        AcctActivity acctActivity = new AcctActivity();
        BrowserUtils.waitFor(2);
        Select select = new Select(acctActivity.typeOptions);
        select.selectByIndex(2);

        acctActivity.findButton.click();


    }


    @Then("results tbale should show no result under Deposit")
    public void results_tbale_should_show_no_result_under_Deposit() {

        AcctActivity acctActivity = new AcctActivity();
        BrowserUtils.waitFor(3);
        List<String> creditT = BrowserUtils.getElementsAttribute(acctActivity.depositColumn);
        Integer listSize = creditT.size();
        System.out.println("listSize = " + listSize);
        for (int i =0; i<creditT.size(); i++) {
            Assert.assertTrue(creditT.get(i).isEmpty());

        }

    }







}
