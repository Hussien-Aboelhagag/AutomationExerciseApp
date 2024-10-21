package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaymentPage extends PageBase{
    public PaymentPage(WebDriver driver) {
        super(driver);
    }
    WebElement cardName= driver.findElement(By.name("name_on_card"));
    WebElement cardNumber=driver.findElement(By.name("card_number"));
    WebElement cvcPin=driver.findElement(By.name("cvc"));
    WebElement expiry_month=driver.findElement(By.name("expiry_month"));
    WebElement expiry_year=driver.findElement(By.name("expiry_year"));
    WebElement payBtn=driver.findElement(By.id("submit"));
    JavascriptExecutor jse= (JavascriptExecutor) driver;
    public void userPayment(String CardName,String cardNum,String CVCPin,String expiryMon,String expiryYear){
        jse.executeScript("window.scroll(0,400)");
        cardName.clear();
        setTxtElementText(cardName,CardName);
        cardNumber.clear();
        setTxtElementText(cardNumber,cardNum);
        setTxtElementText(cvcPin,CVCPin);
        setTxtElementText(expiry_month,expiryMon);
        setTxtElementText(expiry_year,expiryYear);
        clickBtn(payBtn);
    }
}
