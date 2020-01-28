package com.zerobank.step_definitions;

import com.zerobank.pages.AcctActivity;
import com.zerobank.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.ArrayList;

public class TransactionStepDefs {

    @When("the user enters date from {string} to {string}")
    public void the_user_enters_date_from_to(String fD, String tD) {

        AcctActivity acctActivity = new AcctActivity();
        BrowserUtils.waitFor(3);
        acctActivity.fromDate.sendKeys(fD);
        acctActivity.toDate.sendKeys(tD);

    }

    @Then("results table should only show transactions date from {string} to {string}")
    public void results_table_should_only_show_transactions_date_from_to(String fDate, String eDate) {
        AcctActivity acctActivity = new AcctActivity();
        BrowserUtils.waitFor(2);
        ArrayList<String> dRange = (ArrayList<String>) BrowserUtils.getElementsAttribute(acctActivity.dateRange);
        System.out.println("dRange = " + dRange);
        ArrayList<String> dRange1 = new ArrayList<>();
        ArrayList<Integer> dRange2 = new ArrayList<>();

    }

    @Then("the results should be sorted by most recent date")
    public void the_results_should_be_sorted_by_most_recent_date() {

    }

    @When("the user enters date range from {string} to {string}")
    public void the_user_enters_date_range_from_to(String string, String string2) {

    }

    @Then("the user should only see the results between {string} and {string}")
    public void the_user_should_only_see_the_results_between_and(String string, String string2) {

    }

    @Then("the results table should NOT contain transactions dated {string}")
    public void the_results_table_should_NOT_contain_transactions_dated(String string) {

    }

}
