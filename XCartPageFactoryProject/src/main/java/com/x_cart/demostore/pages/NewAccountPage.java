package com.x_cart.demostore.pages;

import com.x_cart.demostore.Utility.Util;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by : Divyesh Patel
 * since : Sunday  10/11/2019
 * Time  : 16:21
 **/

public class NewAccountPage extends Util {

    @FindBy(id = "login")
    WebElement _loginfield;

    @FindBy(id = "password")
    WebElement _passwordfield;

    @FindBy(id = "password-conf")
    WebElement _confirmpasswordfield;

    @FindBy(xpath = "//div[contains(@class,'button submit')]//button[contains(@class,'submit')]")
    WebElement _createButton;

    public void enterEmailAddress()
    {
        String randomEmail = "Jay" + generateRandomNumber() + "@gmail.com";
        sendTextToElement(_loginfield,randomEmail);
    }

    public void enterPassword()
    {
        sendTextToElement(_passwordfield,"AlmrYr4681");
    }

    public void enterConfirmPassword()
    {
        sendTextToElement(_confirmpasswordfield,"AlmrYr4681");
    }

    public void clickOnCreateButton()
    {
        clickOnElement(_createButton);
    }
}
