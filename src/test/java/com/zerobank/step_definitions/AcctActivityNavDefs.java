package com.zerobank.step_definitions;

import com.zerobank.pages.AcctActivity;
import com.zerobank.pages.AcctSummary;
import com.zerobank.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AcctActivityNavDefs {

    @When("the user clicks on Saving link on the Cash Account under Account Summary page")
    public void the_user_clicks_on_Saving_link_on_the_Cash_Account_under_Account_Summary_page() {
        AcctSummary acctSummary = new AcctSummary();
        acctSummary.savings.click();
    }

    @Then("the page should be displayed {string}")
    public void the_page_should_be_displayed(String expTitle) {

        BrowserUtils.waitFor(2);
        AcctActivity acctActivity1 = new AcctActivity();
        BrowserUtils.waitFor(2);
        String actTitle = acctActivity1.pageTitle.getAttribute("innerHTML");
        BrowserUtils.waitFor(2);

        Assert.assertEquals(expTitle, actTitle);

    }

    @Then("Account drop down menu should shows {string}")
    public void account_drop_down_menu_should_shows(String expDropDown) {

        AcctActivity acctActivity = new AcctActivity();
        BrowserUtils.waitFor(5);
//        Select select = new Select(acctActivity.accountType);
//        WebElement option = select.getFirstSelectedOption();
//        BrowserUtils.waitFor(5);
//        String defaultItem = option.getText();
//        System.out.println(defaultItem );

        List<String> actDropDown = BrowserUtils.getElementsAttribute(acctActivity.actType);
        String defaultItem = actDropDown.get(0);
        System.out.println(defaultItem);

        Assert.assertEquals(expDropDown, defaultItem);
    }

    @When("the user clicks on Brokerage link on the Investment Account under Account Summary page")
    public void the_user_clicks_on_Brokerage_link_on_the_Investment_Account_under_Account_Summary_page() {
        AcctSummary acctSummary = new AcctSummary();
        acctSummary.brokerage.click();

    }

    @Then("Account drop down should have {string} selected")
    public void account_drop_down_should_have_selected(String expType) {
        AcctActivity acctActivity = new AcctActivity();
        BrowserUtils.waitFor(2);
        Select select = new Select(acctActivity.accountBrokerType);
        WebElement options = select.getFirstSelectedOption();
        BrowserUtils.waitFor(2);
        String defaultItem = options.getText();

        Assert.assertEquals(expType, defaultItem);

    }

    @When("the user clicks on Checking link on the Credit Account under Account Summary page")
    public void the_user_clicks_on_Checking_link_on_the_Credit_Account_under_Account_Summary_page() {
        AcctSummary acctSummary = new AcctSummary();
        acctSummary.checking.click();
    }

    @Then("Credit Account should have {string} under show transaction account")
    public void credit_Account_should_have_under_show_transaction_account(String expDefaultType) {

        AcctActivity acctActivity = new AcctActivity();
        BrowserUtils.waitFor(3);
        Select select = new Select(acctActivity.showTrans);
        WebElement options = select.getFirstSelectedOption();
        BrowserUtils.waitFor(3);
        String acctType = options.getText();

        Assert.assertEquals(expDefaultType, acctType);

    }

    @When("the user clicks on Credit Card link on the Credit Account under Account Summary page")
    public void the_user_clicks_on_Credit_Card_link_on_the_Credit_Account_under_Account_Summary_page() {
        AcctSummary acctSummary = new AcctSummary();
        acctSummary.creditCard.click();
    }

    @Then("Credit Account should have {string} as default option")
    public void credit_Account_should_have_as_default_option(String expType) {

        AcctActivity acctActivity = new AcctActivity();
        BrowserUtils.waitFor(3);
        Select select = new Select(acctActivity.showTrans);
        WebElement options = select.getFirstSelectedOption();
        BrowserUtils.waitFor(3);
        String acctType = options.getText();

        Assert.assertEquals(expType, acctType);
    }

    @When("the user clicks on Loan link on the Loan Account under Account Summary page")
    public void the_user_clicks_on_Loan_link_on_the_Loan_Account_under_Account_Summary_page() {
        AcctSummary acctSummary = new AcctSummary();
        acctSummary.loan.click();
    }

    @Then("Loan Account should have {string} as default option")
    public void loan_Account_should_have_as_default_option(String expType) {


        AcctActivity acctActivity = new AcctActivity();
        BrowserUtils.waitFor(3);
        Select select = new Select(acctActivity.showTrans);
        WebElement options = select.getFirstSelectedOption();
        BrowserUtils.waitFor(3);
        String acctType = options.getText();

        Assert.assertEquals(expType, acctType);

    }
}