package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageAfterRegister extends PageBase{

    public HomePageAfterRegister(WebDriver driver) {
        super(driver);

    }
    WebElement logoutBtn= driver.findElement(By.xpath("//a[@href='/logout']"));
    public WebElement deleteAccountBtn= driver.findElement(By.xpath("//a[@href='/delete_account']"));
    WebElement productsBtn=driver.findElement(By.xpath("//a[@href='/products']"));
    WebElement contactUSBtn= driver.findElement(By.xpath("//a[@href='/contact_us']"));
    WebElement subscriptionTxtBox=driver.findElement(By.id("susbscribe_email"));
    WebElement subscriptionBtn=driver.findElement(By.id("subscribe"));
    WebElement cartBtn=driver.findElement(By.xpath("//a[@href='/view_cart']"));
    public WebElement subscriptionMsg=driver.findElement(By.id("success-subscribe"));
    public void userLogout() {
        clickBtn(logoutBtn);
    }
    public void clickDeleteAccountBtn(){
        clickBtn(deleteAccountBtn);
    }
    public void clickProductsBtn(){
        clickBtn(productsBtn);
    }
    public void clickContactusBtn(){
        clickBtn(contactUSBtn);
    }
    public void SubscriptionSteps(String email){
        setTxtElementText(subscriptionTxtBox,email);
        clickBtn(subscriptionBtn);
    }
    public void clickCartBtn(){
        clickBtn(cartBtn);
    }
}
