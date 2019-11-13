package com.x_cart.demostore.loadproperty;

import com.x_cart.demostore.basepage.BasePage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by : Divyesh Patel
 * since : Sunday  10/11/2019
 * Time  : 14:56
 **/

public class LoadProperty extends BasePage {

    static Properties prop;

    static FileInputStream input;

    String projectPath = System.getProperty("user.dir");

    public String getProperty(String key) {
        prop = new Properties();

        try {
            input = new FileInputStream(projectPath + "\\src\\test\\java\\com\\x_cart\\demostore\\resources\\propertiesfile\\config.properties");
            prop.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop.getProperty(key);
    }
}
