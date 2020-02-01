package com.zerobank.step_definitions;

import com.zerobank.pages.BasePage;
import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyMoneyMapStepDefs {

    @Given("the user enters the valid credential for login")
    public void the_user_enters_the_valid_credential_for_login() {
        LoginPage loginPage = new LoginPage();
        String uName = ConfigurationReader.get("username");
        String pWord = ConfigurationReader.get("password");
        BrowserUtils.waitFor(3);
        loginPage.userName.sendKeys(uName);
        loginPage.password.sendKeys(pWord);
        loginPage.submit.click();

    }

    @When("the user click to My Money Map tab")
    public void the_user_click_to_My_Money_Map_tab() {

        BasePage basePage = new BasePage();
        BrowserUtils.waitFor(2);
        basePage.myMoneyMap.click();

    }

    @Then("the user should be able to see {string} on the chart")
    public void the_user_should_be_able_to_see_on_the_chart(String string) {

    }
}
