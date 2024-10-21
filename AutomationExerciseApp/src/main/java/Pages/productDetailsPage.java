package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class productDetailsPage extends PageBase{
    public productDetailsPage(WebDriver driver) {
        super(driver);
    }

    WebElement reviewName= driver.findElement(By.id("name"));
    WebElement reviewEmail= driver.findElement(By.id("email"));
    WebElement reviewTxtBox= driver.findElement(By.id("review"));
    WebElement reviewBtn= driver.findElement(By.id("button-review"));
    WebElement productQuantity= driver.findElement(By.id("quantity"));
    WebElement addToCartBtn= driver.findElement(By.xpath("//button[@class=\"btn btn-default cart\"]"));
    public void userAddReviewAboutProduct(String name,String email,String review){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name")));
        setTxtElementText(reviewName,name);
        setTxtElementText(reviewEmail,email);
        setTxtElementText(reviewTxtBox,review);
        clickBtn(reviewBtn);
    }
    public WebElement reviewMsg= driver.findElement(By.xpath("//*[@id=\"review-section\"]/div/div/span"));
    public void userAddProductToCart(String productNum){
        productQuantity.clear();
        setTxtElementText(productQuantity,productNum);
        clickBtn(addToCartBtn);
    }
    public WebElement addToCartMsg= driver.findElement(By.xpath("//*[@id=\"cartModal\"]/div/div/div[2]/p[1]"));
    WebElement viewCartBtn= driver.findElement(By.xpath("//p/a[@href=\"/view_cart\"]"));
    WebElement continueBtn=driver.findElement(By.xpath("//button[@class='btn btn-success close-modal btn-block']"));
    public void userContinueShopping(){
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(continueBtn));
        clickBtn(continueBtn);
    }
    public void userGoToCart(){
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(viewCartBtn));
        clickBtn(viewCartBtn);
    }
}
