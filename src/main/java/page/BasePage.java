package page;

import driver.Driver;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BasePage {
    public WebElement find(By by){
        //todo: 弹框处理
        WebElement element=null;
        try{
            element = Driver.getInstance().getDriver().findElement(by);
        }catch(Exception e){
            //todo: getPageSource + xpath
            //弹框xpath列表
        }
        return element;
    }

    public void click(By by){
        find(by).click();
    }

    public void sendKeys(By by,String content){
        find(by).sendKeys(content);
    }


}
