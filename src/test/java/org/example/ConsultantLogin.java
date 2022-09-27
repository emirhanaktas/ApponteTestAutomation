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

public class ConsultantLogin {
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

    By saveButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[4]/android.widget.Button[1]");

    By kaydetButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[5]/android.widget.Button[1]");

    By companyText = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[3]/android.widget.EditText");

    By mainPage = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout");

    By homeMessage = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView[2]");

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

        Thread.sleep(2500);

        WebElement consultantSelect = driver.findElement(consultantButton);
        consultantSelect.click();

        Thread.sleep(1500);

        WebElement loginSelect = driver.findElement(loginButton);
        loginSelect.click();

        Thread.sleep(1500);

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

        Thread.sleep(2000);

        WebElement codeButtonSelect = driver.findElement(codeButton);
        codeButtonSelect.click();

        Thread.sleep(10000);

        //Manuel OTP girisi yapılacak.

        WebElement continueButtonSelect = driver.findElement(continueButton);
        continueButtonSelect.click();

        Thread.sleep(5000);

        WebElement signUpPopUpDisplay = driver.findElement(signUpPopUp);
        WebElement mainPageDisplay = driver.findElement(mainPage);

        if (signUpPopUpDisplay.isDisplayed()){

            Thread.sleep(1000);

            WebElement signUpButtonSelect = driver.findElement(signUpButton);
            signUpButtonSelect.click();

            Thread.sleep(10000);

            WebElement nameTextSelect = driver.findElement(nameText);
            nameTextSelect.sendKeys("Emirhan");
            driver.getKeyboard().sendKeys(Keys.ENTER);

            Thread.sleep(2000);

            WebElement surnameTextSelect = driver.findElement(surnameText);
            surnameTextSelect.sendKeys("Aktaş");

            Thread.sleep(2000);

            WebElement companyTextSelect = driver.findElement(companyText);
            companyTextSelect.sendKeys("Appcent Danışmanlık");

            Thread.sleep(2000);

            WebElement saveButtonSelect2 = driver.findElement(kaydetButton);
            saveButtonSelect2.click();

            Thread.sleep(5000);
        }
        else if(mainPageDisplay.isDisplayed()){
            Thread.sleep(5000);
            WebElement addButtonSelect = driver.findElement(addButton);
            addButtonSelect.click();
        }

    }

    @AfterMethod
    public void teardown(){
        driver.quit();
    }
}
