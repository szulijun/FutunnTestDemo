package utils;

import org.apache.log4j.Logger;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import utils.config.GlobalConfig;

public class TestNGRetry implements IRetryAnalyzer {
    private static Logger logger = Logger.getLogger(TestNGRetry.class);
    private int retryCount = 1;
    private static int maxRetryCount;

    //读取重跑次数
    static {
        GlobalConfig config = GlobalConfig.load("/config/globalConfig.yaml");
        maxRetryCount = config.getAppiumConfig().getMaxretrycount();
        logger.info("retryMaxcount=" + maxRetryCount);
    }

    //重跑，记录log
    @Override
    public boolean retry(ITestResult iTestResult) {
        if (retryCount<=maxRetryCount){
            String message = "Retry for [" + iTestResult.getName() + "] on class [" + iTestResult.getTestClass().getName() + "] Retry "
                    + retryCount + " times";
            logger.info(message);
            retryCount++;
            return true;
        }
        return false;
    }
    public int getCount() {

        return retryCount;
    }

    public int getMaxCount(){
        return maxRetryCount;
    }
}
