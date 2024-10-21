package com.automationExercise.TestCases;

import Uitilities.Helper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import java.io.IOException;

public class TestBase {
    public static WebDriver driver;
    Helper helper=new Helper();
    @BeforeSuite
    @Parameters({"browser"})
    public void setDriver(String browserName){
        if (browserName.equalsIgnoreCase("chrome")){
            driver= new ChromeDriver(helper.chromeOptions());
        }
        else if (browserName.equalsIgnoreCase("firefox")){
            driver= new FirefoxDriver();
        }
        else if (browserName.equalsIgnoreCase("msedge")){
            driver= new EdgeDriver();
        }

        driver.manage().window().maximize();
        driver.navigate().to("https://automationexercise.com/");
    }


    @AfterSuite
    public void closeDriver(){
        driver.quit();
    }
    //Take screenshot after fail after every method
    @AfterMethod
    public void captureScreenshotAfterFail(ITestResult result) throws IOException {
        if (ITestResult.FAILURE==result.getStatus()){
            System.out.println("Failed!");
            System.out.println("Take Screenshot.......");
            Helper.captureScreenshot(driver,result.getName());
        }
    }
}
