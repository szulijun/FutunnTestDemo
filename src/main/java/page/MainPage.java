package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MainPage extends BasePage {
    private static MainPage mainPage;
    private MainPage(){}
    public static MainPage getInstance(){
        if (mainPage == null)
            mainPage = new MainPage();
        return mainPage;
    }
    public void gangguEle(){
        click(By.xpath("//*[@text='港股']"));
    }
}
