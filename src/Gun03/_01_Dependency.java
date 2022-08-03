package Gun03;

/*

interviewlarda sorulan bir konu:testlere öncelikleri nasıl verirsin?

Cevap: priority,dependency

Nasıl kullanırsı?

cevap1- priority  =1 gibi sıralı rakamalar vererek

2-dependOnMethods bununla kendinden önce hangi metod çalışması gerekiyor ise onu belirtirim.

bir metodu direkt çalıştırdıgımızda kendinden önce bagımlı 1 veya 2 metod var ise ototmatik onları önce çağırıp sonra kendisiçalışır

fakat 2 veya daha fazla tane var ise bagımlı oldugu metod o zaman çalışmaz.
 */


import org.testng.Assert;
import org.testng.annotations.Test;

public class _01_Dependency {

    @Test
   void startCar()
   {
       System.out.println("Car started");

   }
   @Test(dependsOnMethods = {"startCar"})// bu testin çalışması startcar ın hatasız çalışmasına bağlı
   void driveCar()

   {
       System.out.println("car drive");
       Assert.fail();
   }

    @Test(dependsOnMethods = {"startCar","driveCar"})//bu testin çalışması için veriler 2 testin hatasız bitmesi lazım
    void parkCar()
    {
        System.out.println("car parked");

    }

    @Test(dependsOnMethods = {"parkCar"}, alwaysRun = true)//bağımlılıkları var ama hata cıkarsa yinede çalışır.
    void StopCar()
    {
        System.out.println("car stop");

    }


}
