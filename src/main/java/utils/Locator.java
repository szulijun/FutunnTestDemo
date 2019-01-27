package utils;

import utils.config.PageConfig;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class Locator {
    public static By getByLocator(String key,String pagename){
        PageConfig config = PageConfig.load("/data/pageElement.yaml");
        String loc = "";
        switch (pagename){
            case "home":
                loc = config.getHomepagelocator().get(key);
                break;
            case "search":
                loc = config.getSearchpagelocator().get(key);
                break;
            case "stockdetail":
                loc = config.getStockdetaillocator().get(key);
                break;
        }
        String bymethod = loc.split(">")[0];
        String byvalue = loc.split(">")[1];
        switch (bymethod) {
            case "id":
                return MobileBy.id(byvalue);
            case "content-desc":
                return MobileBy.AccessibilityId(byvalue);
            case "text":
                return MobileBy.xpath("//*[@text='" + byvalue + "']");
            default:
                return MobileBy.xpath(byvalue);
        }
    }
}

