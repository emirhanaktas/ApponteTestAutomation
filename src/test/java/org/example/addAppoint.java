package org.example;

import io.appium.java_client.*;
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

public class addAppoint {

    public AppiumDriver<WebElement> driver;

    public MobileDriver<MobileElement> driverMobile;

    public WebDriverWait wait;

    By consultantButton = By.id("mobi.appcent.apponte:id/btnInstitutional");

    By loginButton = By.id("mobi.appcent.apponte:id/ibSignIn");

    By numberText = By.id("mobi.appcent.apponte:id/etPhoneNumber");

    By sendCodeButton = By.id("mobi.appcent.apponte:id/btnSendCode");

    By otpSendCodeButton = By.id("mobi.appcent.apponte:id/btnOTPContinue");

    By addClientButton = By.id("mobi.appcent.apponte:id/appointmentFragmentIcon");

    By addPersonButton = By.id("mobi.appcent.apponte:id/profileEditImgBox");

    By nameText = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText");

    By surnameText = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText");

    By phoneText = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText");

    By clientSaveButton = By.id("mobi.appcent.apponte:id/btnSave");

    By searchText = By.id("mobi.appcent.apponte:id/search_src_text");

    By homeButton = By.id("mobi.appcent.apponte:id/homeFragmentIcon");

    By addButton = By.xpath("//android.widget.FrameLayout[@content-desc=\"Add\"]");

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

    public void test() throws InterruptedException {

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement consultantSelect = driver.findElement(consultantButton);
        consultantSelect.click();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement loginSelect = driver.findElement(loginButton);
        loginSelect.click();


        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement phoneNumberSelect = driver.findElement(numberText);
        driver.getKeyboard().pressKey("5372448046");

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement sendCodeSelect = driver.findElement(sendCodeButton);
        sendCodeSelect.click();

        Thread.sleep(10000);

        WebElement otpSendCodeSelect = driver.findElement(otpSendCodeButton);
        otpSendCodeSelect.click();

        //driver.findElement(By.id("mobi.appcent.apponte:id/btnOTPContinue")).click();

        Thread.sleep(1000);

    }

    @Test

    public void consuletee() throws InterruptedException {

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement consuleteeSelect = driver.findElement(addClientButton);
        consuleteeSelect.click();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement addButtonSelect = driver.findElement(addPersonButton);
        addButtonSelect.click();

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        WebElement nameSelect = driver.findElement(nameText);
        nameSelect.click();
        driver.getKeyboard().sendKeys("Emirhan");

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        WebElement surnameSelect = driver.findElement(surnameText);
        surnameSelect.click();
        driver.getKeyboard().sendKeys("Aktas");

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        WebElement personNumberSelect = driver.findElement(phoneText);
        personNumberSelect.click();
        driver.getKeyboard().pressKey("5379157432");

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        WebElement personSaveSelect = driver.findElement(clientSaveButton);
        personSaveSelect.click();

        Thread.sleep(2000);

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        WebElement searchTextSelect = driver.findElement(searchText);
        searchTextSelect.click();
        driver.getKeyboard().sendKeys("E");

        // Search'e tıkla, E harfini yaz, listelenen kişi içerisinde name'i Emirhan Aktaş var ise kişiye tıkla.

        if (driver.findElementByXPath("//android.widget.TextView[@text='Emirhan Aktas']").isDisplayed()){
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            driver.findElementByXPath("//android.widget.TextView[@text='Emirhan Aktas']").click();
        }
        else{
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            driver.findElementByXPath("//android.widget.TextView[@text='Emirhan Aktas']").click();
            Thread.sleep(5000);
        }

    }

    @Test

    public void addAppointment() throws InterruptedException {

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.findElement(By.id("mobi.appcent.apponte:id/addFragmentIcon")).click();

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.findElement(By.id("mobi.appcent.apponte:id/cLAddPeople")).click();

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.findElement(By.id("mobi.appcent.apponte:id/rv_row_item")).click();

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.findElement(By.id("mobi.appcent.apponte:id/btnAddPeopleSave")).click();

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.findElement(By.id("mobi.appcent.apponte:id/clAddDate")).click();

        Thread.sleep(1000);

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        TouchAction swipe = new TouchAction(driver)
                .press(PointOption.point(502, 2116))
                .waitAction(waitOptions(ofMillis(800)))
                .moveTo(PointOption.point(502, 991))
                .release()
                .perform();


            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

            driver.findElementByXPath("//android.widget.TextView[@text='14']").click();

        if(driver.findElementByXPath("//android.widget.TextView[@text='Geçmişe yönelik randevu alınamamaktadır.']").isDisplayed() ){
            //driver.findElementByXPath("//android.widget.TextView[@text='28']")
            //Geçmişe yönelik randevu alınamamaktadır.

            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            String textNumberStr = driver.findElementByXPath("//android.widget.TextView[@text='14']").getText();
            String todayNumberStr = driver.findElementByXPath("//android.widget.TextView[@text='15']").getText();

            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            int textNumberConvert = Integer.parseInt(textNumberStr);
            int todayNumberConvert = Integer.parseInt(todayNumberStr);

            System.out.println(textNumberConvert);
            System.out.println(todayNumberConvert);


            for (int i= textNumberConvert; i<=todayNumberConvert; i++){
                textNumberConvert++;
            }

            System.out.println(textNumberConvert);
            //String textNumberString = Integer.toString(textNumberConvert);

            if (textNumberConvert>=todayNumberConvert){
                driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
               // driver.findElementByXPath("//android.widget.TextView[@text='"+textNumberConvert+"']").click();
                driver.findElementByXPath("//android.widget.TextView[@text='"+textNumberConvert+"']").click();
                Thread.sleep(5000);

                //driver.findElement(By.id("mobi.appcent.apponte:id/rvAPProgramTimes")).isDisplayed()

                driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
                driver.findElementByXPath("//android.widget.TextView[@text='10.30 - 11.00']").click();

                driver.findElement(MobileBy.AndroidUIAutomator(
                        "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(50)"));

                driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
                driver.findElement(By.id("mobi.appcent.apponte:id/btnSaveMeetingTime")).click();

                driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
                driver.findElement(By.id("mobi.appcent.apponte:id/btnAddPeopleSave")).click();

                if(driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup")).isDisplayed()){
                    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
                    driver.findElement(By.id("mobi.appcent.apponte:id/btnCustomSave")).click();
                }
                else{
                    Thread.sleep(1000);
                }

            }
            else {
                Thread.sleep(1000);
            }

        }

        else if (driver.findElementByXPath("//android.widget.TextView[@text='Randevu ekleyebilmek için randevu ayarlarına göz at.']").isEnabled()){

            //driver.findElementByXPath("//android.widget.TextView[@text='28']")
            //Randevu ekleyebilmek için randevu ayarlarına göz at.

            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            driver.findElement(By.id("mobi.appcent.apponte:id/btnBottomSheetDown")).click();

            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            driver.findElement(By.id("mobi.appcent.apponte:id/profileSettingsFragmentIcon")).click();

            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.LinearLayout")).click();

            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            driver.findElement(By.id("mobi.appcent.apponte:id/rlWorkAndBreakSetter")).click();

            for (int i=0; i<=6; i++){
                driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
                driver.findElement(By.id("mobi.appcent.apponte:id/hb_add_work_btn")).click();

                driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
                driver.findElement(By.id("mobi.appcent.apponte:id/hbAddBreakButton")).click();
            }

            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

            TouchAction swipe2 = new TouchAction(driver)
                    .press(PointOption.point(795, 1882))
                    .waitAction(waitOptions(ofMillis(800)))
                    .moveTo(PointOption.point(795, 382))
                    .release()
                    .perform();

            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            driver.findElement(By.id("mobi.appcent.apponte:id/hbSaveBtn")).click();


            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            driver.findElement(By.id("mobi.appcent.apponte:id/toolbarBackBtn")).click();

            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            driver.findElement(By.id("mobi.appcent.apponte:id/rlPlanCustomerAppointmentDetail")).click();

            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.FrameLayout/android.widget.Spinner")).click();

            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[3]")).click();

            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.FrameLayout/android.widget.Spinner")).click();

            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[3]")).click();

            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/android.widget.FrameLayout/android.widget.Spinner")).click();

            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/android.widget.FrameLayout/android.widget.Spinner")).click();

            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]")).click();

            TouchAction swipe3 = new TouchAction(driver)
                    .press(PointOption.point(560, 1922))
                    .waitAction(waitOptions(ofMillis(800)))
                    .moveTo(PointOption.point(560, 567))
                    .release()
                    .perform();

            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            driver.findElement(By.id("mobi.appcent.apponte:id/btnProfileSettingSave")).click();
        }

        else if(driver.findElementByXPath("//android.widget.TextView[@text='10.30 - 11.00']").isDisplayed()){
            //eğer randevu ayarları hazırsa
            //driver.findElement(By.id("mobi.appcent.apponte:id/rvAPProgramTimes")).isDisplayed()

            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            driver.findElementByXPath("//android.widget.TextView[@text='10.30 - 11.00']").click();

            driver.findElement(MobileBy.AndroidUIAutomator(
                    "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(50)"));

            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            driver.findElement(By.id("mobi.appcent.apponte:id/btnSaveMeetingTime"));

            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            driver.findElement(By.id("mobi.appcent.apponte:id/btnAddPeopleSave"));

            if(driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup")).isDisplayed()){
                driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
                driver.findElement(By.id("mobi.appcent.apponte:id/btnCustomSave"));
            }
            else{
                Thread.sleep(1000);
            }
        }

        else {
            Thread.sleep(10000);
        }

    }

    @AfterMethod
    public void teardown(){
        driver.quit();
    }


}
