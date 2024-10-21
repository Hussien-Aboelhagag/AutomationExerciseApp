package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginSignUpPage extends PageBase {

    public LoginSignUpPage(WebDriver driver) {
        super(driver);
    }
    //signup elements
    WebElement nameElementInSign= driver.findElement(By.xpath("//input[@type='text' and @data-qa='signup-name']"));
    WebElement emailSignupElement = driver.findElement(By.xpath("//input[@type='email' and @data-qa='signup-email']"));
    WebElement signupBtn= driver.findElement(By.xpath("//button[@type='submit' and @data-qa='signup-button']"));
    //login filed elements
    WebElement emailLoginElement= driver.findElement(By.xpath("//input[@type='email' and @data-qa='login-email']"));
    WebElement passwordLoginElement= driver.findElement(By.xpath("//input[@type='password']"));
    WebElement loginBtn= driver.findElement(By.xpath("//button[@type='submit' and @data-qa='login-button']"));
    public void chooseSignupButtonSteps(String name,String emailAddress){
        setTxtElementText(nameElementInSign,name);
        setTxtElementText(emailSignupElement,emailAddress);
        clickBtn(signupBtn);
    }
    public void loginSteps(String email,String password){
        setTxtElementText(emailLoginElement,email);
        setTxtElementText(passwordLoginElement,password);
        clickBtn(loginBtn);
    }
}
