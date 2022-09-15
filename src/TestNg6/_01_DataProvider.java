package TestNg6;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _01_DataProvider {


    //@Parameters("username") kalkıyor alt kısımda tes içine
    @Test(dataProvider="getData")

    void userNameTest(String username)
  {

      System.out.println("Username="+username);
  }

   @DataProvider
   public Object[] getData()
   {


       Object[]  data={"Nurhayat","Alper","Uğur","Hakan"};

       return  data;
   }


   //2. yöntem
    @Test(dataProvider="userlar")

    void userNameTest2(String username)
    {

        System.out.println("Username="+username);
    }

    @DataProvider(name = "userlar")
    public Object[] getData2()
    {


        Object[]  data={"Nurhayat","Alper","Uğur","Hakan"};

        return  data;
    }


}




