package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageBase {
    WebDriver driver;
    public PageBase(WebDriver driver){
        this.driver=driver;
    }


    protected static void clickBtn(WebElement button){
        button.click();
    }
    protected static void setTxtElementText(WebElement textElement,String value){
        textElement.sendKeys(value);
    }

}
