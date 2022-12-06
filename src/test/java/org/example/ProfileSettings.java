package org.example;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class ProfileSettings {
    public AppiumDriver<WebElement> driver;

    public WebDriverWait wait;


    By profileButton = By.xpath("//android.widget.FrameLayout[@content-desc=\"Profile Settings\"]");

    By profileSettings = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.LinearLayout");

    By companyNameText = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText");

    By webSiteText = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText");

    By phoneNumber = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText");

    By adressInfo = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText");


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
            cap.setCapability("appActivity", "mobi.appcent.apponte.ui.activity.home.HomeActivity");
            cap.setCapability("skipUnlock", "true");
            cap.setCapability("noReset", "true");

            driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
            wait = new WebDriverWait(driver,10);

        }catch (MalformedURLException mx){
            System.out.println("Hatalı oluşturulmuş URL İstisnası!");

        }

    }

    @Test

    public void test() throws InterruptedException{

        Thread.sleep(5000);

        WebElement profileButtonSelect = driver.findElement(profileButton);
        profileButtonSelect.click();

        Thread.sleep(4000);

        WebElement profileSettingsSelect = driver.findElement(profileSettings);
        profileSettingsSelect.click();

        Thread.sleep(2000);

        WebElement companyNameSelect = driver.findElement(companyNameText);
        companyNameSelect.click();
        companyNameSelect.clear();
        companyNameSelect.sendKeys("Appcent Akademi");
        driver.getKeyboard().sendKeys(Keys.ENTER);

        Thread.sleep(2000);

        WebElement webSiteSelect = driver.findElement(webSiteText);
        webSiteSelect.sendKeys("www.appcent.mobi");
        driver.getKeyboard().sendKeys(Keys.ENTER);

        Thread.sleep(2000);

        WebElement phoneNumberSelect = driver.findElement(phoneNumber);
        phoneNumberSelect.click();
        driver.getKeyboard().pressKey("5555555555");


        Thread.sleep(2000);

        WebElement adressSelect = driver.findElement(adressInfo);
       // adressSelect.sendKeys("Örnek Mahallesi, Örnek Sokak");
        adressSelect.sendKeys("Örnek Mahallesi, Örnek Sokak, No:1");
        driver.getKeyboard().pressKey(Keys.ENTER);

        Thread.sleep(10000);

    }




    @AfterTest
    public void teardown(){
        driver.quit();
    }
}
