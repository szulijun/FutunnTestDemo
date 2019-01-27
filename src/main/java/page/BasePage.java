package page;

import driver.Driver;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BasePage {
    public AppiumDriver<WebElement> driver;
    public BasePage(){
        driver = Driver.getInstance().getDriver();
    }

    public void click(By by){
        driver.findElement(by).click();
    }

    public void sendKeys(By by,String content){
        driver.findElement(by).sendKeys(content);
    }


}
