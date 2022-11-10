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
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ConsultantProfileSettings {
    public AppiumDriver<WebElement> driver;

    public WebDriverWait wait;

    By profileButton = By.xpath("//android.widget.FrameLayout[@content-desc=\"Profile Settings\"]");

    By profileSettings = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.LinearLayout");

    By meetSettings = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.LinearLayout");

    By notificationSettings = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout[3]/android.widget.LinearLayout");

    By codeShare = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout[4]/android.widget.LinearLayout");

    By backButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.LinearLayout/android.widget.ImageView");

    By backButton2 = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/android.widget.ImageView");

    By clockSettings = By.id("mobi.appcent.apponte:id/rlWorkAndBreakSetter");

    By addDayButton = By.id("mobi.appcent.apponte:id/hb_add_work_btn");

    By meetSaveButton = By.id("mobi.appcent.apponte:id/hbSaveBtn");

    By workingDays = By.id("mobi.appcent.apponte:id/rvWorkingDays");

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

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement profileButtonSelect = driver.findElement(profileButton);
        profileButtonSelect.click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement profileSettingsSelect = driver.findElement(profileSettings);
        profileSettingsSelect.click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement backButtonSelect = driver.findElement(backButton);
        backButtonSelect.click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement meetSettingsSelect = driver.findElement(meetSettings);
        meetSettingsSelect.click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement backButtonSelect2 = driver.findElement(backButton2);
        backButtonSelect2.click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement notificationSettingsSelect = driver.findElement(notificationSettings);
        notificationSettingsSelect.click();

        driver.manage().timeouts().implicitlyWait(105, TimeUnit.SECONDS);

        WebElement backButtonSelect4 = driver.findElement(backButton);
        backButtonSelect4.click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement codeShareSelect = driver.findElement(codeShare);
        codeShareSelect.click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test

    public void appointmentSettingsTest(){

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement profileButtonSelect = driver.findElement(profileButton);
        profileButtonSelect.click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement meetSettingsSelect = driver.findElement(meetSettings);
        meetSettingsSelect.click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement clockSettingsSelect = driver.findElement(clockSettings);
        clockSettingsSelect.click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement dayAddButton = driver.findElement(addDayButton);

        for (int i=0; i<6; i++){
            dayAddButton.click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }


        driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(50)"));


        WebElement saveButtonSelect = driver.findElement(meetSaveButton);
        saveButtonSelect.click();


    }

    @AfterTest
    public void teardown(){
        driver.quit();
    }
}
