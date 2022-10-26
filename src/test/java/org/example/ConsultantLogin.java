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

    By signUpPopUp = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup");

    By signUpButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.Button[2]");

    By nameText = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.EditText");

    By surnameText = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.EditText");

    By kaydetButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[5]/android.widget.Button[1]");

    By companyText = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[3]/android.widget.EditText");

    By mainPage = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout");

    By addButton = By.xpath("//android.widget.FrameLayout[@content-desc=\"Add\"]");

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
            System.out.println("Hatalı oluşturulmuş URL İstisnası!");

        }

    }

    @Test

    public void test() throws InterruptedException{

        ExtentTest test1 = extent.createTest("Login Test", "Login test case");

        test1.log(Status.INFO, "Login test başladı!");

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement consultantSelect = driver.findElement(consultantButton);
        consultantSelect.click();

        test1.log(Status.PASS, "Kurumsal seçimi yapıldı!");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement loginSelect = driver.findElement(loginButton);
        loginSelect.click();

        test1.log(Status.PASS, "Giriş yap seçimi yapıldı!");

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement phoneNumberTextSelect = driver.findElement(phoneNumberText);
        driver.getKeyboard().pressKey("5");
        driver.getKeyboard().pressKey("3");
        driver.getKeyboard().pressKey("7");
        driver.getKeyboard().pressKey("2");
        driver.getKeyboard().pressKey("4");
        driver.getKeyboard().pressKey("4");
        driver.getKeyboard().pressKey("8");
        driver.getKeyboard().pressKey("0");
        driver.getKeyboard().pressKey("4");
        driver.getKeyboard().pressKey("6");

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        test1.log(Status.PASS, "Telefon numarası girişi yapıldı!");

        WebElement codeButtonSelect = driver.findElement(codeButton);
        codeButtonSelect.click();

        Thread.sleep(10000);

        test1.log(Status.PASS, "Kod gönder butonuna basıldı!");

        //Manuel OTP girisi yapılacak.

        WebElement continueButtonSelect = driver.findElement(continueButton);
        continueButtonSelect.click();

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        test1.log(Status.PASS, "OTP girişi yapıldı!");
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
            surnameTextSelect.sendKeys("Aktaş");

            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

            test1.log(Status.PASS, "Login test devam ediyor!");

            WebElement companyTextSelect = driver.findElement(companyText);
            companyTextSelect.sendKeys("Appcent Danışmanlık");

            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

            test1.log(Status.PASS, "Login test devam ediyor!");

            WebElement saveButtonSelect2 = driver.findElement(kaydetButton);
            saveButtonSelect2.click();

            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            test1.log(Status.PASS, "Login test tamamlandı!");
        }
        else if(mainPageDisplay.isDisplayed()){
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            WebElement addButtonSelect = driver.findElement(addButton);
            addButtonSelect.click();
            test1.log(Status.PASS, "Login test tamamlandı!");
        }
*/
        test1.log(Status.INFO, "Login test tamamlandı!");

    }

    @AfterTest
    public void teardown(){
        driver.quit();
    }
}
