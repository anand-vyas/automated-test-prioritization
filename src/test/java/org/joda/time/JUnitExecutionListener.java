import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;
import java.util.Date;

public class JUnitExecutionListener extends RunListener {

    long time1;
    long time2;
    long diff;

    public void testRunStarted(Description description) throws Exception {
        //System.out.println("Number of tests to execute: " + description.testCount());
        Date date = new Date();
        time1 = date.getTime();
        System.out.println("First test beginning to execute at (time in milliseconds): " + time1);

    }

    public void testRunFinished(Result result) throws Exception {
        System.out.println("Number of tests executed: " + result.getRunCount());
    }

    public void testStarted(Description description) throws Exception {
        //System.out.println("Starting: " + description.getMethodName());
    }

    public void testFinished(Description description) throws Exception {
        //System.out.println("Finished: " + description.getMethodName());
    }

    public void testFailure(Failure failure) throws Exception {
        System.out.println("Failed: " + failure.getDescription().getMethodName());
        Date date = new Date();
        time2 = date.getTime();
        diff = time2 - time1; 
        System.out.println("Test failure recorded. Time elapsed from beginning of test execution is: " + diff);

    }

    public void testAssumptionFailure(Failure failure) {
        System.out.println("Failed: " + failure.getDescription().getMethodName());
    }

    public void testIgnored(Description description) throws Exception {
        System.out.println("Ignored: " + description.getMethodName());
    }
}