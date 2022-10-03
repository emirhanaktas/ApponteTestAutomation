package org.example;

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
import java.util.Scanner;

public class AddAppointment {

    public AppiumDriver<WebElement> driver;

    public WebDriverWait wait;

    By consultantButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.Button[2]");

    By loginButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.Button[2]");

    By phoneNumberText = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText");

    By codeButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button");

    By continueButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[3]/android.widget.Button");

    By addButton = By.xpath("//android.widget.FrameLayout[@content-desc=\"Add\"]");

    By addPersonButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]");

    By addDateButton = By.id("mobi.appcent.apponte:id/clAddDate");

    By saveButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.Button");

    By testPerson = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]");

    By addDaySelect = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[25]/android.widget.TextView");

    By addClock = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]/android.widget.TextView");

    By saveMeetingTime = By.id("mobi.appcent.apponte:id/btnSaveMeetingTime");

    By meetPopUpPath = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup");

    By costumSaveButton = By.id("mobi.appcent.apponte:id/btnCustomSave");

    By costumCancelButton = By.id("mobi.appcent.apponte:id/btnCustomCancel");

    By pageCloseButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.ImageButton");

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

        WebElement addButtonSelect = driver.findElement(addButton);
        addButtonSelect.click();

        Thread.sleep(3000);

        WebElement addPersonSelect = driver.findElement(addPersonButton);
        addPersonSelect.click();

        Thread.sleep(2000);

        WebElement testPersonSelect = driver.findElement(testPerson);
        testPersonSelect.click();

        Thread.sleep(2000);

        WebElement saveButtonSelect = driver.findElement(saveButton);
        saveButtonSelect.click();

        WebElement addDateSelect = driver.findElement(addDateButton);
        addDateSelect.click();

        Thread.sleep(2000);


        WebElement addDay = driver.findElement(addDaySelect);
        addDay.click();

        Thread.sleep(2000);

        driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(50)"));

        Thread.sleep(6000);

        WebElement addClockSelect = driver.findElement(addClock);
        addClockSelect.click();

        Thread.sleep(3000);

        driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(50)"));
        Thread.sleep(7000);

        WebElement saveMeetingTimeSelect = driver.findElement(saveMeetingTime);
        saveMeetingTimeSelect.click();

        Thread.sleep(4000);

        WebElement saveButtonSelect1 = driver.findElement(saveButton);
        saveButtonSelect1.click();

        Thread.sleep(3000);

        WebElement meetPopUp = driver.findElement(meetPopUpPath);
        if (meetPopUp.isDisplayed()){
                WebElement costumSave = driver.findElement(costumSaveButton);
                costumSave.click();
                Thread.sleep(2000);
            }

 /*
        String secim;
        System.out.println("Ana Sayfa: 1, Değiştir: 2");
        Scanner keyb = new Scanner(System.in);
        secim = keyb.nextLine();

        Thread.sleep(1000);

        if (meetPopUp.isDisplayed()){
            if (secim=="1"){
                WebElement costumSave = driver.findElement(costumSaveButton);
                costumSave.click();
                Thread.sleep(2000);
            }
            else{
                WebElement costumCancel = driver.findElement(costumCancelButton);
                costumCancel.click();
                Thread.sleep(2000);
            }
        }
        */


        Thread.sleep(2000);



    }

    @AfterMethod
    public void teardown(){
        driver.quit();
    }
}