import driver.BaseCase;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import page.MainPage;
import utils.TestNGListenerScreen;

@Listeners({TestNGListenerScreen.class})
public class TestCase1 extends BaseCase {

    @Test
    public void test1(){
        logger.info("第一条测试用例执行");
        MainPage.getInstance().clickSearch().search("pdd");
    }
}
