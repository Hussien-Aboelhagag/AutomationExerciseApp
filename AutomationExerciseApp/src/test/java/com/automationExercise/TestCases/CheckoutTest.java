package com.automationExercise.TestCases;

import Pages.CheckoutPage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CheckoutTest extends TestBase{
    CheckoutPage checkoutPage;
    @Test
    public void RegisteredUserCheckout(){
        checkoutPage=new CheckoutPage(driver);
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(checkoutPage.totalPrice.getText(),"Rs. 1500");
        softAssert.assertTrue(checkoutPage.usernameInCheckout.getText().contains("hussein"));
        softAssert.assertEquals(checkoutPage.userAddressInCheckout.getText(),"NAsr City");
        softAssert.assertAll();
        checkoutPage.userCheckout("test comment");
    }
}
