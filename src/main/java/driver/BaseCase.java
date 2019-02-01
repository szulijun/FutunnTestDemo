package driver;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;

public class BaseCase {
    public Logger logger = Logger.getLogger(getClass());

//    @BeforeClass
//    public static void BaseCaseBefore(){
//        Driver.getInstance().startDriver();
//    }

    @AfterClass
    public static void BaseCaseAfter(){Driver.getInstance().closeDriver();}
}
