package page;

import utils.Locator;

public class LoginPage extends BasePage{
    //输入用户名
    private void sendUsername(String username){
        sendKeys(Locator.getByLocator("username","login"),username);
    }
    //输入密码
    private void sendPassword(String password){
        sendKeys(Locator.getByLocator("password","login"),password);
    }
    //点击登录
    private void clickLoginBtn(){
        click(Locator.getByLocator("loginbtn","login"));
    }
    //登陆成功
    public MainPage loginSuccess(String username,String password){
        sendUsername(username);
        sendPassword(password);
        return MainPage.getInstance();
    }
    //登陆失败
    public LoginPage loginFailed(String username,String password){
        sendUsername(username);
        sendPassword(password);
        return this;
    }


}
