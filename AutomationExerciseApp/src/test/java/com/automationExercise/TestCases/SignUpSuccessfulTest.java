package com.automationExercise.TestCases;

import Pages.SignUpSuccessfulPage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class SignUpSuccessfulTest extends TestBase{
    SignUpSuccessfulPage successfulPage;
    @Test
    public void checkSuccessMsgAfterSignUp(){
        successfulPage=new SignUpSuccessfulPage(driver);
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(successfulPage.SuccessMsg1.getText(),
                "Congratulations! Your new account has been successfully created!");
        softAssert.assertEquals(successfulPage.SuccessMsg2.getText(),
                "You can now take advantage of member privileges to enhance your online shopping experience with us.");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        successfulPage.continueBtn.click();
        softAssert.assertAll();
    }
}
