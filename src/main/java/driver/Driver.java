package driver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

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
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "android");
        desiredCapabilities.setCapability("deviceName", "192.168.56.101:5555");
        desiredCapabilities.setCapability("appPackage", "cn.futu.trader");
        desiredCapabilities.setCapability("appActivity", "cn.futu.app.main.activity.MainActivity");
        desiredCapabilities.setCapability("noReset", "true");
        desiredCapabilities.setCapability("unicodeKeyboard", true);
        desiredCapabilities.setCapability("resetKeyboard", true);

        try {
            appiumDriver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"),desiredCapabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        appiumDriver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
    }

    public void startDriver(){
        initDriver();
    }

    public AppiumDriver<WebElement> getDriver(){
        return appiumDriver;
    }
}
