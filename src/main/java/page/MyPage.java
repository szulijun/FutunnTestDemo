package page;

import utils.Locator;

public class MyPage extends BasePage{
    //点击登陆
    public LoginPage clickLogin(){
        click(Locator.getByLocator("login","my"));
        return new LoginPage();
    }


}
