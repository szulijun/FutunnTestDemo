import driver.BaseCase;
import driver.Driver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import page.MainPage;

public class TestCase1 extends BaseCase {

    @Test
    public void test1(){
        MainPage.getInstance().gangguEle();
    }
}
