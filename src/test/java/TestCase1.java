import driver.BaseCase;
import org.testng.annotations.Test;
import page.MainPage;

public class TestCase1 extends BaseCase {

    @Test
    public void test1(){
        MainPage.getInstance().gangguEle();
    }
}
