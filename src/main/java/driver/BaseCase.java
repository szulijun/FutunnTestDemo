package driver;

import driver.Driver;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseCase {
    public Logger logger = Logger.getLogger(getClass());

    @BeforeClass
    public void BaseCaseBefore(){
        Driver.getInstance().startDriver();
    }

    @AfterClass
    public void BaseCaseAfter(){
        Driver.getInstance().closeDriver();
    }
}
