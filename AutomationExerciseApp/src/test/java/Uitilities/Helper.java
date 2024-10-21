package Uitilities;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class Helper {
//Take screenshot after fail
    public static void captureScreenshot(WebDriver driver,String screenshotName) throws IOException {
        TakesScreenshot screenshot= (TakesScreenshot) driver;
        File source=screenshot.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(source,new File("E:\\Practical Automation\\practical_Moatez\\nopCommerceApp\\nopcomerceApp\\screenshots\\"+screenshotName+".png"));
    }
//download Path
    public static String downloadPath=System.getProperty("user.dir")+"/Download";
    public ChromeOptions chromeOptions(){
        ChromeOptions options=new ChromeOptions();
        HashMap<String,Object> chromePrefs=new HashMap<String,Object>();
        chromePrefs.put("profile.default.content_setting.popups",0);
        chromePrefs.put("download.default.directory",downloadPath);
        options.setExperimentalOption("prefs",chromePrefs);
        options.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
        return options;
    }
}
