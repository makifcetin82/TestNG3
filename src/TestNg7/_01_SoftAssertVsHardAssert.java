package TestNg7;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class _01_SoftAssertVsHardAssert {


   @Test
  void hardAssert()
  {

       String s1="Merhaba";

       System.out.println("Hard assert öncesi");
       Assert.assertEquals("Merhaba 123",s1,"HardAssert Sonucu");
       System.out.println("Hard asser sonrası");//hard assert hata verdiğinde sonrası çalışmaz.
  }


  @Test
  void softAssert()
  {

    String strHomePage="www.facebook.com/homepage";
    String strCarPage="www.facebook.com/carpage";
    String strEditAccount="www.facebook.com/editaccountpage";


    SoftAssert _softAssert=new SoftAssert();
    _softAssert.assertEquals("www.facebook.com/homepage",strHomePage);//true
    System.out.println("assert 1");




    _softAssert.assertEquals("www.facebook.com/profile",strCarPage);//fail
    System.out.println("assert 2");

    _softAssert.assertEquals("www.facebook.com/settings",strEditAccount);//fail
    System.out.println("assert 3");




     _softAssert.assertAll();//bütün assert sonuclarını işleme koyuyor.
     System.out.println("Aktiflik sonrası");//bu bölüm assertAll dan sonra oldugu için ve öncesinde hata olustugu için yazılamadı


  }

}
