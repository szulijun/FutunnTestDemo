package driver;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import utils.config.GlobalConfig;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Driver {
    private static Driver driver;
    private AppiumDriver<WebElement> appiumDriver;

    private Driver(){}

    public static Driver getInstance(){
        if (driver == null)
            driver = new Driver();
        return driver;
    }

    private void initDriver(){
        final DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        final GlobalConfig config = GlobalConfig.load("/config/globalConfig.yaml");
        config.getAppiumConfig().getCapabilities().keySet().forEach(key->{
            Object value = config.getAppiumConfig().getCapabilities().get(key);
            desiredCapabilities.setCapability(key,value);
        });

        try {
            appiumDriver = new AndroidDriver<WebElement>(new URL(config.getAppiumConfig().getUrl()),desiredCapabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        appiumDriver.manage().timeouts().implicitlyWait(config.getAppiumConfig().getWait(),TimeUnit.SECONDS);
    }

    public void startDriver(){
        initDriver();
    }

    public AppiumDriver<WebElement> getDriver(){
        return appiumDriver;
    }

    public void closeDriver(){
        appiumDriver.quit();
    }

    public void screenShot(String path){
        try {
            FileUtils.copyFile(appiumDriver.getScreenshotAs(OutputType.FILE),new File(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
