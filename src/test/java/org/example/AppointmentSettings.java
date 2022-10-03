package org.example;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
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

public class AppointmentSettings {

    public AppiumDriver<WebElement> driver;

    public WebDriverWait wait;

    By profileButton = By.xpath("//android.widget.FrameLayout[@content-desc=\"Profile Settings\"]");

    By meetSettings = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.LinearLayout");

    By backButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.LinearLayout/android.widget.ImageView");

    By workDayButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout[1]");

    By daySelectButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.RelativeLayout[1]/android.widget.Button");

    By daySelectId = By.id("mobi.appcent.apponte:id/hb_add_work_btn");

    By restTimeButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.RelativeLayout[2]/android.widget.Button");

    By restTimeId = By.id("mobi.appcent.apponte:id/hbAddBreakButton");

    By workWayButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout[2]");

    By saveButtonId = By.id("mobi.appcent.apponte:id/hbSaveBtn");

    By automaticMessageId = By.id("mobi.appcent.apponte:id/rlAutoMessages");

    By workOffDay = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout[3]");

    By meetDetailButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout[3]");

    By onlineSessionId = By.id("mobi.appcent.apponte:id/cbOnlineSession");

    By faceToFaceSessionId = By.id("mobi.appcent.apponte:id/cbFaceToFaceSession");

    By workTypeSaveId = By.id("mobi.appcent.apponte:id/btnWorkTypeSave");

    By confirmAddId = By.id("mobi.appcent.apponte:id/btnConfirmAdd");

    By denyAddId = By.id("mobi.appcent.apponte:id/btnDenyAdd");

    By confirmTextId = By.id("mobi.appcent.apponte:id/etConfirmMessage");

    By denyTextId = By.id("mobi.appcent.apponte:id/etDenyMessage");

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

    public void test() throws InterruptedException {

        Thread.sleep(5000);

        WebElement profileButtonSelect = driver.findElement(profileButton);
        profileButtonSelect.click();

        Thread.sleep(4000);


        WebElement meetSettingsSelect = driver.findElement(meetSettings);
        meetSettingsSelect.click();

        Thread.sleep(2000);

        WebElement workDaySelect = driver.findElement(workDayButton);
        workDaySelect.click();

        Thread.sleep(2000);

        for (int i=0; i<7; i++){

            WebElement daySelect = driver.findElement(daySelectButton);
            daySelect.click();

            Thread.sleep(2000);
        }

        Thread.sleep(3000);

        driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(50)"));

        Thread.sleep(5000);

        /* WebElement restTimeSelect2  = driver.findElement(restTimeId);
        restTimeSelect2.click();

        Thread.sleep(3000); */

        for (int j=0; j<7; j++){

            WebElement restTimeSelect  = driver.findElement(restTimeId);
            restTimeSelect.click();

            Thread.sleep(2000);

            driver.findElement(MobileBy.AndroidUIAutomator(
                    "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(50)"));

            Thread.sleep(1500);

        }

        Thread.sleep(5000);


        WebElement backButtonSelect = driver.findElement(saveButtonId);
        backButtonSelect.click();

        Thread.sleep(2000);


       WebElement workWaySelect = driver.findElement(workWayButton);
        workWaySelect.click();

        Thread.sleep(2000);


       WebElement onlineSession = driver.findElement(onlineSessionId);
       onlineSession.click();

       Thread.sleep(2000);

       WebElement faceToFaceSession = driver.findElement(faceToFaceSessionId);
       faceToFaceSession.click();

       Thread.sleep(2000);
       
       WebElement workTypeSave = driver.findElement(workTypeSaveId);
       workTypeSave.click();

       Thread.sleep(4000);

        WebElement automaticMessageSelect = driver.findElement(automaticMessageId);
        automaticMessageSelect.click();

        Thread.sleep(3000);

        WebElement confirmText = driver.findElement(confirmAddId);
        confirmText.click();

        Thread.sleep(2000);

        driver.getKeyboard().pressKey("Randevunuz başarıyla oluşturulmuştur!");
        //!!!!!

        Thread.sleep(10000);

/*

        WebElement workOffDaySelect = driver.findElement(workOffDay);
        workOffDaySelect.click();

        Thread.sleep(2000);

        WebElement meetDetailSelect = driver.findElement(meetDetailButton);
        meetDetailSelect.click();

        Thread.sleep(2000);

        Thread.sleep(50000); */



    }

    @AfterTest
    public void teardown(){
        driver.quit();
    }
}
