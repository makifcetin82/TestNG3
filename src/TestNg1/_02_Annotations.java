package TestNg1;

import org.testng.annotations.*;

public class _02_Annotations {

/*

      @BeforeClass--> Her class çalışıyorken önce burası çalışır.
         @BeforeMetod--> Her metoddan önce çalışır.
           @Test -->testlerin çalıştığı metodlar
           @Test-->testlerin çalıştığı metodlar
        @AfterMetod  --> Her metoddan sonra çalışır
     @AfterClass--> Her class çalışıyorken sonra burası çalışır.
*/


    @BeforeClass
     void beforeClass(){
         System.out.println("her class dan önce çalışıcak :before class");  }

     @BeforeMethod
     void beforeMethod(){
         System.out.println("her test methoddan önce çalışıcak:before method");
     }
      @Test
     void test1(){
         System.out.println("test 1 çalıştı");
     }
     @Test
     void test2(){
         System.out.println("test 2 çalıştı");
     }


     @AfterMethod
     void afterMethod(){
         System.out.println("her test methoddan sonra çalışıcak:after method");
     }
     @AfterClass
     void afterClass(){
         System.out.println("her class dan önce çalışıcak:After Class");
     }


}
