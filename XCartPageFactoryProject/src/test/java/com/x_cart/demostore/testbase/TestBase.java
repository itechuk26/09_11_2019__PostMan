package com.x_cart.demostore.testbase;


import com.x_cart.demostore.basepage.BasePage;
import com.x_cart.demostore.browserselector.BrowserSelector;
import com.x_cart.demostore.loadproperty.LoadProperty;
import org.junit.After;
import org.junit.Before;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class TestBase extends BasePage {


    String browser = new LoadProperty().getProperty("browser");
    BrowserSelector browserSelector = new BrowserSelector();

    @Before
    public void setUp() {
        browserSelector.selectBrowser(browser);
    }

    @After
    public void closeDown() {
        driver.quit();
    }
}
