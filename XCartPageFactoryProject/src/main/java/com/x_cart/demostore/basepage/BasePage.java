package com.x_cart.demostore.basepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by : Divyesh Patel
 * since : Sunday  10/11/2019
 * Time  : 14:47
 **/

public class BasePage {
    public static WebDriver driver;

    public BasePage() {
        PageFactory.initElements(driver,this);
    }
}
