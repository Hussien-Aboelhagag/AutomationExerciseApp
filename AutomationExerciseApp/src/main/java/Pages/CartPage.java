package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage extends PageBase{
    public CartPage(WebDriver driver) {
        super(driver);
    }
    WebElement checkoutBtn= driver.findElement(By.xpath("//a[@class='btn btn-default check_out']"));
    WebElement deleteFirstItem= driver.findElement(By.xpath("//*[@id=\"product-1\"]/td[6]/a"));
    public WebElement priceFirstItem= driver.findElement(By.xpath("//*[@id=\"product-1\"]/td[3]/p"));
    public WebElement quantityFirstItem= driver.findElement(By.xpath("//*[@id=\"product-1\"]/td[4]/button"));
    public WebElement totalPriceFirstItem= driver.findElement(By.xpath("//*[@id=\"product-1\"]/td[5]/p"));
    WebElement deleteSecondItem= driver.findElement(By.xpath("//*[@id=\"product-2\"]/td[6]/a"));
    public WebElement priceSecondItem= driver.findElement(By.xpath("//*[@id=\"product-2\"]/td[3]/p"));
    public WebElement quantitySecondItem= driver.findElement(By.xpath("//*[@id=\"product-2\"]/td[4]/button"));
    public WebElement totalPriceSecondItem= driver.findElement(By.xpath("//*[@id=\"product-2\"]/td[5]/p"));
    public void userCheckout(){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(checkoutBtn));
        clickBtn(checkoutBtn);
    }
    public void userDeleteFirstItem(){
        clickBtn(deleteFirstItem);
    }
    public void userDeleteSecondItem(){
        clickBtn(deleteSecondItem);
    }
}
