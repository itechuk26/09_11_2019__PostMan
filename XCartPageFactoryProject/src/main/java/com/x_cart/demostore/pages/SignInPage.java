package com.x_cart.demostore.pages;

import com.x_cart.demostore.Utility.Util;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by : Divyesh Patel
 * since : Sunday  10/11/2019
 * Time  : 16:11
 **/

public class SignInPage extends Util {

    @FindBy(xpath = "//a[@class='popup-button default-popup-button create-account-link']")
    WebElement _createNewAccount;

    public void clickOnCreateNewAccount()
    {
        clickOnElement(_createNewAccount);
    }
}
