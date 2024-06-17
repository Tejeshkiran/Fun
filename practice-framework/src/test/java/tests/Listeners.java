package tests;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {

    @Override
    public void onTestStart(ITestResult result)
    {

    }
    @Override
    public void onTestSuccess(ITestResult result)
    {
        System.out.println("I successfully exicuited Listners pass code");
    }
    @Override
    public void onTestFailure(ITestResult result)
    {
        System.out.println("I successfully exicuited Listners Fail code");
    }

}
