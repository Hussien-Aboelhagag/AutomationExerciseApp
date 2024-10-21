package com.automationExercise.TestCases;

import Pages.PlaceOrderPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PlaceOrderTest extends TestBase{
    PlaceOrderPage orderPage;
    @Test
    public void userCanDownloadInvoices(){
        orderPage=new PlaceOrderPage(driver);
        Assert.assertEquals(orderPage.PaymentMsg.getText(),"Congratulations! Your order has been confirmed!");
        orderPage.userDownloadInvoices();
    }
}
