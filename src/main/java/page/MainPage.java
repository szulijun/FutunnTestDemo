package page;

import business.SearchBiz;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.Locator;

public class MainPage extends BasePage {
    private static MainPage mainPage;
    private MainPage(){}
    public static MainPage getInstance(){
        if (mainPage == null)
            mainPage = new MainPage();
        return mainPage;
    }

    public SearchBiz clickSearch(){
        click(Locator.getByLocator("search","home"));
        return new SearchBiz();
    }
}
