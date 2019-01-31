package driver;

import driver.Driver;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import page.MainPage;

public class BaseCase {
    public Logger logger = Logger.getLogger(getClass());

    @BeforeClass
    public void BaseCaseBefore(){
        Driver.getInstance().startDriver();
    }

    @AfterClass
    public void BaseCaseAfter(){Driver.getInstance().closeDriver();}

    @AfterMethod
    public void BaseCaseAfterMethod(){
        MainPage.getInstance().backToMainPage();
    }
}
