package com.automationExercise.TestCases;

import Pages.HomePageAfterRegister;
import org.testng.annotations.Test;

public class LogOutTest extends TestBase {
    HomePageAfterRegister loginPage;
    @Test
    public void logoutTest(){
        loginPage=new HomePageAfterRegister(driver);
        loginPage.userLogout();

    }
}
