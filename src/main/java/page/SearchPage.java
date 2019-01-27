package page;


import utils.Locator;

public class SearchPage extends BasePage {

    protected SearchPage searchSendKeys(String content){
        sendKeys(Locator.getByLocator("input_box","search"),content);
        return this;
    }
}
