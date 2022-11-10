package org.example;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class loginTest extends ExtendTestReports{

    public AppiumDriver<WebElement>  driver;
    public WebDriverWait wait;

    By kurumsalButon = By.id("mobi.appcent.apponte:id/btnInstitutional");

    By girisYapButon = By.id("mobi.appcent.apponte:id/ibSignIn");

    By telefonNoButon = By.id("mobi.appcent.apponte:id/etPhoneNumber");

    By kodGonderButon = By.id("mobi.appcent.apponte:id/btnSendCode");

    By otpGonderButon = By.id("mobi.appcent.apponte:id/btnOTPContinue");


    @BeforeTest

    public void setup(){

        try {
            DesiredCapabilities cap;
            cap = new DesiredCapabilities();

            cap.setCapability("deviceName", "Pixel 4 API 29");
            cap.setCapability("platformName", "Android");
            cap.setCapability("udid", "emulator-5554");
            cap.setCapability("platformVersion", "10.0");
            cap.setCapability("appPackage", "mobi.appcent.apponte");
            cap.setCapability("appActivity", "mobi.appcent.apponte.ui.activity.login.LoginActivity");
            cap.setCapability("skipUnlock", "true");
            cap.setCapability("noReset", "false");

            driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
            wait = new WebDriverWait(driver, 10);


        } catch (MalformedURLException test){
            System.out.println("Hatalı giriş bilgisi!");
        }
    }

    @Test

    //Login Test

    public void test() throws InterruptedException{

        ExtentTest testBasla = extent3.createTest("Login Testi","Login");

        testBasla.log(Status.INFO, "Login testi başladı!");

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement kurumsalSecim = driver.findElement(kurumsalButon);
        kurumsalSecim.click();

        testBasla.log(Status.INFO, "Kurumsal seçimi yapıldı!");

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement girisYapSecim = driver.findElement(girisYapButon);
        girisYapSecim.click();

        testBasla.log(Status.INFO, "giriş yap buton seçimi yapıldı!");

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement telefonSecim = driver.findElement(telefonNoButon);
        driver.getKeyboard().pressKey("5372448046");

        testBasla.log(Status.INFO, "telefon numarası girişi yapıldı!");

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement kodGonderSecim = driver.findElement(kodGonderButon);
        kodGonderSecim.click();

        testBasla.log(Status.INFO, "kod gönder buton seçimi yapıldı!");

        Thread.sleep(10000);

        //Elle OTP girişi

        testBasla.log(Status.INFO, "OTP girişi yapıldı!");

        WebElement otpGonderSecim = driver.findElement(otpGonderButon);
        otpGonderSecim.click();

        testBasla.log(Status.INFO, "OTP gönder buton seçimi yapıldı!");

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        testBasla.log(Status.INFO, "Test tamamlandı!");

        Thread.sleep(10000);
    }

    @Test
    public void anasayfaTest(){

    }

    @AfterTest
    public void teardown(){
        driver.quit();
    }
}
