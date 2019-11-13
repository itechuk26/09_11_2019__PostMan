package com.x_cart.demostore.pages;

import com.x_cart.demostore.Utility.Util;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by : Divyesh Patel
 * since : Tuesday  12/11/2019
 * Time  : 11:17
 **/

public class SalePage extends Util {

    @FindBy(xpath = "//a[contains(text(),'Lace-Up Boots in Light Brown')]")
    WebElement _lightBrownShoe;

    @FindBy(xpath = "//h1[@class='fn title']")
    WebElement _lightBrowmBootText;

    public void clickOnLightBrownShoe()
    {
        clickOnElement(_lightBrownShoe);
    }

    public String lace_upBootsText()
    {
        return getTextFromElement(_lightBrowmBootText);
    }

}
