package Mentoring;

import Utils.BaseStaticDriver;
import com.beust.jcommander.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class FirstTest extends BaseStaticDriver {

   // @Parameters({"search_item"}) BU BÖLÜMÜN DÜZELTİLMESİ İÇİN XML DOSYASINI OLUSTUR CALISTIR*******
    @Test
    public void TestGoogle(String searchItem) throws Exception {
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys(searchItem, Keys.ENTER);
        System.out.println(driver.getTitle());
        Thread.sleep(5000);
        driver.quit();
    }


}