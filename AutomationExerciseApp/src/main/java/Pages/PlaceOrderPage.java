package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

import java.util.HashMap;

public class PlaceOrderPage extends PageBase{
    public PlaceOrderPage(WebDriver driver) {
        super(driver);
    }
    WebElement downloadInvoiceBtn= driver.findElement(By.xpath("//a[@href='/download_invoice/1500']"));
    public WebElement PaymentMsg=driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/p"));
    WebElement continueBtn= driver.findElement(By.xpath("//a[@href='/' and @data-qa='continue-button']"));
    public void userDownloadInvoices(){
        clickBtn(downloadInvoiceBtn);
        clickBtn(continueBtn);
    }
}
