package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends PageBase{

    public HomePage(WebDriver driver) {
        super(driver);
    }

    WebElement registerLinkElement=driver.findElement(By.xpath("//a[@href='/login']"));

    public void openRegisterLinkElement() {
        clickBtn(registerLinkElement);
    }
}
