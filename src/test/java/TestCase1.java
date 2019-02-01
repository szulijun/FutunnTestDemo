import driver.BaseCase;
import driver.Driver;
import org.aspectj.lang.annotation.Before;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.MainPage;

public class TestCase1 extends BaseCase {
    @BeforeMethod
    public void BaseCaseBeforeMethod(){
        MainPage.getInstance().backToMainPage();
    }

    @Test
    public void test1(){
        logger.info("第一条测试用例执行");
        MainPage.getInstance().clickSearch().searchSendKeys("pdd");
    }

    @Test
    public void test2(){
        logger.info("第二条测试用例执行");
        MainPage.getInstance().clickMy().clickLogin().clickOtherLogin().loginSuccess("722155","futunn88");
    }
}
