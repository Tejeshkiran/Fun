package tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Sample2 {

    @Test
    public void car()
    {
        System.out.println("Drives at 100km");
    }
    @Test
    public void bike()
    {
        System.out.println("Drives at 120km");
    }
    @BeforeSuite
    public void No1()
    {
        System.out.println("Am No 1");
    }
    @AfterSuite
    public void lastNo1()
    {
        System.out.println("Am No1 last");
    }
    @Test(groups={"Smoke"})
    public void Gcar()
    {
        System.out.println("car which runs on petrol");
    }
    @Test(groups={"Smoke"})
    public void GBike()
    {
        System.out.println("Bike which runs on petrol");
    }
}
