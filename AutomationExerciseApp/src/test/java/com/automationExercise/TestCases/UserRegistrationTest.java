package com.automationExercise.TestCases;

import Pages.UserRegistrationPage;
import org.testng.annotations.Test;

public class UserRegistrationTest extends TestBase {
    UserRegistrationPage userRegistration;
    @Test
    public void UserRegistrationSuccessfully(){
        userRegistration=new UserRegistrationPage(driver);
        userRegistration.userRegistrationSteps("123456","hussein","Ali",
                "Naser City","Singapore","Cairo","Cairo"
                ,"123456","011111122");
    }
}
