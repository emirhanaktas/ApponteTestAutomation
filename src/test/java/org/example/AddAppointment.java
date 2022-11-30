package org.example;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static java.time.Duration.ofMillis;

public class AddAppointment extends ExtendTestReports {

    public AppiumDriver<WebElement> driver;

    public WebDriverWait wait;




    By addButton = By.xpath("//android.widget.FrameLayout[@content-desc=\"Add\"]");

    By addPersonButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]");

    By addDateButton = By.id("mobi.appcent.apponte:id/clAddDate");

    By saveButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.Button");

    By testPerson = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]");

    By addDaySelect = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[23]/android.widget.TextView");

    By addClock = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[6]/android.widget.TextView");

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

        ExtentTest test = extent2.createTest("Appointment Test", "Appointment test case");

        test.log(Status.INFO, "Randevu Ekle Testi başladı!");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement addButtonSelect = driver.findElement(addButton);
        addButtonSelect.click();

        test.log(Status.INFO, "Ekle butonuna tıklandı!");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement addPersonSelect = driver.findElement(addPersonButton);
        addPersonSelect.click();

        test.log(Status.INFO, "Kişi ekle butonuna tıklandı!");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement testPersonSelect = driver.findElement(testPerson);
        testPersonSelect.click();

        test.log(Status.INFO, "Kişi seçimi yapıldı!");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement saveButtonSelect = driver.findElement(saveButton);
        saveButtonSelect.click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement addDateSelect = driver.findElement(addDateButton);
        addDateSelect.click();

        test.log(Status.INFO, "Tarih seçimi yapıldı!");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement addDay = driver.findElement(addDaySelect);
        addDay.click();

        test.log(Status.INFO, "Gün seçimi yapıldı!");

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        TouchAction swipe = new TouchAction(driver)
                .press(PointOption.point(603,2063))
                .waitAction(waitOptions(ofMillis(800)))
                .moveTo(PointOption.point(597,1017))
                .release()
                .perform();

        test.log(Status.INFO, "Ekran scroll edildi!");

        WebElement addClockSelect = driver.findElement(addClock);
        addClockSelect.click();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        test.log(Status.INFO, "Saat seçimi yapıldı!");

        driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(50)"));

        test.log(Status.INFO, "Ekran scroll edildi!");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement saveMeetingTimeSelect = driver.findElement(saveMeetingTime);
        saveMeetingTimeSelect.click();

        test.log(Status.INFO, "Kaydet butonuna basıldı!");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement saveButtonSelect1 = driver.findElement(saveButton);
        saveButtonSelect1.click();

        test.log(Status.INFO, "Kaydet butonuna basıldı!");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement meetPopUp = driver.findElement(meetPopUpPath);
        if (meetPopUp.isDisplayed()){
                WebElement costumSave = driver.findElement(costumSaveButton);
                costumSave.click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            test.log(Status.INFO, "Kaydet butonuna basıldı!");

            }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        test.log(Status.INFO, "Test Tamamlandı!");

    }

    @AfterMethod
    public void teardown(){
        driver.quit();
    }
}