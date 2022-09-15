package TestNg1;



/*
   Senaryo ;
     1- http://opencart.abstracta.us/index.php?route=account/login  sitesini açınız.
     2- asd@gmail.com  ve 123qweasd   bilgileri ile login olan test metodunu yazınız.
     3- Login olup olmadığınızı assert ile kontrol ediniz.

 */
import Utils.GenelWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class _05_Ornek extends GenelWebDriver {

    @Test
    void LoginTest()
    {
        WebElement inputEmail= driver.findElement(By.id("input-email"));
        inputEmail.sendKeys("makifcetin82@gmail.com");

        WebElement password= driver.findElement(By.id("input-password"));
        password.sendKeys("LexusDelta-82");

        WebElement loginBtn= driver.findElement(By.cssSelector("input[value='Login']"));
        loginBtn.click();
    }

}
