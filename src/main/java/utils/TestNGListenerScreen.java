package utils;

import driver.Driver;
import org.apache.log4j.Logger;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestNGListenerScreen extends TestListenerAdapter {
    private Logger logger = Logger.getLogger(TestNGListenerScreen.class);

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        super.onTestFailure(iTestResult);
        takeScreenShot();
        logger.info(iTestResult.getName() + " Failure");
    }

    public void takeScreenShot(){
        SimpleDateFormat df = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
        Calendar cal = Calendar.getInstance();
        Date date = cal.getTime();
        String datestr = df.format(date);
        String path = "screenshot/"+ this.getClass().getSimpleName() + "_" + datestr + ".png";
        Driver.getInstance().screenShot(path);
    }

}
