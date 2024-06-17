package tests;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Laptop {
    @AfterTest
    public void end()
    {
        System.out.println("End connection");
    }
    @BeforeTest
    public void start()
    {
        System.out.println("start connection");
    }
    @Parameters({"URL"})
    @Test
    public void HP(String urlName)
    {
        System.out.println("HP lap");
        System.out.println(urlName);

    }
    @Test
    public void HPcharger()
    {
        System.out.println("HpCharger");
    }
    @Test
    public void Dell()
    {
        System.out.println("Dell lap");
    }
    @Test
    public void Dellcharger()
    {
        System.out.println("DellCharger");
    }
    @Test(groups={"Smoke"})
    public void GHp()
    {
        System.out.println("laptop and charger with high cost");
    }


}
