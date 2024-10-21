package com.automationExercise.TestCases;

import Pages.HomePageAfterRegister;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DeleteAccountTest extends TestBase{

    HomePageAfterRegister deleteAccount;
    @Test
    public void DeleteAccount(){
        deleteAccount=new HomePageAfterRegister(driver);
        deleteAccount.clickDeleteAccountBtn();
        //WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement deleteAccountElementMsg1= driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/p[1]"));
        WebElement deleteAccountElementMsg2= driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/p[2]"));
        //wait.until(ExpectedConditions.presenceOfElementLocated((By) deleteAccountElementMsg1));
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(deleteAccountElementMsg1.getText(),"Your account has been permanently deleted!");
        softAssert.assertTrue(deleteAccountElementMsg2.getText().contains("You can create new account to take advantage"));
        softAssert.assertAll();
    }
}
