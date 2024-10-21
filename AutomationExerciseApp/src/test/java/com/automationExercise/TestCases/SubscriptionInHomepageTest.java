package com.automationExercise.TestCases;
import Pages.HomePageAfterRegister;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SubscriptionInHomepageTest extends TestBase{
    HomePageAfterRegister homePageAfterRegisterObject;

    @Test
    public void UserSubscriptionInHomePage(){
        homePageAfterRegisterObject=new HomePageAfterRegister(driver);
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("scrollBy(0,3000)");
        homePageAfterRegisterObject.SubscriptionSteps("hussien@gmail.com");
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(homePageAfterRegisterObject.subscriptionMsg.isDisplayed());
        softAssert.assertEquals(homePageAfterRegisterObject.subscriptionMsg.getText(),
                "You have been successfully subscribed!");
        softAssert.assertAll();
    }
}
