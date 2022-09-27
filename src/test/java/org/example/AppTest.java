package org.example;

import static org.junit.Assert.assertTrue;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    public AppiumDriver<WebElement> driver;

    public WebDriverWait wait;

    By bireyselButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.Button[1]");
    By kurumsalButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.Button[2]");

    By girisYapButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.Button[2]");

    By gizlilikSozlesmesiButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView[4]");

    By phoneNumberText =  By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText");

    By codeButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button");

    By devamEtButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[3]/android.widget.Button");

    By uyelikPopUp = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup");

    By uyeOlButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.Button[2]");

    By adText = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.EditText");

    By soyadText = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.EditText");

    By kaydetButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[4]/android.widget.Button[1]");


    @BeforeTest
    public void setup() {
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

            driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
            wait = new WebDriverWait(driver,10);

        }catch (MalformedURLException mx){
            System.out.println("Hatalı oluşturulmuş URL İstisnası!");

        }

    }

    @Test

    public void test() throws InterruptedException{

        Thread.sleep(3000);

        WebElement bireyselButtonClick = driver.findElement(bireyselButton);
        bireyselButtonClick.click();

        Thread.sleep(1000);

        WebElement girisYapButtonClick = driver.findElement(girisYapButton);
        girisYapButtonClick.click();

        Thread.sleep(3000);

        WebElement phoneNumberTextClick = driver.findElement(phoneNumberText);
      //  phoneNumberTextClick.sendKeys("5379157432");
        driver.getKeyboard().pressKey("5");
        driver.getKeyboard().pressKey("3");
        driver.getKeyboard().pressKey("7");
        driver.getKeyboard().pressKey("9");
        driver.getKeyboard().pressKey("1");
        driver.getKeyboard().pressKey("5");
        driver.getKeyboard().pressKey("7");
        driver.getKeyboard().pressKey("4");
        driver.getKeyboard().pressKey("3");
        driver.getKeyboard().pressKey("2");

        Thread.sleep(3500);

        WebElement codeButtonClick = driver.findElement(codeButton);
        codeButtonClick.click();

        Thread.sleep(10000);

        WebElement devamEtButtonClick = driver.findElement(devamEtButton);
        devamEtButtonClick.click();

        Thread.sleep(5000);

        WebElement uyelikPopUpSelect = driver.findElement(uyelikPopUp);

        Thread.sleep(1000);

        if(uyelikPopUpSelect.isDisplayed()){
            Thread.sleep(2000);
            WebElement uyeOlButtonClick = driver.findElement(uyeOlButton);
            uyeOlButtonClick.click();
        }
        else{
            Thread.sleep(50000);
        }
        Thread.sleep(4000);

        WebElement adTextSelect = driver.findElement(adText);
        adTextSelect.sendKeys("Emirhan");
        driver.getKeyboard().sendKeys(Keys.ENTER);

        Thread.sleep(3000);

        WebElement soyadTextSelect = driver.findElement(soyadText);
        soyadTextSelect.sendKeys("Aktaş");
        driver.getKeyboard().sendKeys(Keys.ENTER);

        Thread.sleep(3000);

        WebElement kaydetButtonSelect = driver.findElement(kaydetButton);
        kaydetButtonSelect.click();

        Thread.sleep(3000);

    }

    @AfterMethod
    public void teardown(){
        driver.quit();
    }
}