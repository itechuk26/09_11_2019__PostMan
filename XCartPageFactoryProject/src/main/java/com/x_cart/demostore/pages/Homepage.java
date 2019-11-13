package com.x_cart.demostore.pages;

import com.x_cart.demostore.Utility.Util;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by : Divyesh Patel
 * since : Sunday  10/11/2019
 * Time  : 15:41
 **/

public class Homepage extends Util {

    @FindBy(xpath = "//div[contains(@class,'header_bar-sign_in')]//span[contains(text(),'Sign in / sign up')]")
    WebElement _Signinlink;

    public void clickOnSigninLink()
    {
        clickOnElement(_Signinlink);
    }
}
