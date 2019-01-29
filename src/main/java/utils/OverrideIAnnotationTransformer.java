package utils;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

//此监听器不能用注解方式引入，只能通过xml
public class OverrideIAnnotationTransformer implements IAnnotationTransformer {
    @Override
    public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
        IRetryAnalyzer iRetryAnalyzer = annotation.getRetryAnalyzer();
        if (iRetryAnalyzer == null){
            annotation.setRetryAnalyzer(TestNGRetry.class);
        }
    }
}
