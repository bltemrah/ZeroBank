package com.zerobank.step_definitions;

import com.zerobank.pages.AccountSum;
import com.zerobank.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class AccountSumStepDefs {

    @When("the user have account summary page")
    public void the_user_have_account_summary_page() {


    }

    @Then("the user should be able to see following options")
    public void the_user_should_be_able_to_see_following_options(List<String> acctTypes) {

        System.out.println("Account types: " + acctTypes);

        BrowserUtils.waitFor(2);
        AccountSum accountSum = new AccountSum();
        List<String> actualAcctTypes = BrowserUtils.getElementsText(accountSum.accountType);
        System.out.println(actualAcctTypes);
        Assert.assertEquals(acctTypes, actualAcctTypes);

    }

    @Then("the user should be able to see following tables")
    public void the_user_should_be_able_to_see_following_tables(List<String> CrdAcctTable) {
        System.out.println("Credit account Table: " + CrdAcctTable);

        BrowserUtils.waitFor(5);
        AccountSum accountSum = new AccountSum();

        List<String> actCrdTable = BrowserUtils.getElementsAttribute(accountSum.CredAcctTable);

        Assert.assertEquals(CrdAcctTable, actCrdTable);

    }

}
