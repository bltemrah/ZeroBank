package com.zerobank.pages;

import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {


        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy (css = "[name ='user_login']")
    public WebElement userName;

    @FindBy (css = "[name='user_password']")
    public WebElement password;

    @FindBy (css = "[name='submit']")
    public WebElement submit;

    @FindBy (css = "[class = 'alert alert-error']")
    public WebElement errorMsg;

    public void login (String userNameStr, String passwordStr) {

        userName.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        submit.click();

    }
    public void navigateToLoginPage(){
        Driver.get().get(ConfigurationReader.get("url"));
    }
}
