import driver.Driver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import page.MainPage;

public class TestCase1 {

    @BeforeClass
    public void beforeClass(){
        Driver.getInstance().startDriver();
    }

    @Test
    public void test1(){
        MainPage.getInstance().gangguEle();
    }
}
