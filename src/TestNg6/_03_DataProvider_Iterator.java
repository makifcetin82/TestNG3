package TestNg6;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _03_DataProvider_Iterator {
    /**
     * Aşağıdaki ikili ile Dataproviderın içindeki bütün veriler tek tek test e gönderilerek
     * data sayısı kadar test çalıştırılır, dataların olduğu yere DataProvider annottion ı konur.
     * çalıştırılacak teste ise dataProvider = "getData"  bölümü eklenir.
     * Dataprovider bir testi birden fazla DATA ile çok çalıştırmak için kullanılır.
     * XML filer file gruplama, pararalel, ve farklı tesleri koordine edip birarada çalıştırmak için kullanılır.
     */

    @Test(dataProvider="getData")

    void userNameTest(String username)
    {

        System.out.println("Username="+username);
    }

    @DataProvider
    public Iterator<Object> getData()
    {

        List<Object> data=new ArrayList<>();
        data.add("Nurhayat");
        data.add("Alper");
        data.add("Uğur");
        data.add("Hakan");



        return data.iterator();
    }


}

//NOT: 2 boyutlu örnek ismet hocanın projesini içerisinde yine bu örnek altında yer almakta
