package org.example;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class ClientProfileSettings {

    public AppiumDriver<WebElement> driver;

    public WebDriverWait wait;


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
        cap.setCapability("appActivity", "mobi.appcent.apponte.ui.activity.home.HomeActivity");
        cap.setCapability("skipUnlock", "true");
        cap.setCapability("noReset", "false");

        driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
        wait = new WebDriverWait(driver,10);

    }catch (
    MalformedURLException mx){
        System.out.println("Hatalı oluşturulmuş URL İstisnası!");

    }}

    @Test

    public void test() throws InterruptedException {

        Thread.sleep(15000);

    }



    @AfterTest
    public void teardown(){
        driver.quit();
    }
}
