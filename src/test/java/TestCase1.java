import driver.BaseCase;
import org.testng.annotations.Test;
import page.MainPage;

public class TestCase1 extends BaseCase {

    @Test
    public void test1(){
        logger.info("第一条测试用例执行");
        MainPage.getInstance().clickSearch().searchSendKeys("pdd");
    }

    @Test
    public void test2(){
        logger.info("第二条测试用例执行");
        MainPage.getInstance().clickMy().clickLogin().loginSuccess("722155","futunn88");
    }
}
