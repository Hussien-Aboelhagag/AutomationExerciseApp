package Pages;

import org.openqa.selenium.By;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class SearchPage extends PageBase{

    public SearchPage(WebDriver driver) {
        super(driver);
    }
    WebElement searchTxtBox= driver.findElement(By.id("search_product"));
    WebElement searchBtn=driver.findElement(By.id("submit_search"));
    public void searchWithProduct(String searchValue){
        setTxtElementText(searchTxtBox,searchValue);
        clickBtn(searchBtn);
    }
   /* WebElement viewProductBtn= driver.findElement(By.xpath("//a[@href=\"/product_details/23\"]"));
    public void clickProductView(){
        JavascriptExecutor jse= (JavascriptExecutor) driver;
        jse.executeScript("scrollBy(0,500)");
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href=\"/product_details/23\"]")));
        clickBtn(viewProductBtn);
        wait.until(ExpectedConditions.elementToBeClickable(viewProductBtn));
    }*/
}
