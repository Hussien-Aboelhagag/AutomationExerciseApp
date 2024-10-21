package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckoutPage extends PageBase{
    public CheckoutPage(WebDriver driver) {
        super(driver);
    }
    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
    JavascriptExecutor jse= (JavascriptExecutor) driver;
    public WebElement totalPrice=driver.findElement(By.xpath("//p[@class='cart_total_price']"));
    WebElement addToOrder= driver.findElement(By.xpath("//textarea[@class='form-control']"));
    WebElement placeOrderBtn= driver.findElement(By.xpath("//a[@href='/payment']"));
    public WebElement usernameInCheckout= driver.findElement(By.xpath("//*[@id=\"address_delivery\"]/li[2]"));
    public WebElement userAddressInCheckout= driver.findElement(By.xpath("//*[@id=\"address_delivery\"]/li[4]"));
    public void userCheckout(String comment){
        wait.until(ExpectedConditions.visibilityOf(totalPrice));
        jse.executeScript("window.scroll(0,1000)");
        setTxtElementText(addToOrder,comment);
        clickBtn(placeOrderBtn);
    }
}
