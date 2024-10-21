package com.automationExercise.TestCases;

import Pages.ContactUsPage;
import Pages.HomePageAfterRegister;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class ContactUsTest extends TestBase{
    HomePageAfterRegister homePageAfterRegisterObject;
    ContactUsPage contactUsObject;
    @Test(priority = 1)
    public void UserContactUs(){
        homePageAfterRegisterObject=new HomePageAfterRegister(driver);
        homePageAfterRegisterObject.clickContactusBtn();
        String filename="screenshotsUserLoginWithValidData.png";
        String filepath="E:\\Practical Automation\\practical_Moatez\\AutomationExerciseApp\\AutomationExerciseApp\\Upload\\"+filename;
        contactUsObject=new ContactUsPage(driver);
        contactUsObject.contactUsSteps(filepath,"hussein","hussien@gmail.com",
                "i wanna fight this developers about this shit page");
        Assert.assertEquals(contactUsObject.successMsgOfContactUs.getText(),
                "Success! Your details have been submitted successfully.");
    }
    @Test(priority = 2)
    public void UserReturnToHomePage(){
        WebElement homepageBt=driver.findElement(By.xpath("//a[@class='btn btn-success']"));
        homepageBt.click();
        WebElement homeCssValue=driver.findElement(By.xpath("//a[@href='/' and @style='color: orange;']"));
        Assert.assertEquals(homeCssValue.getCssValue("color"), "rgba(255, 165, 0, 1)");
    }
}
