package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class  SignUpSuccessfulPage extends PageBase{

    public SignUpSuccessfulPage(WebDriver driver) {
        super(driver);
    }

    public WebElement SuccessMsg1= driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/p[1]"));
    public WebElement SuccessMsg2= driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/p[2]"));
    public WebElement continueBtn= driver.findElement(By.xpath("//a[@href='/' and @data-qa='continue-button']"));
}
