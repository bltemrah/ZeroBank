package com.zerobank.step_definitions;

import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
    }

    @When("the user enter {string} {string}")
    public void the_user_enter(String username, String password) {
        LoginPage loginPage = new LoginPage();
        loginPage.login(username, password);

    }

    @Then("the user should be able to see {string}")
    public void the_user_should_be_able_to_see(String expectedTitle) {

        Assert.assertEquals(Driver.get().getTitle(), expectedTitle);


    }

    @Then("the error message should be {string}")
    public void the_error_message_should_be(String expectedMsg) {
        LoginPage loginPage = new LoginPage();
        String errorMsg = loginPage.errorMsg.getText();

        Assert.assertEquals(errorMsg, expectedMsg);
    }





}
