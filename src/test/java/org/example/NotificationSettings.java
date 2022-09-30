package org.example;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.MalformedInputException;
import java.util.concurrent.TimeUnit;

public class NotificationSettings {

    public AppiumDriver<WebElement> driver;
    public WebDriverWait wait;

    By profileId = By.id("mobi.appcent.apponte:id/profileSettingsFragmentIcon");

    By notificationSettingsId = By.id("mobi.appcent.apponte:id/cvNotificationSettings");

    By rememberSwitchId = By.id("mobi.appcent.apponte:id/ns_remember_switch");

    By notificationsId = By.id("mobi.appcent.apponte:id/ns_notifications_switch");

    By saveButtonId = By.id("mobi.appcent.apponte:id/btnSave");

   // By cancelButtonId = By.id("mobi.appcent.apponte:id/btnCancel");

    By toolbarBackButtonId = By.id("mobi.appcent.apponte:id/toolbarBackBtn");

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

            driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
            wait = new WebDriverWait(driver, 10);

        } catch (MalformedURLException mx){
            System.out.println("Hatalı oluşturulmuş URL İstisnası!");
        }

    }


    @Test

    public void test() throws InterruptedException {

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement profileTab = driver.findElement(profileId);
        profileTab.click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement notificationSettings = driver.findElement(notificationSettingsId);
        notificationSettings.click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement rememberSwitch = driver.findElement(rememberSwitchId);
        rememberSwitch.click();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement notificationSwitch = driver.findElement(notificationsId);
        notificationSwitch.click();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement saveButton = driver.findElement(saveButtonId);
        saveButton.click();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        Assert.assertTrue(saveButton.isDisplayed());

        Thread.sleep(2000);

        //Bu alanda emulator/gercek cihaz calistirdiginizda switchler calismayacaktir. Bu switchler test case'de acili kalması zorunlu alanlardir. Bu sebepten testte bir yanlislik oldugu dusunulmemeli.

    }

    @AfterTest

    public void teardown(){
        driver.quit();
    }
}
