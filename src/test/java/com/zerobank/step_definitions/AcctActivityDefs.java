package com.zerobank.step_definitions;

import com.zerobank.pages.AcctActivity;
import com.zerobank.pages.BasePage;
import com.zerobank.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AcctActivityDefs {

    @When("the user navigate to {string}")
    public void the_user_navigate_to(String tab) {

        new BasePage().acctActivity.click();

    }

    @Then("the user shoould be able to see {string}")
    public void the_user_shoould_be_able_to_see(String expDefOption) {

        AcctActivity acctActivity = new AcctActivity();

        String actDefOpt = acctActivity.deafultAcctOption.getText();

        Assert.assertEquals(actDefOpt, expDefOption);

    }

    @Then("the user should be able to see the following drop down options")
    public void the_user_should_be_able_to_see_the_following_drop_down_options(List<String> dDownOpt) {

        System.out.println("Account drop down: " + dDownOpt);
        BrowserUtils.waitFor(5);

        AcctActivity acctActivity = new AcctActivity();
        List<String> actDropDown = BrowserUtils.getElementsAttribute(acctActivity.acctOption);

        //List<WebElement> actDropDown = acctActivity.repeatOptionsList().getOptions();
        //get text of each webelement and return as a list of String
        //List<String> actualList = BrowserUtils.getElementsAttribute(actDropDown);

        Assert.assertEquals("Verify the drop down options", dDownOpt, actDropDown);

    }
    @When("click to {string}")
    public void click_to(String string) {
        AcctActivity acctActivity = new AcctActivity();
        acctActivity.transButton.click();
    }
    @Then("the user should be able to see the following column")
    public void the_user_should_be_able_to_see_the_following_column(List<String> expTransTable) {
        System.out.println(expTransTable);
        BrowserUtils.waitFor(5);
        AcctActivity acctActivity = new AcctActivity();
        List<String> actTables = BrowserUtils.getElementsAttribute(acctActivity.transactionTable);

        Assert.assertEquals(expTransTable, actTables);
    }

    @Then("the user should be able to see the following transaction type")
    public void the_user_should_be_able_to_see_the_following_transaction_type(List<String> expTypes) {

        BrowserUtils.waitFor(2);
        AcctActivity acctActivity = new AcctActivity();

        //List with Select tag and its method
        List<WebElement> actTransTypes = acctActivity.transTypes().getOptions();
        //get text of each webelement and return as a list of String
        List<String> actualTypes = BrowserUtils.getElementsAttribute(actTransTypes);

        Assert.assertEquals(expTypes, actualTypes);

    }
}
