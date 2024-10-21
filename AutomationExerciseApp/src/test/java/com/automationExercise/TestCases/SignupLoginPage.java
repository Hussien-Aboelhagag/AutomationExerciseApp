package com.automationExercise.TestCases;

import Pages.HomePage;
import Pages.LoginSignUpPage;
import org.testng.annotations.Test;

public class SignupLoginPage extends TestBase{
    HomePage homePage;
    LoginSignUpPage signUpPage;
    @Test
    public void testSignUpFieldSuccessfully(){
        homePage=new HomePage(driver);
        homePage.openRegisterLinkElement();
        signUpPage=new LoginSignUpPage(driver);
        signUpPage.chooseSignupButtonSteps("hussien","hussien74424@gmail.com");
    }
}
