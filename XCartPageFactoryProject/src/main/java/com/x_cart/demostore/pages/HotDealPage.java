package com.x_cart.demostore.pages;

import com.x_cart.demostore.Utility.Util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;

/**
 * Created by : Divyesh Patel
 * since : Sunday  10/11/2019
 * Time  : 17:25
 **/

public class HotDealPage extends Util {

    @FindBy(xpath = "//ul[@class='nav navbar-nav top-main-menu']//span[@class='primary-title'][contains(text(),'Hot deals')]")
    WebElement _hotDealsHooverMenu;

    @FindBy(xpath = "//li[@class='leaf has-sub']//span[contains(text(),'Sale')]")
    WebElement _salepage;

    public void clickOnSalePage() {
        WebDriverWait wait = new WebDriverWait(driver, 30);

        Actions action = new Actions(driver);
        wait.until(ExpectedConditions.elementToBeClickable(_hotDealsHooverMenu));

        action.moveToElement(_hotDealsHooverMenu).build().perform();
        clickOnElement(_hotDealsHooverMenu);
        clickOnElement(_salepage);
    }
}
