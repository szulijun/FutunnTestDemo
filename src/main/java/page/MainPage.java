package page;
import driver.Driver;
import utils.Locator;

public class MainPage extends BasePage {
    private static MainPage mainPage;
    private MainPage(){}
    public static MainPage getInstance(){
        if (mainPage == null)
            mainPage = new MainPage();
        return mainPage;
    }

    public SearchPage clickSearch(){
        click(Locator.getByLocator("search","home"));
        return new SearchPage();
    }

    public MyPage clickMy(){
        click(Locator.getByLocator("my","home"));
        return new MyPage();
    }

    public MainPage backToMainPage(){
        Driver.getInstance().startDriver();
        return getInstance();
    }
}
