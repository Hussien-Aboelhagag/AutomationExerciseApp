package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ContactUsPage extends PageBase{

    public ContactUsPage(WebDriver driver) {
        super(driver);
    }

    WebElement nameTxtBox= driver.findElement(By.xpath("//input[@type='text' and @name='name']"));
    WebElement emailTxtBox= driver.findElement(By.xpath("//input[@type='email' and @name='email']"));
    WebElement yourMsgHere= driver.findElement(By.id("message"));
    WebElement fileUploader= driver.findElement(By.xpath("//input[@type='file']"));
    WebElement submitBtn= driver.findElement(By.xpath("//input[@type='submit']"));
    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
    public WebElement successMsgOfContactUs= driver.findElement(By.xpath("//div[@class='status alert alert-success']"));
    public void contactUsSteps(String filepath,String name,String email,String message){
        setTxtElementText(nameTxtBox,name);
        setTxtElementText(emailTxtBox,email);
        setTxtElementText(yourMsgHere,message);
        setTxtElementText(fileUploader,filepath);
        clickBtn(submitBtn);
        Alert alert=driver.switchTo().alert();
        alert.accept();
        wait.until(ExpectedConditions.visibilityOf(successMsgOfContactUs));
    }

}
