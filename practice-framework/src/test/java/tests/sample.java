package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class sample {
    @Test
    public void run()
    {
        System.out.println("hello");
    }
    @Parameters({ "URL","Api" })
    @Test
    public void fun(String Urlname,String Apiname)
    {
        System.out.println("helloYou");
        System.out.println(Urlname);
        System.out.println(Apiname);

    }
    @Test(dependsOnMethods = {"fun","run"})
    public void dance()
    {
        System.out.println("Hello Dance");
    }
    @BeforeTest
    public void price()
    {
        System.out.println("Check out price first");
    }
    @Test(enabled = false)
    public void failedtest()
    {
        System.out.println("failed test cases");
    }

}
