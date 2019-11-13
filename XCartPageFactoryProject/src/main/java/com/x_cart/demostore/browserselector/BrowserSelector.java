package com.x_cart.demostore.browserselector;

import com.x_cart.demostore.basepage.BasePage;
import com.x_cart.demostore.loadproperty.LoadProperty;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by : Divyesh Patel
 * since : Sunday  10/11/2019
 * Time  : 14:50
 **/

public class BrowserSelector extends BasePage {

    String baseUrl = new LoadProperty().getProperty("baseurl");
    String projectPath = System.getProperty("user.dir");

    public void selectBrowser(String browser) {

        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver",projectPath+ "/drivers/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get(baseUrl);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver",projectPath+ "/drivers/geckodriver.exe");
            driver = new FirefoxDriver();
            driver.get(baseUrl);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        } else if (browser.equalsIgnoreCase("ie")) {
            System.setProperty("webdriver.EdgeDriver",projectPath+ "/drivers/MicrosoftWebDriver.exe");
            driver = new EdgeDriver();
            driver.get(baseUrl);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        } else
            System.out.println("Wrong browser");
    }
}
