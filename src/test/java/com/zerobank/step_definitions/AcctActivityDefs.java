package com.zerobank.step_definitions;

import com.zerobank.pages.AcctActivity;
import com.zerobank.pages.BasePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AcctActivityDefs {

    @When("navigate to {string}")
    public void navigate_to(String tab) {

        new BasePage().acctActivity.click();

    }

    @Then("the user shoould be able to see {string}")
    public void the_user_shoould_be_able_to_see(String expDefOption) {

        AcctActivity acctActivity = new AcctActivity();

        String actDefOpt = acctActivity.deafultAcctOption.getText();

        Assert.assertEquals(actDefOpt, expDefOption);



    }
}
