package org.example;

import io.appium.java_client.AppiumDriver;
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
import java.util.concurrent.TimeUnit;

public class Consultee {

    public AppiumDriver<WebElement> driver;

    public WebDriverWait wait;

    By consultantButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.Button[2]");

    By addButton = By.xpath("//android.widget.FrameLayout[@content-desc=\"Add\"]");

    By appointmentTab = By.xpath("//android.widget.FrameLayout[@content-desc=\"Appointment\"]");

    By appointmentAddButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout");

    By nameText = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText");

    By surnameText = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText");

    By telephoneNumberText = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText");

    By kaydetButton2 = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.Button[1]");

    By codeShareButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.Button[2]");

    By shareCopyButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout");

    By codeShareButtonId = By.id("mobi.appcent.apponte:id/btnCustomShare");

    By consulteeCardButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]");

    By pastConversationButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout/android.widget.TextView[2]");

    By deleteButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.ScrollView/android.view.ViewGroup/android.widget.ImageView[2]");

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

        driver.manage().timeouts().implicitlyWait(1500, TimeUnit.SECONDS);

        WebElement appointmentSelect = driver.findElement(appointmentTab);
        appointmentSelect.click();

        driver.manage().timeouts().implicitlyWait(30000, TimeUnit.SECONDS);

        WebElement addAppointmentSelect = driver.findElement(appointmentAddButton);
        addAppointmentSelect.click();

        driver.manage().timeouts().implicitlyWait(30000, TimeUnit.SECONDS);

        WebElement nameTextSelect = driver.findElement(nameText);
        nameTextSelect.sendKeys("Emirhan");
        driver.getKeyboard().sendKeys(Keys.ENTER);

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement surnameTextSelect = driver.findElement(surnameText);
        surnameTextSelect.sendKeys("Aktaş");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement numberTextSelect = driver.findElement(telephoneNumberText);
        numberTextSelect.click();
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

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement kaydetButtonSelect = driver.findElement(kaydetButton2);
        kaydetButtonSelect.click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement codeShareSelect = driver.findElement(codeShareButton);
        codeShareSelect.click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement shareCopySelect = driver.findElement(shareCopyButton);
        shareCopySelect.click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement consulteeCardSelect = driver.findElement(consulteeCardButton);
        consulteeCardSelect.click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        WebElement pastConversationSelect = driver.findElement(pastConversationButton);
        pastConversationSelect.click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }

    @AfterMethod
    public void teardown(){
        driver.quit();
    }
}

