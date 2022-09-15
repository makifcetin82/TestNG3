package TestNg1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _03_Assertions {
     //Yeşil tik :testte hata yok
    //Sarı çarpı testte hata var
    //Beyaz : test çalıştırılmadı. skip

      @Test
      void  EqualOrnek(){

          String s1="Merhaba";
          String s2="İyi akşamlar";



          //oluşan,beklenen,"hata başlığı"
          Assert.assertEquals(s1,s2,"Karşılaştırma sonucu");
          //actual:oluşan
          //expected :beklenen

      }




    @Test
    void  NotEqualOrnek(){

        String s1="Merhaba";
        String s2="İyi akşamlar";



        //oluşan,beklenen,"hata başlığı"
        Assert.assertNotEquals(s1,s2,"Karşılaştırma sonucu");
        //actual:oluşan
        //expected :beklenen

    }




    @Test
    void  TrueOrnek(){

       int s1=55;
       int  s2=555;



        //oluşan,beklenen,"hata başlığı"
        Assert.assertTrue(s1==s2,"Karşılaştırma sonucu");
        //actual:olan
        //expected :beklenen

    }




    @Test
    void  NullOrnek(){

        String s1=null;




        //oluşan,beklenen,"hata başlığı"
        Assert.assertNull(s1,"Karşılaştırma sonucu");
        //actual:olan
        //expected :beklenen

    }




    @Test
    void  direktFail(){

        int a=55;

        if(a==55)


        //oluşan,beklenen,"hata başlığı"
        Assert.fail();
        //actual:oluşan
        //expected :beklenen

    }



}
