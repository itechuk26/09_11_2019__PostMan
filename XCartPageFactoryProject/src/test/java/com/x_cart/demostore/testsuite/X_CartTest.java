package com.x_cart.demostore.testsuite;

import com.x_cart.demostore.pages.*;
import com.x_cart.demostore.testbase.TestBase;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by : Divyesh Patel
 * since : Tuesday  12/11/2019
 * Time  : 11:26
 **/

public class X_CartTest extends TestBase {

    @Test
    public void userSholdNavigateToBrownBootsItem() {
        Homepage homepage = new Homepage();
        SignInPage signInPage = new SignInPage();
        NewAccountPage newAcPage = new NewAccountPage();
        SignInPage signinpage = new SignInPage();
        HotDealPage hotDealPage = new HotDealPage();
        SalePage salepage = new SalePage();



        homepage.clickOnSigninLink();
        signInPage.clickOnCreateNewAccount();

        newAcPage.enterEmailAddress();
        newAcPage.enterPassword();
        newAcPage.enterConfirmPassword();
        newAcPage.clickOnCreateButton();

        hotDealPage.clickOnSalePage();
        salepage.clickOnLightBrownShoe();

        Assert.assertEquals("Lace-Up Boots in Light Brown", salepage.lace_upBootsText());

    }
}
