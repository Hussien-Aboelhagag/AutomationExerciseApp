package com.automationExercise.TestCases;

import Pages.HomePageAfterRegister;
import Pages.SearchPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTest extends TestBase{
    String productName="Sleeveless Unicorn Print Fit & Flare Net Dress - Multi";
    SearchPage searchObject;
    HomePageAfterRegister homePageAfterRegisterObject;
    @Test
    public void UserCanSearchWithProduct(){
        homePageAfterRegisterObject=new HomePageAfterRegister(driver);
        homePageAfterRegisterObject.clickProductsBtn();
        searchObject=new SearchPage(driver);
        searchObject.searchWithProduct(productName);
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div/div[1]/div[1]/img"))
                .isDisplayed());
        Assert.assertEquals(driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div/div[1]/div[1]/h2")).getText(),
                "Rs. 1100");
    }
}
