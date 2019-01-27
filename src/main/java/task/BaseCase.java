package task;

import driver.Driver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseCase {

    @BeforeClass
    public void BaseCaseBefore(){
        Driver.getInstance().startDriver();
    }

    @AfterClass
    public void BaseCaseAfter(){
        Driver.getInstance().closeDriver();
    }
}
