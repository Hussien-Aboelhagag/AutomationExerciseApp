package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UserRegistrationPage extends PageBase {

    public UserRegistrationPage(WebDriver driver) {
        super(driver);
    }

    WebElement genderRdoBtn= driver.findElement(By.id("id_gender1"));

    WebElement fsNameTxtBox= driver.findElement(By.id("first_name"));

    WebElement lsNameTxtBox= driver.findElement(By.id("last_name"));
    WebElement addressTxtBox= driver.findElement(By.id("address1"));
    Select countryList= new Select(driver.findElement(By.id("country")));
    WebElement stateTxtBox=driver.findElement(By.id("state"));
    WebElement cityTxtBox=driver.findElement(By.id("city"));
    WebElement zipcodeTxtBox=driver.findElement(By.id("zipcode"));
    WebElement phNumberTxtBox=driver.findElement(By.id("mobile_number"));
    WebElement passwordBox= driver.findElement(By.id("password"));
    WebElement registerBtn= driver.findElement(By.xpath("//button[@type='submit' and @data-qa='create-account']"));

    public void userRegistrationSteps(String password,String firstname,String lastname
            ,String address,String country,String state,String city,String zipCode,String mobileNumber){
        clickBtn(genderRdoBtn);
        setTxtElementText(fsNameTxtBox,firstname);
        setTxtElementText(lsNameTxtBox,lastname);
        setTxtElementText(addressTxtBox,address);
        setTxtElementText(passwordBox,password);
        countryList.selectByVisibleText(country);
        setTxtElementText(stateTxtBox,state);
        setTxtElementText(cityTxtBox,city);
        setTxtElementText(zipcodeTxtBox,zipCode);
        setTxtElementText(phNumberTxtBox,mobileNumber);
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(registerBtn));
        clickBtn(registerBtn);
    }

}
