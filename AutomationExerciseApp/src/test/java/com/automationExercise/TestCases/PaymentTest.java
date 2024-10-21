package com.automationExercise.TestCases;

import Pages.PaymentPage;
import org.testng.annotations.Test;

public class PaymentTest extends TestBase{
    PaymentPage paymentPage;
    @Test
    public void userEnterCard(){
        paymentPage=new PaymentPage(driver);
        paymentPage.userPayment("Hussein Ali","2020154875","373","02",
                "2028");
    }
}
