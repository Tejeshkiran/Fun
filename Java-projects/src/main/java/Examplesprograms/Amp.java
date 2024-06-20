package Examplesprograms;

import java.util.Scanner;

public class Amp{
  private int r;
  static private float pi;
  private float a;
  static {
      pi=3.14f;
  }
  Scanner scan = new Scanner(System.in);
  public float areaofcircle()
    {
        System.out.println("enter the radius value");
        r= (int) scan.nextFloat();
        a = pi*r*r;
        return a;
    }

}
