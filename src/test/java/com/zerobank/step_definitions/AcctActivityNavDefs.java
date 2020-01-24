package com.zerobank.step_definitions;

import com.zerobank.pages.AcctActivity;
import com.zerobank.pages.AcctSummary;
import com.zerobank.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

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

        //Assert.assertEquals(expDropDown, defaultItem);

    }

}
