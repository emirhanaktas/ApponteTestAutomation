package org.example;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
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
import java.util.concurrent.TimeUnit;

public class ConsultantLogin extends ExtendTestReports{

    public AppiumDriver<WebElement> driver;

    public WebDriverWait wait;

    By consultantButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.Button[2]");

    By loginButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.Button[2]");

    By phoneNumberText = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText");

    By codeButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button");

    By continueButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[3]/android.widget.Button");


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
            cap.setCapability("appActivity", "mobi.appcent.apponte.ui.activity.login.LoginActivity");
            cap.setCapability("skipUnlock", "true");
            cap.setCapability("noReset", "false");

            driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
            wait = new WebDriverWait(driver,10);

        }catch (MalformedURLException mx){
            System.out.println("Hatal?? olu??turulmu?? URL ??stisnas??!");

        }

    }

    @Test

    public void test() throws InterruptedException{

        ExtentTest test1 = extent.createTest("Login Test", "Login test case");

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement consultantSelect = driver.findElement(consultantButton);
        consultantSelect.click();

        test1.log(Status.PASS, "Kurumsal se??imi yap??ld??!");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement loginSelect = driver.findElement(loginButton);
        loginSelect.click();

        test1.log(Status.PASS, "Giri?? yap se??imi yap??ld??!");

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement phoneNumberTextSelect = driver.findElement(phoneNumberText);
        driver.getKeyboard().pressKey("5555555555");


        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        test1.log(Status.PASS, "Telefon numaras?? giri??i yap??ld??!");

        WebElement codeButtonSelect = driver.findElement(codeButton);
        codeButtonSelect.click();

        Thread.sleep(10000);

        test1.log(Status.PASS, "Kod g??nder butonuna bas??ld??!");

        //Manuel OTP girisi yap??lacak.

        WebElement continueButtonSelect = driver.findElement(continueButton);
        continueButtonSelect.click();

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        test1.log(Status.PASS, "OTP giri??i yap??ld??!");
/*
        WebElement signUpPopUpDisplay = driver.findElement(signUpPopUp);
        WebElement mainPageDisplay = driver.findElement(mainPage);

        test1.log(Status.PASS, "Login test devam ediyor!");

        if (signUpPopUpDisplay.isDisplayed()){

            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            WebElement signUpButtonSelect = driver.findElement(signUpButton);
            signUpButtonSelect.click();

            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            test1.log(Status.PASS, "Login test devam ediyor!");

            WebElement nameTextSelect = driver.findElement(nameText);
            nameTextSelect.sendKeys("Emirhan");
            driver.getKeyboard().sendKeys(Keys.ENTER);

            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

            test1.log(Status.PASS, "Login test devam ediyor!");

            WebElement surnameTextSelect = driver.findElement(surnameText);
            surnameTextSelect.sendKeys("Akta??");

            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

            test1.log(Status.PASS, "Login test devam ediyor!");

            WebElement companyTextSelect = driver.findElement(companyText);
            companyTextSelect.sendKeys("Appcent Dan????manl??k");

            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

            test1.log(Status.PASS, "Login test devam ediyor!");

            WebElement saveButtonSelect2 = driver.findElement(kaydetButton);
            saveButtonSelect2.click();

            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            test1.log(Status.PASS, "Login test tamamland??!");
        }
        else if(mainPageDisplay.isDisplayed()){
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            WebElement addButtonSelect = driver.findElement(addButton);
            addButtonSelect.click();
            test1.log(Status.PASS, "Login test tamamland??!");
        }
*/
        test1.log(Status.INFO, "Login test tamamland??!");

    }

    @AfterTest
    public void teardown(){
        driver.quit();
    }
}
