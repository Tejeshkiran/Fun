package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataclass {

    @Test(dataProvider = "datas")
    public void datacollector(String UserName, String UserID)
    {
        System.out.println(UserName+"  "+UserID);
    }
    @DataProvider
    public Object[][] datas()
    {
        Object[][] data = new Object[3][2];
        data[0][0]= "Tejesh";
        data[0][1]= "tejesh@gmail.com";

        data[1][0]= "Parinita";
        data[1][1]= "parnita@gmail.com";

        data[2][0]= "Suma";
        data[2][1]= "suma@gmail.com";

        return data;
    }
}
