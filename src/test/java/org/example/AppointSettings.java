package org.example;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class AppointSettings {

    public AppiumDriver<WebElement> driver;
    public WebDriverWait wait;

    By profileTab = By.xpath("//android.widget.FrameLayout[@content-desc=\"Profile Settings\"]");

    By appointSettings = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.LinearLayout");


    @BeforeTest

    public void setup() throws MalformedURLException {

        try{
            DesiredCapabilities cap;
            cap = new DesiredCapabilities();

            cap.setCapability("deviceName", "Pixel 4 API 29");
            cap.setCapability("platformName", "Android");
            cap.setCapability("udid", "emulator-5554");
            cap.setCapability("platformVersion", "10.0");
            cap.setCapability("appPackage", "mobi.appcent.apponte");
            cap.setCapability("appActivity", "mobi.appcent.apponte.ui.activity.home.HomeActivity");
            cap.setCapability("skipUnlock", "true");
            cap.setCapability("noReset", "true");

            driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
            wait = new WebDriverWait(driver,10);
        }catch (MalformedURLException mx){
            System.out.println("Hatalı giriş, tekrar deneyiniz.");
        }

    }


    @Test

    public void test() throws InterruptedException {

        Thread.sleep(2000);

        WebElement profileTabSelect = driver.findElement(profileTab);
        profileTabSelect.click();

        Thread.sleep(2000);


        WebElement appointSettingsSelect = driver.findElement(appointSettings);
        appointSettingsSelect.click();

        Thread.sleep(5000);

    }

    @AfterTest

    public  void teardown(){
        driver.quit();
    }

}
