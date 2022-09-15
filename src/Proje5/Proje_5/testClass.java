package Proje5.Proje_5;

import Proje5.Proje_5.Pages.*;

import Utils.BaseStaticDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testClass extends BaseStaticDriver {

    @Test
    public void demoWebShopRegister() {

        RegisterPage registerPage = new RegisterPage(driver);

        wait.until(ExpectedConditions.elementToBeClickable(registerPage.registerMenuBtn)).click();
        registerPage.genderFemale.click();
        registerPage.firstNameInput.sendKeys("TestNG");
        registerPage.lastNameInput.sendKeys("Selenium");
        registerPage.emailInput.sendKeys("testNG63@gmail.com");
        registerPage.passwordInput.sendKeys("testNG1234");
        registerPage.passwordInput2.sendKeys("testNG1234");
        wait.until(ExpectedConditions.elementToBeClickable(registerPage.registerBtn)).click();
        org.junit.Assert.assertTrue(registerPage.successMessage.getText().contains("completed"));
        registerPage.logOutBtn.click();
    }


    @Test
    void Scenario1() {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);

        wait.until(ExpectedConditions.elementToBeClickable(homePage.loginMenuBtn)).click();
        registerPage.emailInput.sendKeys("testNG63@gmail.com");
        registerPage.passwordInput.sendKeys("testNG1234");
        loginPage.loginBtn.click();

        Assert.assertEquals("testNG63@gmail.com", loginPage.successMessage.getText());

        registerPage.logOutBtn.click();

    }

    @Test
    void Scenario2() {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);

        wait.until(ExpectedConditions.elementToBeClickable(homePage.loginMenuBtn)).click();
        registerPage.emailInput.sendKeys("testNG@gmail.com");
        registerPage.passwordInput.sendKeys("testNG1234");
        loginPage.loginBtn.click();

        Assert.assertTrue(loginPage.errorMessage.getText().contains("unsuccessful"));

    }

    @Test
    void Scenario3() {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        ProductPage productPage = new ProductPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        RegisterPage registerPage = new RegisterPage(driver);

        wait.until(ExpectedConditions.elementToBeClickable(homePage.loginMenuBtn)).click();
        registerPage.emailInput.sendKeys("testNG63@gmail.com");
        registerPage.passwordInput.sendKeys("testNG1234");
        loginPage.loginBtn.click();
        wait.until(ExpectedConditions.visibilityOf(productPage.addToCart)).click();
        homePage.shoppingCart.click();
        checkoutPage.terms.click();
        checkoutPage.checkOut.click();

        if (checkoutPage.country.isDisplayed()) {
            Select selectCountry = new Select(checkoutPage.country);
            selectCountry.selectByValue("1");

            checkoutPage.city.sendKeys("NewYork");

            checkoutPage.address.sendKeys("NewYork 2");

            checkoutPage.zipCode.sendKeys("22000");

            checkoutPage.phone.sendKeys("2856745963");
        }

        wait.until(ExpectedConditions.elementToBeClickable(checkoutPage.continue1)).click();
        wait.until(ExpectedConditions.elementToBeClickable(checkoutPage.continue2)).click();
        wait.until(ExpectedConditions.elementToBeClickable(checkoutPage.continue3)).click();
        wait.until(ExpectedConditions.elementToBeClickable(checkoutPage.continue4)).click();
        wait.until(ExpectedConditions.elementToBeClickable(checkoutPage.continue5)).click();
        wait.until(ExpectedConditions.elementToBeClickable(checkoutPage.confirmBtn)).click();

        Assert.assertTrue(checkoutPage.successMessage.getText().contains("successfully"));
    }

    @BeforeMethod
    void initialOperations() {
        driver.get("http://demowebshop.tricentis.com/");
    }

    @AfterMethod
    void finishingOperations() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

}
