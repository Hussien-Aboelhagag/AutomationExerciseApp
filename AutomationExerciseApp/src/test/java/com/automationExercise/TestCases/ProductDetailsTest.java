package com.automationExercise.TestCases;

import Pages.HomePageAfterRegister;
import Pages.SearchPage;
import Pages.productDetailsPage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;


public class ProductDetailsTest extends TestBase{
    HomePageAfterRegister homePageAfterRegister;
    SearchPage searchPage;
    productDetailsPage detailsPage;

    @Test(priority = 1)
    public void userReviewProduct(){
        homePageAfterRegister=new HomePageAfterRegister(driver);
        homePageAfterRegister.clickProductsBtn();
        searchPage=new SearchPage(driver);
        searchPage.searchWithProduct("Sleeveless Unicorn Print Fit & Flare Net Dress - Multi");
        JavascriptExecutor jse= (JavascriptExecutor) driver;
        jse.executeScript("scrollBy(0,500)");
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href=\"/product_details/23\"]")));
        WebElement viewProductBtn= driver.findElement(By.xpath("//a[@href=\"/product_details/23\"]"));
        viewProductBtn.click();
        // searchPage.clickProductView();
        detailsPage=new productDetailsPage(driver);
        detailsPage.userAddReviewAboutProduct("hussein","hussien@gmail.com","test review");
        Assert.assertEquals(detailsPage.reviewMsg.getText(),"Thank you for your review.");
    }
    @Test(priority = 3)
    public void userAddProductToCartFromProductDetails(){
        homePageAfterRegister=new HomePageAfterRegister(driver);
        homePageAfterRegister.clickProductsBtn();
        searchPage=new SearchPage(driver);
        searchPage.searchWithProduct("Blue Top");
        JavascriptExecutor jse= (JavascriptExecutor) driver;
        jse.executeScript("scrollBy(0,500)");
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href=\"/product_details/1\"]")));
        WebElement viewProductBtn= driver.findElement(By.xpath("//a[@href=\"/product_details/1\"]"));
        viewProductBtn.click();
       // searchPage.clickProductView();
        detailsPage=new productDetailsPage(driver);
        detailsPage.userAddProductToCart("3");
        wait.until(ExpectedConditions.visibilityOf(detailsPage.addToCartMsg));
        Assert.assertEquals(detailsPage.addToCartMsg.getText(),"Your product has been added to cart.");
        detailsPage.userGoToCart();
    }
    @Test(priority = 2)
    public void userAddProductToCartFromProductsPage(){
        homePageAfterRegister=new HomePageAfterRegister(driver);
        homePageAfterRegister.clickProductsBtn();
        JavascriptExecutor jse= (JavascriptExecutor) driver;
        jse.executeScript("scrollBy(0,500)");
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@data-product-id=\"2\"]")));
        WebElement addToCartBtn= driver.findElement(By.xpath("//a[@data-product-id=\"2\"]"));
        wait.until(ExpectedConditions.elementToBeClickable(addToCartBtn));
        addToCartBtn.click();
        WebElement addToCartMsg= driver.findElement(By.xpath("//*[@id=\"cartModal\"]/div/div/div[2]/p[1]"));
        wait.until(ExpectedConditions.visibilityOf(addToCartMsg));
        Assert.assertEquals(addToCartMsg.getText(),"Your product has been added to cart.");
        WebElement continueBtn=driver.findElement(By.xpath("//button[@class='btn btn-success close-modal btn-block']"));
        wait.until(ExpectedConditions.elementToBeClickable(continueBtn));
        continueBtn.click();
    }


}
