package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Mobile {

    @Test
    public void apple()
    {
        System.out.println("apple");
        Assert.assertTrue(false);
    }
    @Test
    public void Micharger()
    {
        System.out.println("MIcharger");
    }
    @BeforeMethod
    public void cart()
    {
        System.out.println("added to cart");
    }
    @BeforeClass
    public void Bfclass()
    {
        System.out.println("Am before this Mobile testcases inside mobile class");
    }

}

